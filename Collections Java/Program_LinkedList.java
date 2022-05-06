package desafios.dio.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Program_LinkedList {
	
	public static void main(String[] args) {
		
		/*
		 * Utilizar Métodos do linkedlist
		 * 1. Colocar todos elementos da ArrayList em uma nova lista
		 * 2. Mostrar o primeiro elemento sem removê-lo
		 * 3. Mostrar o primeiro elemento removendo-o
		 */
		
		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.0);
		notas.add(5.5);
		notas.add(4.0);
		
		LinkedList<Double> lista = new LinkedList<>();
		
		//Criando lista (LinkedList) a a partir da ArrayList
		Iterator<Double> iterator = notas.iterator();
		while (iterator.hasNext()) {
			Double next = iterator.next();
			lista.add(next);
		}
		
		System.out.println(notas);
		System.out.println(lista);
		
		//Mostrando o primeiro elemento sem removê-lo
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());
		System.out.println(lista.peek());
		System.out.println(lista.peekFirst());
		
		//Mostrando e removendo o primeiro elemento
		System.out.println(lista.remove());
		System.out.println(lista);
		
	}
	

}
