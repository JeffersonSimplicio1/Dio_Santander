package Telefone;

public abstract class Telefone {
    public void ligar (int numero){
        System.out.println("Ligando para "+ numero);
    }
    public  void atender(){
        System.out.println("Atendendo Ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz...");
    }
}
