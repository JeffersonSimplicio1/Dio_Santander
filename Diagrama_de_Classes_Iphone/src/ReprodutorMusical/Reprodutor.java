package ReprodutorMusical;

public abstract class Reprodutor implements ReprodutorInfc{
    public void tocar(){
        System.out.println("Tocando: Sobre as Águas");
    }
    public void pausa(){
        System.out.println("Musica Pausada!");
    }
    public void selecionaMusica(String musica){
        System.out.println("Selecionando nova musica...");
    }
}
