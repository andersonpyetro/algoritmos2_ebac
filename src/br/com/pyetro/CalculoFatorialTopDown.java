package br.com.pyetro;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class CalculoFatorialTopDown {
	
	static HashMap<Integer, BigInteger> memo = new HashMap();

	public static void main(String[] args) {
		int numero = 100;

		BigInteger fatorial = calcularFatorial(numero);

		System.out.println("O fatorial de " + numero + " é: " + fatorial);
	}

	public static BigInteger calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		}

		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		BigInteger resultado = BigInteger.valueOf(n).multiply(calcularFatorial(n - 1));
		memo.put(n, resultado);
		return resultado;
	}
}