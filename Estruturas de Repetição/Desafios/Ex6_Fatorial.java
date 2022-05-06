package desafios.dio.repeticoes;

import java.util.Locale;
import java.util.Scanner;

public class Ex6_Fatorial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o fatorial desejado: ");
		int fatorial = sc.nextInt();
		
		int mult = 1;
		
		System.out.print("Fatorial de " + fatorial + "! = ");
		for (int i = fatorial; i >= 1; i--) {
			mult *= i;
		}
		System.out.println(mult);
		
		System.out.println();
		System.out.println("Programa finalizado com sucesso!");
		

		sc.close();

	}
}
