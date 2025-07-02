public class Main {
    public static void main(String[] args) {
    Iphone iphone = new Iphone();

        System.out.println("===================");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("===================");
        iphone.atender();
        iphone.ligar(33265298);
        iphone.ligarCorreioVoz();

        System.out.println("===================");
        iphone.exibirPagina();
        iphone.atualizarPaginas();
        iphone.adicionarPagina();

        System.out.println("===================");

    }
}