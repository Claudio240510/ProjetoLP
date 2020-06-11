import java.util.*;

public class Cidade implements Comparable<Cidade>  {

	private String nome;
	private List<Ligacao> ligacoes = new ArrayList<>();
	private double distanciaMinima = Double.POSITIVE_INFINITY;
	private double distanciaMaxima = Double.NEGATIVE_INFINITY;
	private Cidade cidadeAnterior;
	
	// Construtores

	public Cidade(String nome) {
		this.nome = nome;		
	}

	// Getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getDistanciaMinima() {
		return distanciaMinima;
	}

	public void setDistanciaMinima(double distanciaMinima) {
		this.distanciaMinima = distanciaMinima;
	}
	
	public double getDistanciaMaxima() {
		return distanciaMaxima;
	}

	public void setDistanciaMaxima(double distanciaMaxima) {
		this.distanciaMaxima = distanciaMaxima;
	}
	
	public Cidade getCidadeAnterior() {
		return cidadeAnterior;
	}

	public void setCidadeAnterior(Cidade cidadeAnterior) {
		this.cidadeAnterior = cidadeAnterior;
	}
	
	public List<Ligacao> getLigacoes(){
		return ligacoes;
	}
	
	public void addLigacao(Ligacao l) {	
		ligacoes.add(l);	
	}
	
	public int compareTo(Cidade cidade) {
		return Double.compare(distanciaMinima, cidade.getDistanciaMinima());	
	}
	
	@Override
	public String toString() {
		return "Cidade: " + nome ;
	}

}
