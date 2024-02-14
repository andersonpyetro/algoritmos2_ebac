package br.com.pyetro;

import java.util.Scanner;

public class FatorialRecursivo {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        long fatorial = calcularFatorial(numero);
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
    
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
