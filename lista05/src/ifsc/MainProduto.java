package ifsc;

import java.util.ArrayList;
import java.util.Arrays;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto prod1 = new Produto();
		long codigo = 213132;
		prod1.setCodBarra((long) 1233138842);
		prod1.setNome("Elisa");
		prod1.setCodBarra(4948l);
		prod1.setPreco(69.99);
		prod1.setFornecedor("Jorge");

		Produto prod2 = new Produto();
		
		prod2.setNome("Vinicius");
		prod2.setCodBarra(809844948l);
		prod2.setPreco(69.50);
		prod2.setFornecedor("Benjamim");
		
		Produto prod3 = new Produto();
		
		prod3.setNome("Raico");
		prod3.setCodBarra(809844948l);
		prod3.setPreco(69.75);
		prod3.setFornecedor("Max");
		
		ArrayList<Produto> listaProd = new ArrayList<>();
		
		listaProd.add(prod1);
		listaProd.add(prod2);
		listaProd.add(prod3);
		for (Produto produto : listaProd) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarra());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
		}
	}

}
