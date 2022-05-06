package desafios.dio.repeticoes.arrays;

import java.util.Locale;

public class Ex2_Consoantes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		char[] vetor = { 'a', 'b', 'c', 'd', 'e' };

		// Imprime ordem natural
		System.out.print("Imprimindo todos caracteres: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		System.out.println();

		// Imprime consoantes
		int quantidadeConsoantes = 0;
		System.out.print("Imprimindo só as consoantes: ");
		for (char c : vetor) {
			if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
				System.out.print(c + " ");
				quantidadeConsoantes++;
			}
		}
		
		System.out.println();
		System.out.println("A quantidade de consoantes é: " + quantidadeConsoantes);

	}

}
