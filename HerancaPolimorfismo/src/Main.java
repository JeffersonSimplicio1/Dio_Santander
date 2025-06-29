import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* A classe Gerente acessa os objetos da classe colaborador, porém a classe gerente
 possui dois objetos difereentes das demais que são Login e Senha e que não pode ser
 acessado pelas outras classes */

        printColaborador(new Gerente());
        printColaborador(new Vendendor());






    }
    public static void printColaborador(Colaborador colaborador){

        System.out.printf("===========%s==========/n", colaborador.getClass().getCanonicalName());
        if(colaborador instanceof Gerente gerente) {
            colaborador.setNome("João");
            ((Gerente) colaborador).setLogin("João");
            ((Gerente) colaborador).setSenha("123456");



            System.out.println(colaborador.getNome());
            System.out.println(((Gerente) colaborador).getLogin());
            System.out.println(((Gerente) colaborador).getSenha());


        }

        System.out.println("=====================");

    }
}