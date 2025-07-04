import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente
        String titular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        // Validação ANTES de pedir o depósito
        if (saldo < 0) {
            System.out.println("Erro: O saldo nao pode ser negativo.");
            scanner.close();
            return; // Encerra o programa aqui
        }

        double deposito = scanner.nextDouble();

        // Validação do depósito
        if (deposito < 0) {
            System.out.println("Erro: O valor do deposito deve ser positivo.");
            scanner.close();
            return;
        }

        ContaBancaria conta = new ContaBancaria(numero, titular, saldo, deposito);
        conta.mostrarConta();

        scanner.close();
    }
}
