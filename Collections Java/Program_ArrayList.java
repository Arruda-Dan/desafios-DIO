package desafios.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program_ArrayList {
	
	public static void main(String[] args) {
		
		/*
		 * Desta forma o array fica limitado a essas informações, nao podendo adicionar novos dados
		 * List<Double> notas1 = Arrays.asList(7d, 8.5, 9.3); 
		 */
		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.0);
		notas.add(5.5);
		notas.add(4.0);
		
		System.out.println(notas.toString());
		
		//mostra a posicao do valor informado...
		System.out.println(notas.indexOf(7.0));
		
		//adicionar numa posicao especifica...
		notas.add(5, 8.5);
		System.out.println(notas.toString());
		
		//substitui uma valor por outro...
		// indexof vai pegar a posicao do valor informado e trocar pelo novo valor
		notas.set(notas.indexOf(9.0), 10.0); 
		System.out.println(notas.toString());
		
		//confere elemento na lista...
		// retorna boolean
		System.out.println(notas.contains(5.5));
		
		//imprimir todos elementos adicionados na ordem
		for (Double nota : notas) System.out.println(nota);
		
		//exibir elemento de uma posicao desejada
		System.out.println(notas.get(2));
		
		//exibir maior e menor nota
		//método especifico do Collections
		System.out.println(Collections.min(notas));
		System.out.println(Collections.max(notas));
		
		//soma dos valores e média
		//atalho para criação de variáveis ctrl + 2 + L
		Iterator<Double> iterator = notas.iterator();
		Double sum = 0d; // tem que colocar o d após o valor
		while(iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}
		System.out.println(sum);
		//size mosra a quantidade de elementos na lista
		//média
		System.out.println(sum / notas.size());
		
		//remover = pode ser o elemento ou a posicao
		// testei remover a nota mais baixa
		notas.remove(Collections.min(notas));
		System.out.println(notas.toString());
		
		//remover elemntos menores que 7d...
		Iterator<Double> iterator2 = notas.iterator();
		while (iterator2.hasNext()) {
			Double next = iterator2.next();
			if (next < 6) iterator2.remove();
		}
		System.out.println(notas);
		
		//apagar toda a lista
		notas.clear();
		System.out.println(notas);
		
		//se a lista está vazia = retorn boolean
		System.out.println(notas.isEmpty());
		
		
		
		
	}
	

}
