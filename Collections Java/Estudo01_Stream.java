package desafios.dio.collections.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class Estudo01_Stream {
	
	public static void main(String[] args) {
		
		/*Dadas as seguintes informações  de id e contato, crie um dicionário e
		ordene este dicionário exibindo (Nome id - Nome contato);
		id = 1 - Contato = nome: Simba, numero: 2222;
		id = 4 - Contato = nome: Cami, numero: 5555;
		id = 3 - Contato = nome: Jon, numero: 1111;
		*/
		        Map<Integer, Contato> agenda = new HashMap<>();
		         agenda.put(1, new Contato("Simba", 5555));
		         agenda.put(4, new Contato("Cami", 6666));
		         agenda.put(3, new Contato("Jon", 2222));
		           
		        System.out.println("--\tOrdem número telefone(1)\t--");
		        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
					@Override
					public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
						return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
					}
		        	
				});
		        set.addAll(agenda.entrySet());
		        
		        for (Map.Entry<Integer, Contato> entry: set) {
		            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		        }
		        
		        System.out.println("--\tOrdem número telefone(2)\t--");
		        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
					@Override
					public Integer apply(Entry<Integer, Contato> cont) {
						return cont.getValue().getNumero();
					}
				}));
		        set2.addAll(agenda.entrySet());
		        
		        for (Entry<Integer, Contato> entry2 : set2) {
		        	System.out.println(entry2.getKey() + " - " + entry2.getValue().getNome());
				}
		        
		        //Refatorando com lambda
		        System.out.println("--\tOrdem número telefone(3)\t--");
		        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
		        
		        set3.addAll(agenda.entrySet());
		        
		        for (Entry<Integer, Contato> entry2 : set3) {
		        	System.out.println(entry2.getKey() + " - " + entry2.getValue().getNome());
				}
		        
		        System.out.println("--\tOrdem nome do contato\t--");
		        Set<Map.Entry<Integer, Contato>> set4 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
		        set4.addAll(agenda.entrySet());
		        
		        for (Entry<Integer, Contato> entry : set4) {
		        	System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
				}
		       
		    }
		}

