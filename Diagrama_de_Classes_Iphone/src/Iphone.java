import Navegador.NavegadorInfc;
import ReprodutorMusical.ReprodutorInfc;
import Telefone.TelefoneInfc;

public class Iphone implements ReprodutorInfc, TelefoneInfc, NavegadorInfc {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página....");

    }

    @Override
    public void adicionarPagina() {
        System.out.println("Página Adicionada!");
    }

    @Override
    public void atualizarPaginas() {
        System.out.println("Atualizando Pagina!!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando nova Música...");
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void ligarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }
}
