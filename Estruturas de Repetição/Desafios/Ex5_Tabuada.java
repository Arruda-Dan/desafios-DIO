package desafios.dio.repeticoes;

import java.util.Locale;
import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Tabuada desejada: ");
		int n = sc.nextInt();
		
		System.out.println("Tabuada de " + n);
		for (int i=1; i<=10; i++) {
			int mult = n * i;
			System.out.println(n + " X " + i + " = " + mult);
		}

		System.out.println();
		System.out.println("Finalizado com sucesso!");
		sc.close();

	}
}
