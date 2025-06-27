import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gerente gerente = new Gerente();
        Vendendor vendedor = new Vendendor();

/* A classe Gerente acessa os objetos da classe colaborador, porém a classe gerente
 possui dois objetos difereentes das demais que são Login e Senha e que não pode ser
 acessado pelas outras classes */

        gerente.setNome(sc.next());
        gerente.setCodigo(00526);
        gerente.setLogin("Jeff.Simplicio");
        gerente.setSenha("123456789");

        vendedor.setNome(sc.next());
        vendedor.setCodigo(00527);










    }
}