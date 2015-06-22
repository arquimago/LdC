package arquimago.listadecompras;

public class Item {
    private String nome;
    private int categoria;
    private boolean comprar;
    private long id;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setComprar(boolean comprar){
        this.comprar=comprar;

    }

    public void setCategoria(int categoria){
        this.categoria=categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public Boolean isComprar(){
        return this.comprar;
    }

    public int getCategoria() {
        return this.categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
