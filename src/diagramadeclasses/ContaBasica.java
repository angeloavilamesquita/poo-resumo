package diagramadeclasses;

public abstract class ContaBasica {
    private String agencia;
    private String numero;
    private String correntista;
    protected double saldo;
    
    public ContaBasica() {
        this.saldo = 0;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }
    
    public double depositar(double valor) {
        this.saldo += valor;
        return this.saldo;
    }
    
    public double sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return this.saldo;
        }
        return this.saldo;
    }
    
    
}
