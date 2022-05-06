package desafios.dio.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Estudo01_HashSet {
	
	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicione notas: ");
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas); //Fica na ordem númerica e elementos repetidos só entram uma vez
		
		//Conferindo se o elemento específico está no conjunto
		System.out.println(notas.contains(5d));
		
		//Menor e maior nota adicionada 
		System.out.println(Collections.min(notas));
		System.out.println(Collections.max(notas));
		
		//soma dos valores e media
		System.out.print("Soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double sum = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}
		System.out.println(sum);
		System.out.println("Média = " + sum / notas.size() );
		
		//remover nota específica
		notas.remove(0d);
		System.out.println(notas); // nao tem mais a nota 0.0
		
		//removendo elementos
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7d) iterator1.remove();
		}
		System.out.println(notas);
		
		//exibir elementos na ordem crescente
		Set<Double> notas2 = new LinkedHashSet<>();
		//repetindo as mesmas notas..
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		//exibir ordem crescente
		//Usar Metodo TreeSet...
		Set<Double> notas3 = new TreeSet<>(notas2);
		//Imprime na ordem numérica
		System.out.println(notas3);
		
		//apagar o conjunto
		System.out.println(notas.isEmpty());
		notas.clear();
		System.out.println(notas);
		System.out.println(notas.isEmpty());
		
		
	}

}
