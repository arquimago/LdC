package arquimago.listadecompras;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Th on 21/06/2015.
 */
public class ItemEditorAdapter extends BaseAdapter {

    private Context contexto;
    private ArrayList<Item> lista;

    public ItemEditorAdapter(Context contexto, ArrayList<Item> lista){
        this.contexto=contexto;
        this.lista=lista;
    }

    @Override
    public int getCount(){
        return lista.size();
    }

    @Override
    public Object getItem(int posicao){
        return lista.get(posicao);
    }

    @Override
    public long getItemId(int posicao) {
        return 0;
    }

    @Override
    public View getView(final int posicao, View convertView, ViewGroup parent){
        final Item item = lista.get(posicao);
        final View layout;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = inflater.inflate(R.layout.item_editor, null);
        } else {
            layout = convertView;
        }

        TextView nome = (TextView) layout.findViewById(R.id.nome);
        nome.setText(item.getNome());

        Button editar = (Button) layout.findViewById(R.id.edit);
        editar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0){

            }
        });


        Button deletar = (Button) layout.findViewById(R.id.del);
        deletar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0){
                BD bd = new BD(contexto);
                bd.apagar(lista.get(posicao));
                bd.fechar();

                layout.setVisibility(View.GONE);
            }
        });





        return layout;
    }
}

