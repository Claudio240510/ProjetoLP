
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

	public class Grafo {
		private Set<Cidade> cidades;
		private boolean grafoDirecionado;

	// Construtores
	public Grafo(boolean grafoDirecionado) {
		this.grafoDirecionado = grafoDirecionado;
		cidades = new HashSet<>();
	}
	
	public Grafo() {
		grafoDirecionado=true;
	}

	// Getters e setters

	public void addCidade(Cidade n) {
		cidades.addAll(Arrays.asList(n));
	}

	public void addLigacao(Cidade origem, Cidade destino, double horas) {
		cidades.add(origem);
		cidades.add(destino);

		adicionaLigacao(origem, destino, horas);

		if (!grafoDirecionado && origem != destino) {
			adicionaLigacao(destino, origem, horas);
		}
	}

	private void adicionaLigacao(Cidade a, Cidade b, double horas) {
		for (Ligacao ligacao : a.ligacoes) {
			if (ligacao.getOrigem() == a && ligacao.getDestino() == b) {

				ligacao.horas = horas;
				return;
			}
		}

		a.ligacoes.add(new Ligacao(a, b, horas));
	}

	public void imprimeLigacoes() {
		for (Cidade cidade : cidades) {
			LinkedList<Ligacao> ligacoes = cidade.ligacoes;

			if (ligacoes.isEmpty()) {
				System.out.println("A Cidade " + cidade.getNome() + " não tem voos disponíveis.");
				continue;
			}
			System.out.print("A Cidade " + cidade.getNome() + " tem voo para ");

			for (Ligacao ligacao : ligacoes) {
				System.out.print(ligacao.getDestino().getNome() + " Duração Voo: " + ligacao.getHoras() + " horas  ");
			}
			System.out.println();
		}
	}

	public boolean temLigacao(Cidade origem, Cidade destino) {
		LinkedList<Ligacao> ligacoes = origem.ligacoes;
		for (Ligacao ligacao : ligacoes) {

			if (ligacao.getDestino() == destino) {
				return true;
			}
		}
		return false;
	}
	
	public void limpaCidadesVisitadas() {
	for (Cidade cidade : cidades) {
		cidade.naoVisitado();
		}
	}
	
	private Cidade cidadeVizinhaPorVisitar(HashMap<Cidade, Double> caminhoMaisCurto) {
		double menorDistancia = 1000000000000000.0;
		Cidade cidadeMaisProxima = null;
		for (Cidade cidade : cidades) {
			if (cidade.isFoiVisitado())
				continue;
			
			double distanciaAtual = caminhoMaisCurto.get(cidade);
			if (distanciaAtual == 1000000000000000.0)
				continue;

			if (distanciaAtual < menorDistancia) {
				menorDistancia = distanciaAtual;
				cidadeMaisProxima = cidade;
			}
		}
		return cidadeMaisProxima;
	}

}
