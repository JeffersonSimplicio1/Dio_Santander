import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int parametroUm= sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int parametroDois = sc.nextInt();

       try {
           ParametrosInvalidosException p = new ParametrosInvalidosException(parametroUm, parametroDois);
           System.out.println(p.ParametrosInvalidosException());
       } catch (RuntimeException e){
           System.out.println(e.getMessage());
       }

}

}

