//CLASSE PRODUTOS

package entities;

public class Produtos {

	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void adicionaProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome 
		+ ", preço R$ " 
		+ String.format("%.2f", preco) 
		+ ", " 
		+ quantidade 
		+ " unidades. Valor Total: R$ "
		+ String.format("%.2f", valorTotalEstoque());

	}

}
