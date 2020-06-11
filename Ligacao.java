public class Ligacao implements Comparable<Ligacao> {

	protected double horas;
	private Cidade destino;

	// Construtores
	public Ligacao(Cidade destino, double horas) {
		this.destino = destino;
		this.horas = horas;
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

	@Override
	public String toString() {
		return String.format("(%s, %f)", destino.getNome(), horas);
	}

	public int compareTo(Ligacao outraLigacao) {

		if (this.horas > outraLigacao.horas) {
			return 1;
		} else
			return -1;
	}

}
