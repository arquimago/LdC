package arquimago.listadecompras;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Principal extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RelativeLayout root = (RelativeLayout) inflater.inflate(R.layout.activity_principal, container, false);

        ArrayList<Item> lista = new ArrayList<Item>();

        for(int i=0;i<30;i++){
            Item novo = new Item();
            novo.setNome("item "+(i+1));
            if(i%2==0){
                novo.setComprar(Boolean.TRUE);
            } else {
                novo.setComprar(Boolean.FALSE);
            }

            lista.add(novo);
        }

        ListView lv = (ListView) root.findViewById(R.id.lv);
        lv.setAdapter(new ItemAdapter(getActivity(),lista));
        return root;
    }

}
