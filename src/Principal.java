
public class Principal {

	public static void main(String[] args) {
		Dicionario d = new Dicionario();
		
		d.adicionarPalavra("I", "eu");

		System.out.println(d.recuperaPalavra("I"));
	}
}
