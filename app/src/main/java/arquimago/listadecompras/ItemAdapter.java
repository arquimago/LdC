package arquimago.listadecompras;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
//import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

/**
 * Created by Th on 16/06/2015.
 */
public class ItemAdapter extends BaseAdapter {

    private Context contexto;
    private ArrayList<Item> lista;

    public ItemAdapter(Context contexto, ArrayList<Item> lista){
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
    public View getView(int posicao, View convertView, ViewGroup parent){
        final Item item = lista.get(posicao);
        final View layout;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = inflater.inflate(R.layout.item, null);
        } else {
            layout = convertView;
        }

        TextView nome = (TextView) layout.findViewById(R.id.nome);
        nome.setText(item.getNome());

        final CheckBox checkBox = (CheckBox) layout.findViewById(R.id.comprar);
        checkBox.setChecked(item.isComprar());

        final BD bd = new BD(this.contexto);

        checkBox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                item.setComprar(checkBox.isChecked());
                bd.atualizar(item);
            }
        });


        return layout;
    }
}
