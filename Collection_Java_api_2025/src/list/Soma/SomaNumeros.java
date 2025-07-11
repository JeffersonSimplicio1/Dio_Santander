package list.Soma;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numeros) {
        this.numeros.add(numeros);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for(Integer numero : numeros){
                if(numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
        return maiorNumero;
        } else {
        throw new RuntimeException("A lista está vazia");
    }

    }
         public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros ){
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
           return menorNumero;
        } else {
            throw  new RuntimeException("A lista está vazia");
        }
    }
    public void exibirNumero(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        } else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumeros(5);
        somaNumeros.adicionarNumeros(2);
        somaNumeros.adicionarNumeros(0);
        somaNumeros.adicionarNumeros(0);
        somaNumeros.adicionarNumeros(-2);
        somaNumeros.adicionarNumeros(10);

        System.out.println("Numeros adicionados");
        somaNumeros.exibirNumero();

        System.out.println("A soma dos numeros = " + somaNumeros.calcularSoma());
        System.out.println("O maior numero da lista é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor numero da lista é: " + somaNumeros.encontrarMenorNumero());
    }
}

