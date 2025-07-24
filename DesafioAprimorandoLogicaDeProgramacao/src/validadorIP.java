import java.util.Scanner;

public class validadorIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        scanner.close();

        if (validarIP(ip)) {
            System.out.println("ip valido");
        } else {
            System.out.println("ip invalido");
        }
    }

    public static boolean validarIP(String ip) {
        if (ip == null || ip.isEmpty()) {
            return false;
        }

        String[] partes = ip.split("\\.");

        if (partes.length != 4) {
            return false;
        }

        for (String parte : partes) {
            try {
                int numero = Integer.parseInt(parte);
                if (numero < 0 || numero > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }
}
