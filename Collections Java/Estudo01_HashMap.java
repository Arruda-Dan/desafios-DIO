package desafios.dio.collections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Estudo01_HashMap {

	public static void main(String[] args) {


		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
		Map<String, Double> carrosPopulares = new HashMap<>();
		carrosPopulares.put("gol", 14.4);
		carrosPopulares.put("uno", 15.6);
		carrosPopulares.put("mobi", 16.1);
		carrosPopulares.put("hb20", 14.5);
		carrosPopulares.put("kwid", 15.6);

		System.out.println(carrosPopulares.toString());

		System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
		//Como n tem chaves repetidas, usará o mesmo metodo alterando o valor
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);

		System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

		//será passado o valor da chave
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

		//Nao tem esse método
		//System.out.println("Exiba o terceiro modelo adicionado: ");

		System.out.println("Exiba os modelos: ");
		//keyset retorna um set
		Set<String> modelos = carrosPopulares.keySet(); 
		System.out.println(modelos);

		System.out.println("Exiba os consumos dos carros: ");
		//values retorna uma Collection
		Collection<Double> consumos = carrosPopulares.values(); 
		System.out.println(consumos);

		System.out.println("Exiba o modelo mais econômico e seu consumo: ");

		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";

		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
			}
		}

		System.out.println("Exiba o modelo menos econômico e seu consumo: ");

		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficiente = "";
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if (entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
			}
		}
		
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		//Soma 
		System.out.println("Exiba a soma dos consumos: " + soma);
		//Média
		System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

		System.out.println(carrosPopulares);
		
		//Removendo itens...
		System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while (iterator1.hasNext()) {
			if (iterator1.next().equals(15.6))
				iterator1.remove();
		}
		System.out.println(carrosPopulares);

		System.out.println("Exiba todos os carros na ordem em que foram informados: ");
		//LinkedHashMap mantem a ordem de inclusao
		//Nesse caso só estão aparecendo alguns itens pois foi feita uma cópia e excluídos alguns itens
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(carrosPopulares);
//		carrosPopulares1.put("gol", 14.4);
//		carrosPopulares1.put("uno", 15.6);
//		carrosPopulares1.put("mobi", 16.1);
//		carrosPopulares1.put("hb20", 14.5);
//		carrosPopulares1.put("kwid", 15.6);

		//Pode ser impresso sem o tostring
		System.out.println(carrosPopulares1);

		System.out.println("Exiba o dicionário ordenado pelo modelo: ");
		//TreeMap ordena 
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2.toString());

		System.out.println("Apague o dicionario de carros: ");
		carrosPopulares.clear();

		System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

	}

}
