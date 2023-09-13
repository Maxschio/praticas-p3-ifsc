package ifsc;

import java.util.ArrayList;

public class MainVeiculo {
	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo();
		
		carro1.setNome("Ford Ka ");
		carro1.setAno(2016);
		carro1.setNumeroRodas(4);
		carro1.setFabricante("Ford ");
		carro1.setCor("Branco ");
		
		Veiculo carro2 = new Veiculo();
		
		carro2.setNome("Tucson ");
		carro2.setAno(2018);
		carro2.setNumeroRodas(4);
		carro2.setFabricante("Hyundai ");
		carro2.setCor("Preto ");
		
		Veiculo carro3 = new Veiculo();
		
		carro3.setNome("Gol bola ");
		carro3.setAno(1994);
		carro3.setNumeroRodas(4);
		carro3.setFabricante("Volkswagen ");
		carro3.setCor("Vermelho ");
		
		ArrayList<Veiculo> relampagoMC =  new ArrayList<>();
		
		relampagoMC.add(carro1);
		relampagoMC.add(carro2);
		relampagoMC.add(carro3);
		
		for (Veiculo veiculo : relampagoMC) {
			
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumeroRodas());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println("\n");		}
		
	}
}
