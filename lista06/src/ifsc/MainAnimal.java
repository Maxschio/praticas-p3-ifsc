package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro(); 
		cachorro.late();
		cachorro.setComprimento(40f);
		cachorro.setCor("cinza");
		cachorro.setEcossistema("gato");
		cachorro.setNumerodpatas(4);
		
		Gato gato = new Gato();
		gato.mia();
		gato.setComprimento(20f);
		gato.setCor("cinza");
		gato.setEcossistema("cschorro");
		gato.setNumerodpatas(3);
		
	}

}
