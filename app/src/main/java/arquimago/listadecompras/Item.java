package arquimago.listadecompras;

public class Item {
    private String nome;
    private boolean comprar;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setComprar(boolean comprar){
        this.comprar=comprar;

    }

    public String getNome(){
        return this.nome;
    }

    public Boolean isComprar(){
        return this.comprar;
    }



}
