package TrabalhoLP;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cidade {

	private String nome;
	private int distancia = 0;
	private boolean foiVisitado;

	// Construtores

	public Cidade(int distancia, String nome) {
		this.nome = nome;
		this.distancia = distancia;
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

}