public class Ligacao{

	protected double horas;
	private Cidade origem;
	private Cidade destino;

	// Construtores
	public Ligacao(Cidade origem, Cidade destino, double horas) {
		this.origem = origem;
		this.destino = destino;
		this.horas = horas;
	}

	public Ligacao(Cidade origem, Cidade destino) {
		this.origem = origem;
		this.destino = destino;
		horas = 0;
	}

	public Ligacao() {
		origem = null;
		destino = null;
		horas = 0;
	}

	// Getters e setters
	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getHoras() {
		return horas;
	}

	public void setDestino(Cidade destino) {
		this.destino = destino;
	}

	public Cidade getDestino() {
		return destino;
	}

	public void setOrigem(Cidade origem) {
		this.origem = origem;
	}

	public Cidade getOrigem() {
		return origem;
	}

}

