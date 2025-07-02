package Navegador;

public abstract class Navegador implements NavegadorInfc {
    public void exibirPagina(String url){
        System.out.println("Pagina em funcionamento!!");
    }
    public void adicionarAba(){
        System.out.println("Aba adicionada!");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina!!");
    }
}
