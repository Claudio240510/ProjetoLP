
public class Main {

	public static void main(String[] args) {
	
		Grafo aeroporto = new Grafo(true);
		
		Cidade Lisboa = new Cidade(0, "Lisboa");
		Cidade Porto = new Cidade(1, "Porto");
		Cidade Bucareste = new Cidade(2, "Bucareste");
		Cidade Paris = new Cidade(3, "Paris");
		Cidade Madrid = new Cidade(4, "Madrid");
		Cidade Atenas = new Cidade(6, "Atenas");
		aeroporto.addLigacao(Lisboa, Bucareste, 4);
		aeroporto.addLigacao(Lisboa, Porto, 1);
		aeroporto.addLigacao(Lisboa, Madrid, 2);
		aeroporto.addLigacao(Lisboa, Atenas, 3);
		aeroporto.addLigacao(Lisboa, Paris, 2);
		
		
	}

}
