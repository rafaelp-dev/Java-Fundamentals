package Logica;

import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        SomaPares somaPares = new SomaPares();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Soma de todos os pares ---");
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int resultado = SomaPares.somarPares(numero);
        System.out.println("A soma dos número pares até " + numero + " é: " + resultado);

        scanner.close();
    }

    public static int somarPares(int numero){
        int soma = 0;

        for (int i = 0; i <= numero; i++){
            if (i % 2 == 0){
                soma = soma + i;
            }
        }
        return soma;
    }
}
