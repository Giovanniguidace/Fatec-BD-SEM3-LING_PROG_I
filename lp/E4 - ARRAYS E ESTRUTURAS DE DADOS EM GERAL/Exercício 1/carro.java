package Exercícios;

public class carro{
	private String nome_carro;
	private String modelo_carro;
	private String cor_carro;
	private String placa_carro;
	private double preco_carro;

	public carro(String nome_carro, String modelo_carro, String cor_carro,String placa_carro, double preco_carro) {
	
	this.nome_carro = nome_carro;
	this.modelo_carro = modelo_carro;
	this.cor_carro = cor_carro;
	this.preco_carro = preco_carro;
	this.placa_carro = placa_carro;
	}

	public String getNome_carro() {
		return nome_carro;
	}

	public void setNome_carro(String nome_carro) {
		this.nome_carro = nome_carro;
	}

	public String getModelo_carro() {
		return modelo_carro;
	}

	public void setModelo_carro(String modelo_carro) {
		this.modelo_carro = modelo_carro;
	}

	public String getCor_carro() {
		return cor_carro;
	}

	public void setCor_carro(String cor_carro) {
		this.cor_carro = cor_carro;
	}

	public double getPreco_carro() {
		return preco_carro;
	}

	public void setPreco_carro(double preco_carro) {
		this.preco_carro = preco_carro;
	}
	
	public String getPlaca_carro() {
		return placa_carro;
	}

	public void setPlaca_carro(String placa_carro) {
		this.placa_carro = placa_carro;
	}
	
}
