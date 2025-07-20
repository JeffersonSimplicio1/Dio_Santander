public class Main{
    public static void main(String[] args) {
        Cliente jefferson = new Cliente();
        jefferson.setNome("Jefferson");

        Conta cc = new ContaCorrente(jefferson);
        Conta poupanca = new ContaPoupanca(jefferson);

        cc.depositar(100);
        cc.sacar(20);
        cc.depositar(300);
        cc.transferir(200,poupanca);
        poupanca.sacar(50);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();





    }
}