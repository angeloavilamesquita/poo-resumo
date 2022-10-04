package diagramadeclasses;

public class ContaPoupanca extends ContaBasica {
    
    @Override
    public double depositar(double valor) {
        this.saldo += valor + 1;
        return this.saldo;
    }
    
    @Override
    public double sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor - 0.5;
            return this.saldo;
        }
        return this.saldo;
    }
}
