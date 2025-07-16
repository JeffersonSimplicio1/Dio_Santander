import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ComsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,10,12,220156);

        Consumer<Integer> imprimirNumeroPar = numero -> {

        };
        numeros.forEach(n ->{

                if(n %2 == 0){
                    System.out.println(n);

            }
        });
    }
}
