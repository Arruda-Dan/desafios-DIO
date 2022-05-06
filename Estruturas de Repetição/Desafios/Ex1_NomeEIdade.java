package desafios.dio.repeticoes;

import java.util.Scanner;

public class Ex1_NomeEIdade {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		
		while(true) {
			sc.nextLine();
			System.out.println("Nome: ");
			nome = sc.nextLine();
			if (nome.equals("0")) break;
			System.out.println("Idade: ");
			idade = sc.nextInt();
			System.out.println("Nome: " + nome + ", Idade: " + idade);
			System.out.println();
			
		}
		
		System.out.println("Programa finalizado!");
		
		sc.close();
	}
	

}
