import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String logLine = scanner.nextLine();
        String metodo = logLine.split(" ")[0];
        System.out.println(metodo);
        scanner.close();
    }
}