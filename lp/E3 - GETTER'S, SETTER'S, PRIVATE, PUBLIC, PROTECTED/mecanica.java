package E3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import E3.getter_setter_private_public_protected;
public class mecanica{
	
	public static void main(String[] args) {
		
		int n = 100;
		getter_setter_private_public_protected[] ordem_servico = new getter_setter_private_public_protected[n];
		
		int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar uma nova ordem de serviço? 1 - SIM / 2 - NÃO"));
		

			
			for(int i =0;i<n;i++) {
			int cod_ordemservico = i+1;	
			String marca_carro = JOptionPane.showInputDialog("Informe a marca do carro: ");
			String modelo_carro = JOptionPane.showInputDialog("Informe o modelo do carro: ");
			String cor_carro = JOptionPane.showInputDialog("Informe a cor do carro: ");
			String placa_carro = JOptionPane.showInputDialog("Informe a placa do carro: ");
			String tipo_servico = JOptionPane.showInputDialog("Informe o tipo de serviço: ");
			double valor_servico = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do serviço: "));
			
			
			ordem_servico[i] = new getter_setter_private_public_protected(cod_ordemservico,marca_carro, modelo_carro, cor_carro, placa_carro, tipo_servico, valor_servico);
			
			int contra_pergunta = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de criar uma nova ordem de serviço? 1 - SIM / 2 - NÃO"));
			
			if(contra_pergunta == 2) {
				i = n;
			}
			}
			
			
		for(int i = 0;i<n;i++) {
			System.out.println("Código ordem de serviço: "+ordem_servico[i].getCod_ordemservico()+"\n"
					+ "Marca do carro: "+ordem_servico[i].getMarca_carro()+"\nModelo carro: "+ordem_servico[i].getModelo_carro()
					+"\nCor: "+ordem_servico[i].getCor_carro()+"\nPlaca: "+ordem_servico[i].getPlaca_carro()+"\nTipo serviço: "
					+ordem_servico[i].getValor());
		}
		
	}
}