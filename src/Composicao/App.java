package src.Composicao;

public class App {
    public static void main(String args[]){
        Banco banco = new Banco();
        banco.setCodigo(55l);
        banco.setNome("Banco do Brasil");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);

        Banco banco2 = new Banco();
        banco.setCodigo(34l);
        banco.setNome("Abanca");
    }
}
