package diagramadeclasses;

public class ContaInvestimento extends ContaBasica {
    
    @Override
    public double depositar(double valor) {
        this.saldo += valor * 1.10;
        return this.saldo;
    }
}
