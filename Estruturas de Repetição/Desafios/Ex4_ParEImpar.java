package desafios.dio.repeticoes;

import java.util.Locale;
import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidades de numeros: ");
		int n = sc.nextInt();

		int[] numeros = new int[n];
		int quantidadePares = 0;
		int quantidadeImpares = 0;

		int i = 0;
		do {
			System.out.println("Informe um numero:");
			numeros[i] = sc.nextInt();
			while (numeros[i] < 0) {
				System.out.println("Digite um numero válido: ");
				numeros[i] = sc.nextInt();
			}

			i++;
		} while (i < numeros.length);

		System.out.println();
		System.out.println("Numeros Pares: ");
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] % 2 == 0) {
				System.out.print(numeros[j] + ", ");
				quantidadePares++;
			}
		}
		System.out.println("\nTotal de pares: " + quantidadePares);
		System.out.println();

		System.out.println("Numeros Ímapares: ");
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] % 2 != 0) {
				System.out.print(numeros[j] + ", ");
				quantidadeImpares++;
			}
		}
		System.out.println("\nTotal de ímpares: " + quantidadeImpares);
		System.out.println();

		System.out.println();
		System.out.println("Finalizado!");

		sc.close();

	}
}
