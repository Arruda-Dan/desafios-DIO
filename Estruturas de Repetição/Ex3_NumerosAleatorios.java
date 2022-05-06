package desafios.dio.repeticoes.arrays;

import java.util.Locale;
import java.util.Random;

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Random random = new Random();
		int[] numerosAleatorios = new int[20];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Numeros aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.println(numero + ", seu sucessor é: " + (numero + 1));
		}
		
	}

}
