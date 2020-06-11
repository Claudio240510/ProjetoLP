public interface IGrafo {

	public void addCidade(Cidade cidade);
	
	public void removeCidade(Cidade cidade);
	
	public void addLigacao(Cidade origem, Cidade destino, double horas);
	
	public void adicionaLigacao(Cidade cidade1, Cidade cidade2, double horas);

	public void imprimeLigacoes();

	public boolean temLigacao(Cidade origem, Cidade destino);
	
	public void encontraMenorCaminho(Cidade origem, Cidade destino);
	
}

