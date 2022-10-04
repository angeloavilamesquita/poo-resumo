
package diagramadeclasses;

public class App {

    public static void main(String[] args) {
        
        /*Pessoa p1 = new Cliente();
        p1.setCpf("011.111.111-23");
        p1.setNome("Guilherme");
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Nome e Cpf" + p1.nomeComCpf());*/
        
        /*Pessoa p2 = new Funcionario();
        p2.setCpf("111.111.111-22");
        p2.setNome("Jamila");
        System.out.println("CPF: " + p2.getCpf());
        System.out.println("Nome e Cpf" + p2.nomeComCpf());*/
        
        /*Cliente c1 = new Cliente();
        c1.setNome("Cliente Preferencial");
        c1.setSaldo(100.50);*/
        
        /** sobrecarga de métodos **/
        /*Soma s1 = new Soma();
        System.out.println(s1.soma(2, 2));
        System.out.println(s1.soma(2, 2, 2));
        System.out.println(s1.soma("Nome ", "Sobrenome"));
        
        String agencia = "032-23";
        String numero = "1000-2";
        String correntista = "Correntista";
        Conta conta = new Conta();
        Conta conta2 = new Conta(agencia);
        Conta conta3 = new Conta(agencia, numero);
        Conta conta1 = new Conta(agencia, numero, correntista);*/
        
        /** Sobreposição **/
        /*ContaCorrente cc1 = new ContaCorrente();
        System.out.println(cc1.depositar(100));
        System.out.println(cc1.sacar(99));
        
        ContaPoupanca cp1 = new ContaPoupanca();
        System.out.println(cp1.depositar(100));
        System.out.println(cp1.sacar(99));
        
        ContaInvestimento ci1 = new ContaInvestimento();
        System.out.println(ci1.depositar(100));
        System.out.println(ci1.sacar(99));*/
        
        Mae mae = new Mae();
        mae.setNome("Mae");
        Filho filho = new Filho();
        filho.setNome("Filho 01");
        mae.adotar(filho);
        System.out.println("Nome da mae: " + mae.getNome());
        System.out.println("Nome do filho: " + mae.getFilho().getNome());
        
        MaeComposicao maeComposicao = new MaeComposicao();
        maeComposicao.setNome("Mae composicao");
        maeComposicao.getFilho().setNome("Filho composto");
        
        
        
    }
    
}





