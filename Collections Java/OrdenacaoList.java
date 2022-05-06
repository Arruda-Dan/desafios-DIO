package desafios.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
	
	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>();
		gatos.add(new Gato("Jon", 18, "azul"));
		gatos.add(new Gato("Simba", 6, "tigrado"));
		gatos.add(new Gato("Jon", 12, "preto"));
		gatos.add(new Gato("Ze", 20, "amarelo"));
		
		//ordem de insercao
		//List sempre mostra a ordenação pela ordem de insercao
		System.out.println(gatos);
		
		//ordem aleatoria
		Collections.shuffle(gatos); // bagunca a ordem de insercao
		System.out.println(gatos);
		
		//ordem natural
		//implementar o comparable na classe Gato
		Collections.sort(gatos);
		System.out.println(gatos);
		
		//ordem idade
		//Implementar uma classe de comparator
		//Collections.sort(gatos, new ComparatorIdade());
		//             OU
		gatos.sort(new ComparatorIdade());
		System.out.println(gatos);
		
		//ordem de cor
		//Implementar uma classe de comparator
		gatos.sort(new ComparatorCor());
		System.out.println(gatos);
		
		//Ordem nome / cor / idade
		//Implementar uma classe de comparator
		gatos.sort(new ComparatorNomeCorIdade());
		System.out.println(gatos);
		
		
		
	}

}

class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "{" + 
				"Nome:'" + getNome() + "'" +
				", Idade: " + getIdade() +
				", Cor:'" + getCor() + "'" +
				"}";
	}

	//sobrescrever método
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}

}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
	
