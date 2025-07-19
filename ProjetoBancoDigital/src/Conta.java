public abstract  class Conta implements  IConta{
    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;



    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    public void sacar(double valor) {

    }
    public void depositar(double valor) {

    }
    public void transferir(double valor, Conta contaDestino) {

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
}
