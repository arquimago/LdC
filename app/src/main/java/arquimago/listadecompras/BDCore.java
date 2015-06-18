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
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL("CREATE TABLE itens(_id integer primary key autoincrement, nome text not null, categoria integer not null DEFAULT 0, comprar integer NULL DEFAULT 0))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int oldVersion, int newVersion) {
        bd.execSQL("drop table itens");
        onCreate(bd);
    }
}
