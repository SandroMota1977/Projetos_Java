package entities;

public class Produtos_Constructor_Sobrecarga {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Produtos_Constructor_Sobrecarga() {
		
	}
	
	public Produtos_Constructor_Sobrecarga(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public Produtos_Constructor_Sobrecarga(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	
		
	}

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
		+ ", pre�o R$ " 
		+ String.format("%.2f", preco) 
		+ ", " 
		+ quantidade 
		+ " unidades. Valor Total: R$ "
		+ String.format("%.2f", valorTotalEstoque());

	}

}
