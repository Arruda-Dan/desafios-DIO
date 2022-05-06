package desafios.dio.repeticoes.arrays;

import java.util.Locale;

public class Ex1_OrdemInversa {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		
		int[] vetor = {0, -5, 15, 8, 4};
		
		//Imprime ordem natural
		System.out.print("Imprimindo ordem natural: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		
		//Imprime ordem inversa
		System.out.print("Imprimindo ordem inversa: ");
		for (int j = (vetor.length - 1); j >= 0; j--) {
			System.out.print(vetor[j] + " ");
		}


	}

}
