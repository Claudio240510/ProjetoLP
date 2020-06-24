import java.util.*;

public class Grafo implements IGrafo{

	private Set<Cidade> cidades;
	private PriorityQueue<Cidade> queueCidade = new PriorityQueue<>();

	public Grafo() {
		cidades = new HashSet<>();
	}
	
	@Override
	public void addCidade(Cidade n) {
		cidades.add(n);
	}
	
	@Override
	public void removerCidade(Cidade n) {
		cidades.remove(n);
	}
	
	@Override
	public void encontraMenorCaminho(Cidade origem){
		origem.setDistanciaMinima(0.0);
		queueCidade.add(origem);
		while (!queueCidade.isEmpty()) {
			Cidade c = queueCidade.poll();
			for (Ligacao l : c.getLigacoes()) {
				Cidade destino = l.getDestino();
				double peso = l.getHoras();
				double distanciaAtravesC = peso + c.getDistanciaMinima();
				if(distanciaAtravesC < destino.getDistanciaMinima()) {
					destino.setDistanciaMinima(distanciaAtravesC);
					destino.setCidadeAnterior(c);
					queueCidade.remove(destino);
					queueCidade.add(destino);
				}
			}
		}
	}
	
	@Override
	public void encontraMaiorCaminho(Cidade origem){
		origem.setDistanciaMaxima(0.0);
		queueCidade.add(origem);
		while (!queueCidade.isEmpty()) {
			Cidade c = queueCidade.poll();
			for (Ligacao l : c.getLigacoes()) {
				Cidade destino = l.getDestino();
				double peso = l.getHoras();
				double distanciaAtravesC = peso + c.getDistanciaMaxima();
				if(distanciaAtravesC > destino.getDistanciaMaxima()) {
					destino.setDistanciaMaxima(distanciaAtravesC);
					destino.setCidadeAnterior(c);
					queueCidade.remove(destino);
					queueCidade.add(destino);
				}
			}
		}
	}
	
	@Override
	public List<Cidade> criarCaminho(Cidade destino){
		List<Cidade> caminho = new ArrayList<Cidade>();
		for (Cidade c = destino; c!=null; c=c.getCidadeAnterior()) {
			caminho.add(c);
		}
		Collections.reverse(caminho);
		return caminho;
	}
	
}
