package diagramadeclasses;

public class Mae {
    private String nome;
    private Filho filho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filho getFilho() {
        return filho;
    }
    
    public void adotar(Filho filho) {
        this.filho = filho;
    }
    
}
