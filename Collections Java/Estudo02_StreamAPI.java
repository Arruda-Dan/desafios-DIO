package desafios.dio.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Estudo02_StreamAPI {

	public static void main(String[] args) {
		
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("--\tImprima todos os elementos dessa lista de String\t--");
		numerosAleatorios.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		System.out.println("--\tSimplificando com lambda(1)\t--");
		numerosAleatorios.stream().forEach(s -> System.out.println(s));
		
		System.out.println("--\tSimplificando com lambda(2)\t--");
		numerosAleatorios.forEach(System.out::println);
		
		System.out.println("--\tMetodo tradicional\t--");
		for (String string : numerosAleatorios) {
			System.out.println(string);
		}
		
		//Lembrar que set não aceita elementos repetidos
		System.out.println("--\t5 primeiros e colocar dentro de um set\t--");
		numerosAleatorios.stream().limit(5)
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		//Caso queira apenas guardar o novo set em uma variável
		Set<String> collect = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
		//Imprimindo o novo set...
		collect.forEach(System.out::println);

		System.out.println("--\tTransformar lista de String em inteiros\t--");
		/*numerosAleatorios.stream().map(new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return Integer.parseInt(s);
			}
		});*/
		//Metodo simplificado
		//numerosAleatorios.stream().map(s -> Integer.parseInt(s));
		//Coletando para uma nova lista de inteiros
		Set<Integer> collect2 = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toSet());
		collect2.forEach(System.out::println);
			
		
	}
}
