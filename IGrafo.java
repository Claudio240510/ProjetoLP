package TrabalhoLP;

public interface IGrafo {

	public int addCidade(String nome);

	public void addLigacao(Cidade origem, Cidade destino, double horas);

	public void imprimeLigacoes();

	public void encontraMenorCaminho(Cidade origem, Cidade destino);
}
}
