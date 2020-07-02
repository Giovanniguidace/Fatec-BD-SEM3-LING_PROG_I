package E3;

public class getter_setter_private_public_protected{
	private int cod_ordemservico;
	private String marca_carro;
	private String modelo_carro;
	public String cor_carro;
	protected String placa_carro;
	private String tipo_servico;
	private double valor;
	
	public getter_setter_private_public_protected(int cod_ordemservico,String marca_carro, String modelo_carro, String cor_carro,String placa_carro, String tipo_servico, double valor) {
		this.marca_carro = marca_carro;
		this.modelo_carro = modelo_carro;
		this.cor_carro = cor_carro;
		this.placa_carro = placa_carro;	
		this.tipo_servico = tipo_servico;
		this.valor = valor;
	}

	public String getMarca_carro() {
		return marca_carro;
	}

	public void setMarca_carro(String marca_carro) {
		this.marca_carro = marca_carro;
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

	public String getPlaca_carro() {
		return placa_carro;
	}

	public void setPlaca_carro(String placa_carro) {
		this.placa_carro = placa_carro;
	}

	public String getTipo_servico() {
		return tipo_servico;
	}

	public void setTipo_servico(String tipo_servico) {
		this.tipo_servico = tipo_servico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCod_ordemservico() {
		return cod_ordemservico;
	}

	public void setCod_ordemservico(int cod_ordemservico) {
		this.cod_ordemservico = cod_ordemservico;
	}
	
	
	
	
	
}