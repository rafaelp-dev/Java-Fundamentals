package Logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true){
            System.out.println("Digite um número (ou -1 para sair): ");
            int numero = scanner.nextInt();
            if (numero == -1){
                break;
            }
            numeros.add(numero);
        }

        if (!numeros.isEmpty()){
            int resultado = Collections.max(numeros);
            System.out.println("O maior número é: " + resultado);
        }else {
            System.out.println("O número não foi encontrado");
        }
    }
}
