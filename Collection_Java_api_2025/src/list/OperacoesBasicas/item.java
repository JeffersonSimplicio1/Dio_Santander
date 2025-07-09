package list.OperacoesBasicas;

public class item {

    private  String nome;
    private Double preco;
    private Integer quantidade;


    public item(String nome, Integer quantidade, Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "item {" +
                " ome ='" + nome + '\'' +
                ", preco =" + preco +
                ", quantidade =" + quantidade +
                '}' ;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
}
