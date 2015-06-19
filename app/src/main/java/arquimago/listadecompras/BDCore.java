package arquimago.listadecompras;

import android.content.ContentValues;
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
        popular(bd);
    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int oldVersion, int newVersion) {
        bd.execSQL("drop table itens");
        onCreate(bd);
    }

    private void popular(SQLiteDatabase bd){
        Item item = new Item();
        item.setComprar(false);
        item.setNome("Canela"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Pimenta do reino"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Molho de Pimenta"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Ervas Frescas"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Manjericão"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Orégano"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Azeite de Oliva"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Queijo Ralado"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Mostarda"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Catchup"); item.setCategoria(1); inserir(item, bd);
        item.setNome("Sal"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Arroz"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Feijão"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Macarrão"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Farinha de Trigo"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Farinha de Mandioca"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Fermento"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Óleo vegetal"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Creme de leite"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Leite Condesado"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Caldo pronto"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Molho de Tomate"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Extrato de Tomate"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Carne"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Peixe"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Frango"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Carne moída"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Kibe"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Nuggets"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Almondegas"); item.setCategoria(2); inserir(item, bd);
        item.setNome("Café em pó"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Café Solúvel"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Café em capsulas"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Achocolatado"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Leite Caixinha"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Leite em Pó"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Iogurte"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Manteiga"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Requeijão Cremoso"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Geléia"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Adoçante"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Açúcar"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Cereal Matinal"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Barrade Cereais"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Granola"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Pão"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Biscoito Doce"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Biscoito Salgado"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Queijo"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Presunto"); item.setCategoria(3); inserir(item, bd);
        item.setNome("Filtro de Café"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Guardanapos"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Papel-Toalha"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Pano de Prato"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Filme de PVC"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Papel Alumínio"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Palito de Dente"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Sacos para embalar"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Lâmpada"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Velas"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Pilhas"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Fósforos"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Prendedor de roupa"); item.setCategoria(4); inserir(item, bd);
        item.setNome("Maçã"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Laranja"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Banana Prata"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Banana da Terra"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Pera"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Limão"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Uva"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Batata"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Cenoura"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Beterraba"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Alface"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Tomate"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Rúcula"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Alho"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Cebola"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Coentro"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Cebolinha"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Abóbora"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Melancia"); item.setCategoria(5); inserir(item, bd);
        item.setNome("Detergente"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Esponja"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Palhadeaço"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Limpador multiuso"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Sabão para lava louça"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Sabão em barra"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Sabão em pó"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Sabão líquido"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Amaciante"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Água Sanitária"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Pano de chão"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Lustra móveis"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Limpa vidro"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Sacos de lixo"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Flanela"); item.setCategoria(6); inserir(item, bd);
        item.setNome("Sabonete"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Escova de dente"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Pasta de dente"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Fio dental"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Cotonete"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Shampoo"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Condicionador"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Hidratante"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Desodorante"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Protetor Solar"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Lenços de papel"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Lenços umidecidos"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Papel higiênico"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Algodão"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Curativos"); item.setCategoria(7); inserir(item, bd);
        item.setNome("Água Mineral"); item.setCategoria(8); inserir(item, bd);
        item.setNome("Suco"); item.setCategoria(8); inserir(item, bd);
        item.setNome("Refrigerante"); item.setCategoria(8); inserir(item, bd);
        item.setNome("Chá"); item.setCategoria(8); inserir(item, bd);
        item.setNome("Cerveja"); item.setCategoria(8); inserir(item, bd);
        item.setNome("Vinho"); item.setCategoria(8); inserir(item, bd);
        item.setNome("Ice"); item.setCategoria(8); inserir(item, bd);
    }

    private void inserir(Item item, SQLiteDatabase bd){
        ContentValues valores = new ContentValues();
        valores.put("nome", item.getNome());
        valores.put("categoria", item.getCategoria());
        valores.put("comprar", item.isComprar()?0:1);

        bd.insert("itens",null,valores);
    }
}
