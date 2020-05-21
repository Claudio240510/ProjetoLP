package TrabalhoLP;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cidade implements Comparable<Cidade> {

	private String nome;
	private int distancia = 0;
	private boolean foiVisitado;
	LinkedList<Ligacao> ligacoes;

	// Construtores

	public Cidade(int distancia, String nome) {
		this.nome = nome;
		this.distancia = distancia;
		foiVisitado = false;
		ligacoes = new LinkedList<>();
	}

	// Getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public boolean isFoiVisitado() {
		return foiVisitado;
	}

	public void visitar() {
		this.foiVisitado = true;
	}

	public void naoVisitado() {
		foiVisitado = false;
	}

	public int compareTo(Cidade cidade) {

		if (this.getDistancia() < cidade.getDistancia())
			return -1;

		else if (this.getDistancia() == cidade.getDistancia()) {
			return 0;
		} else {
			return 1;
		}
	}

	public int compareTo(Cidade cidade1, Cidade cidade2) {

		if (cidade1.getDistancia() < cidade2.getDistancia()) {
			return -1;
		}
		if (cidade1.getDistancia() > cidade2.getDistancia()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", distancia=" + distancia + ", foiVisitado=" + foiVisitado + ", ligacoes="
				+ ligacoes + "]";
	}

}
