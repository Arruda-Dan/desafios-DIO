package desafios.dio.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercicio01_Set {

	/*
	 * Exercícios Propostos
	 * 
	 * 01. Crie um conjunto contendo as cores do arco-íris e: 
	 * 1. Exiba todas as cores uma abaixo da outra 
	 * 2. A quantidade de cores que o arco-íris tem 
	 * 3. Exiba as cores em ordem alfabética 
	 * 4. Exiba as cores na ordem inversa da que foi informada 
	 * 5. Exiba todas as cores que começam com a letra ”v” 
	 * 6. Remova todas as cores que não começam com a letra “v” 
	 * Limpe o conjunto 
	 * Confira se o conjunto está vazio
	 */

	public static void main(String[] args) {

		//Adicionando cores do arcoIris
		List<String> arcoIris = new ArrayList<String>();
		arcoIris.add("Vermelho");
		arcoIris.add("Laranja");
		arcoIris.add("Amarelo");
		arcoIris.add("Verde");
		arcoIris.add("Azul");
		arcoIris.add("Anil");
		arcoIris.add("Violeta");

		//Imprimindo as cores uma abaixo da outra + Contador
		int quantidadeCores = 0;
		for (int i = 0; i < arcoIris.size(); i++) {
			System.out.println(arcoIris.get(i) + " ");
			quantidadeCores++;
		}

		//Imprimindo a quantidade de elementos da lista
		System.out.println();
		System.out.println("Total de cores: " + quantidadeCores);

		//Cores em ordem alfabética
		Collections.sort(arcoIris);
		System.out.println();
		System.out.println(arcoIris);

		//Imprimindo só os elementos que começam com V
		System.out.println();
		for (String string : arcoIris) {
			char carac = string.charAt(0);
			if (carac == 'V') System.out.print(string + " ");
		}
		
		//Excluindo os elementos que não começam com V
		Iterator<String> iterator2 = arcoIris.iterator();
		while (iterator2.hasNext()) {
			char carac = iterator2.next().charAt(0);
			if (carac != 'V') iterator2.remove();
		}
		
		//Imprimindo a lista após as modificações
		System.out.println();
		System.out.println();
		System.out.println(arcoIris);
		
		//Limpando lista
		arcoIris.clear();
		
		//Confirmando se a lista está vazia
		System.out.println();
		System.out.println(arcoIris.isEmpty());
		

		}

	}

