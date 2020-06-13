public class Main {

	public static void main(String[] args) {
		Grafo aeroporto = new Grafo();
		Cidade Lisboa = new Cidade("Lisboa");
		Cidade Porto = new Cidade("Porto");
		Cidade Bucareste = new Cidade("Bucareste");
		Cidade Paris = new Cidade("Paris");
		Cidade Madrid = new Cidade("Madrid");
		Cidade Atenas = new Cidade("Atenas");
		
		Cidade origem = Lisboa;
		Cidade destino = Bucareste;
		
		Lisboa.addLigacao(new Ligacao(Porto, 1)); 
		Porto.addLigacao(new Ligacao(Bucareste, 3));
		Lisboa.addLigacao(new Ligacao(Atenas, 4));
		Atenas.addLigacao(new Ligacao(Bucareste, 2));
		Lisboa.addLigacao(new Ligacao(Paris, 3));
		Paris.addLigacao(new Ligacao(Bucareste, 2));
		
		aeroporto.encontraMenorCaminho(origem);
		List<Cidade> caminhoMin = aeroporto.criarCaminho(destino);
		System.out.println(caminhoMin.toString() + " Tempo de Viagem: " + destino.getDistanciaMinima() + " horas.");
		
		aeroporto.encontraMaiorCaminho(origem);
		List<Cidade> caminhoMax = aeroporto.criarCaminho(destino);
		System.out.println(caminhoMax.toString() + " Tempo de Viagem: " + destino.getDistanciaMaxima() + " horas.");
	}

}
