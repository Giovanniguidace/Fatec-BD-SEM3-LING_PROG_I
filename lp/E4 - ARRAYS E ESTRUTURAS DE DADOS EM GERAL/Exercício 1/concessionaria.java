package Exercícios;



import javax.swing.JOptionPane;


import Exercícios.carro;

public class concessionaria{
		
	
	
	public static void main(String[] args) {
	
		
		
		
		int n_carros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros: "));
		
		carro[] carros = new carro[n_carros];
		
		for(int i = 0; i < n_carros; i++ ) {
			String nome_carro = JOptionPane.showInputDialog("Informe a marca do carro: ");
			String modelo_carro = JOptionPane.showInputDialog("Informe o modelo do carro: ");
			String cor_carro = JOptionPane.showInputDialog("Informe a cor do carro: ");
			String placa_carro = JOptionPane.showInputDialog("Informe a placa do carro: ");
			
			
			double preco_carro = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do carro: "));
			
			
			carros[i] = new carro(nome_carro,modelo_carro,cor_carro,placa_carro,preco_carro);
			
			
			
		}
		
		for(int i = 0; i<n_carros;i++) {
			System.out.println("Marca do carro: "+carros[i].getNome_carro()+" - Modelo do carro: "+carros[i].getModelo_carro()+" - Cor do carro: "+carros[i].getCor_carro()+" - Placa do carro: "+carros[i].getPlaca_carro()+" - Valor do carro: "+carros[i].getPreco_carro());
		}
		
		
		
		
		
	
	
	
	
	}

	
	}
	
	
	
