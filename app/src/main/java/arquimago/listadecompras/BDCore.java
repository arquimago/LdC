package arquimago.listadecompras;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Th on 18/06/2015.
 */
public class BDCore extends SQLiteOpenHelper {
    private static final String NOME_BD = "compras";
    private static final int VERSAO_BD = 1;


    public BDCore(Context ctx){
        super(ctx,NOME_BD,null,VERSAO_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
