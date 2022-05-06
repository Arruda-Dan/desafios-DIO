package desafios.dio.collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Estudo02_HashSet {

	public static void main(String[] args) {

		Set<Serie> series = new HashSet<>();
		series.add(new Serie("GOT", "Drama", 60));
		series.add(new Serie("Dark", "Drama", 60));
		series.add(new Serie("That '70s show", "Com�dia", 25));

		// ordem aleatoria
		for (Serie serie : series) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEEpisodio());
		}

		System.out.println();

		// ordem de insercao
		Set<Serie> series2 = new LinkedHashSet<>();
		series2.add(new Serie("GOT", "Fantasia", 60));
		series2.add(new Serie("Dark", "Drama", 60));
		series2.add(new Serie("That '70s show", "Com�dia", 25));

		for (Serie serie : series2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEEpisodio());
		}

		System.out.println();

		// ordem natural por tempo de episodio
		Set<Serie> series3 = new TreeSet<>(series);
		// erro ao imprimir assim... poid nao t� implementado o comparable na classe
		// Serie
//		System.out.println(series3);

		for (Serie serie : series3) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEEpisodio());
		}

	}

}

class Serie implements Comparable<Serie> {

	private String nome;
	private String genero;
	private Integer tempoEEpisodio;

	public Serie(String nome, String genero, Integer tempoEEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEEpisodio = tempoEEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEEpisodio() {
		return tempoEEpisodio;
	}

	public void setTempoEEpisodio(Integer tempoEEpisodio) {
		this.tempoEEpisodio = tempoEEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEEpisodio=" + tempoEEpisodio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tempoEEpisodio == null) ? 0 : tempoEEpisodio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tempoEEpisodio == null) {
			if (other.tempoEEpisodio != null)
				return false;
		} else if (!tempoEEpisodio.equals(other.tempoEEpisodio))
			return false;
		return true;
	}

	@Override
	public int compareTo(Serie serie) {
		// se n�o for feito esse procedimento, o TreeSet ir� eliminar o elemento
		// repetido, pois ele nao admite repeticoes
		
		// Para entender melhor...
		// Se os episodios forem diferentes > compara pelos episodios
		// Se os generos forem diferentes > compara pelos generos
		// Senao vai pelos nomes
		int tempoEpisodio = Integer.compare(this.getTempoEEpisodio(), serie.tempoEEpisodio);
		if (tempoEpisodio != 0)	return tempoEpisodio;
		
		int genero = this.getGenero().compareTo(serie.getGenero());
		if (genero != 0) return genero;

		return this.getNome().compareTo(serie.getNome());
	}

}

//implementando.....
class comparatorNomeGeneroEpisodio implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		return 0;
	}

	
}
