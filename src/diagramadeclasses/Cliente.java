package diagramadeclasses;


public class Cliente extends Pessoa {
    
    private Double saldo;

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public String getPerfil() {
        return this.nome + " (" + this.saldo + ")";
    }
    
}
