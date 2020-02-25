package entities;

public class Produtos_Constructor_Encapsulamento_Cl {

	private String nome;
	private double preco;
	private int quantidade;
	
	public Produtos_Constructor_Encapsulamento_Cl() {
	}
	
	public Produtos_Constructor_Encapsulamento_Cl(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public Produtos_Constructor_Encapsulamento_Cl(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
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
		+ ", preço R$ " 
		+ String.format("%.2f", preco) 
		+ ", " 
		+ quantidade 
		+ " unidades. Valor Total: R$ "
		+ String.format("%.2f", valorTotalEstoque());

	}

}
