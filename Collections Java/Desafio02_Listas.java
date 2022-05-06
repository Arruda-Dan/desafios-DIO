package desafios.dio.collections.list;

import java.util.Locale;
import java.util.Scanner;

public class Desafio02_Listas {

	/*
	 * Proposta 02 - 
	 * 
	 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
	 * sobre um crime. As perguntas são:
	 * "Telefonou para a vítima?"
	 * "Esteve no local do crime?"
	 * "Mora perto da vítima?"
	 * "Devia para a vítima?"
	 * "Já trabalhou com a vítima?"
	 * 
	 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
	 * como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso
	 * contrário, ela será classificado como "Inocente".
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		String[] questionario = {"Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", 
				"Devia para a vítima?",  "Já trabalhou com a vítima?"};
		
		System.out.println("Para o questionário a seguir, digite 'S' para as respostas afirmartivas e "
				+ "'N' para as repostas negativas");
		System.out.println();
		
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(questionario[i]);
			
			String opcao = sc.next();
			while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
				System.out.println("Opção inválida!");
				opcao = sc.next();
			}
			
			int cont = 0;
			if (opcao.equalsIgnoreCase("s")) cont = 1;
			else cont = 0;
			
			soma += cont;
			
			/* Opcao 02 */
//			int opcao = sc.nextInt();
//			while (opcao != 0 && opcao != 1 ) {
//				System.out.println("Opção Inválida!!");
//				opcao = sc.nextInt();
//			}
//			
//			soma += opcao;
			
		}
		
		System.out.println();
		if (soma < 2) System.out.println("Inocente!");
		else if (soma == 2) System.out.println("Suspeito!");
		else if (soma < 5) System.out.println("Cúmplice!");
		else System.out.println("Assassino!");
		
		System.out.println();
		System.out.println(soma);
		 
		sc.close();

	}

}
