public abstract  class Conta implements  IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 10;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;



    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfosComuns() {
        System.out.printf("Cliente: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
