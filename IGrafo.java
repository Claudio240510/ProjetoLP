public interface IGrafo {

	public int addCidade(Cidade n);
	
	public void removerCidade(Cidade n);

	public void encontraMenorCaminho(Cidade origem);
	
	public void encontraMaiorCaminho(Cidade origem);

	public List<Cidade> criarCaminho(Cidade destino);
}
