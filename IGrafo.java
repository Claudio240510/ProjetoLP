public interface IGrafo {

	public int addCidade(String nome);
	
	public void RemoverCidade(Cidade n);

	public void encontraMenorCaminho(Cidade origem);

	public List<Cidade> criarCaminho(Cidade destino);

}

