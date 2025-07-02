public class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;
    private String valorTotalForamatado;

    public Pedido(int id, String cliente, double valorTotal, String valorTotalFormatado) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.valorTotalForamatado = valorTotalFormatado;
    }

    public void exibirPedido() {
        System.out.println("Pedido #" + id  + " - Cliente: " + cliente + " - Total: R$" + valorTotalForamatado);


    }
}
