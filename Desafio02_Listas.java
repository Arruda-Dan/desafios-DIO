package desafios.dio.collections.list;

import java.util.Locale;
import java.util.Scanner;

public class Desafio02_Listas {

	/*
	 * Proposta 02 - 
	 * 
	 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa
	 * sobre um crime. As perguntas s�o:
	 * "Telefonou para a v�tima?"
	 * "Esteve no local do crime?"
	 * "Mora perto da v�tima?"
	 * "Devia para a v�tima?"
	 * "J� trabalhou com a v�tima?"
	 * 
	 * Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada
	 * como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como "Assassina". Caso
	 * contr�rio, ela ser� classificado como "Inocente".
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		String[] questionario = {"Telefonou para a v�tima?", "Esteve no local do crime?", "Mora perto da v�tima?", 
				"Devia para a v�tima?",  "J� trabalhou com a v�tima?"};
		
		System.out.println("Para o question�rio a seguir, digite 'S' para as respostas afirmartivas e "
				+ "'N' para as repostas negativas");
		System.out.println();
		
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(questionario[i]);
			
			String opcao = sc.next();
			while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
				System.out.println("Op��o inv�lida!");
				opcao = sc.next();
			}
			
			int cont = 0;
			if (opcao.equalsIgnoreCase("s")) cont = 1;
			else cont = 0;
			
			soma += cont;
			
			/* Opcao 02 */
//			int opcao = sc.nextInt();
//			while (opcao != 0 && opcao != 1 ) {
//				System.out.println("Op��o Inv�lida!!");
//				opcao = sc.nextInt();
//			}
//			
//			soma += opcao;
			
		}
		
		System.out.println();
		if (soma < 2) System.out.println("Inocente!");
		else if (soma == 2) System.out.println("Suspeito!");
		else if (soma < 5) System.out.println("C�mplice!");
		else System.out.println("Assassino!");
		
		System.out.println();
		System.out.println(soma);
		 
		sc.close();

	}

}
