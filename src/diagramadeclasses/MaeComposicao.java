package diagramadeclasses;

public class MaeComposicao {
    private String nome;
    private Filho filho;
    
    public MaeComposicao() {
        this.filho = new Filho();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filho getFilho() {
        return filho;
    }
}
