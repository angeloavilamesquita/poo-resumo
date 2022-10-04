package diagramadeclasses;

public class Conta {
    private String agencia;
    private String numero;
    private String correntista;
    
    public Conta() {
        
    }
    
    public Conta(String agencia) {
        this.agencia = agencia;
    }
    
    public Conta(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
    }
    
    public Conta(String agencia, String numero, String correntista) {
        this.agencia = agencia;
        this.numero = numero;
        this.correntista = correntista;
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
}
