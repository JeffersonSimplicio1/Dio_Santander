class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private double deposito;

    public ContaBancaria(int numero, String titular, double saldo, double deposito) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.deposito = deposito;
    }

    public void mostrarConta() {
        double total = saldo + deposito;
        String totalFormatado = String.format("%.2f", total);
        System.out.println("Conta #" + numero + " - Titular: " + titular + " - Saldo: R$" + totalFormatado);
    }
}

