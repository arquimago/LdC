package arquimago.listadecompras;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Th on 18/06/2015.
 */
public class BD {
    private SQLiteDatabase bd;

    public BD(Context contexto){
        BDCore auxBd = new BDCore(contexto);
        bd = auxBd.getWritableDatabase();
    }

    public void inserir(Item item){
        ContentValues valores = new ContentValues();
        valores.put("nome", item.getNome());
        valores.put("categoria", item.getCategoria());
        valores.put("comprar", item.isComprar()?0:1);

        bd.insert("itens",null,valores);
    }


    public void atualizar(Item item){
        ContentValues valores = new ContentValues();
        valores.put("nome", item.getNome());
        valores.put("categoria", item.getCategoria());
        valores.put("comprar", item.isComprar()?0:1);

        bd.update("itens",valores,"_id = ?", new String[]{""+item.getId()});
    }

    public void apagar(Item item){
        bd.delete("nome", "_id = "+item.getId(), null);
    }

    public List<Item> buscar(){
        List<Item> lista = new ArrayList<Item>();
        String[] colunas = new String[]{"_id","nome","categoria","comprar"};

        Cursor cursor = bd.query("itens", colunas, null, null, null, null,"categoria ASC");

        if(cursor.getCount()>0){
            cursor.moveToFirst();

            do{
                Item i = new Item();
                int comprar = cursor.getInt(3);
                i.setId(cursor.getInt(0));
                i.setNome(cursor.getString(1));
                i.setCategoria(cursor.getInt(2));
                i.setComprar((comprar==1)?true:false);
                lista.add(i);

            }while(cursor.moveToNext());
        }

        return lista;
    }
}
