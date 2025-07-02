import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

         int id = sc.nextInt();
        sc.nextLine();
         String cliente = sc.nextLine();
         double valorTotal = sc.nextDouble();
        String valorTotalFormatado = String.format("%.2f", valorTotal);

         Pedido pedido = new Pedido(id,cliente,valorTotal,valorTotalFormatado);

         pedido.exibirPedido();

         sc.close();


    }
}