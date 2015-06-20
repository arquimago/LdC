package arquimago.listadecompras;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class Aba extends Fragment {

    static final String CATEGORIA = "categoria";
    int categoria;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            categoria = savedInstanceState.getInt(CATEGORIA);
        } else {
            categoria = getArguments().getInt(CATEGORIA);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(CATEGORIA, categoria);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RelativeLayout root = (RelativeLayout) inflater.inflate(R.layout.activity_aba, container, false);

        BD bd = new BD(getActivity());
        ArrayList<Item> lista = (ArrayList<Item>) bd.buscarCategoria(categoria);
        bd.fechar();

        ListView lv = (ListView) root.findViewById(R.id.lv);
        lv.setAdapter(new ItemAdapter(getActivity(),lista));
        return root;
    }

    public static Fragment newInstance(int categoria) {
        Aba aba = new Aba();
        Bundle b = new Bundle();
        b.putInt(CATEGORIA,categoria);
        aba.setArguments(b);
        return aba;
    }

}
