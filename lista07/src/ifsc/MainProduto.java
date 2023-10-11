package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		Desktop p1 = new Desktop();

		p1.setGamer(true);
		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("Mouse");
		pecas.add("HD");
		p1.setCodBarras(35434);
		p1.setFabricante("Elisa");

		Desktop p2 = new Desktop();

		p2.setGamer(true);
		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("Monitor");
		pecas2.add("Teclado");
		p2.setCodBarras(35434);
		p2.setFabricante("Elisa");

		Desktop p3 = new Desktop();

		p3.setGamer(true);
		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("Placa de video");
		pecas3.add("Tela");
		p3.setCodBarras(35434);
		p3.setFabricante("Elisa");

		ArrayList<Desktop> desktopLista = new ArrayList<>();

		desktopLista.add(p1);
		desktopLista.add(p2);
		desktopLista.add(p3);

		for (Desktop Desktop : desktopLista) {
			
			System.out.println(Desktop.getCodBarras());
			System.out.println(Desktop.getFabricante());
			System.out.println(Desktop.getGamer());
			
			for(String peca : Desktop.getPecas()) {
			System.out.println(peca+" ");
		}

		Smartphones cllr1 = new Smartphones();

		cllr1.setModelo("Iphone");
		cllr1.setDimensoeTela("10X11");
		cllr1.setFabricante("Elisa");
		cllr1.setCodBarras(308569234l);

		Smartphones cllr2 = new Smartphones();

		cllr2.setModelo("Iphone 15");
		cllr2.setDimensoeTela("19X45");
		cllr2.setFabricante("Elisa");
		cllr2.setCodBarras(3085694l);

		Smartphones cllr3 = new Smartphones();

		cllr3.setModelo("Samsung");
		cllr3.setDimensoeTela("40X76");
		cllr3.setFabricante("Elisa");
		cllr3.setCodBarras(8569234l);

		ArrayList<Smartphones> Smartphone = new ArrayList<>();

		Smartphone.add(cllr1);
		Smartphone.add(cllr2);
		Smartphone.add(cllr3);

		for (Smartphones smartphones : Smartphone) {
			System.out.println(smartphones.getCodBarras());
			System.out.println(smartphones.getDimensoeTela());
			System.out.println(smartphones.getFabricante());
			System.out.println(smartphones.getModelo());

		}

	}
	}

	}
