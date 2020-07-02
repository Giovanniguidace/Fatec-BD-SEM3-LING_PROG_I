package Exercicio_3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class agencia_viagens{
		
	public static void main(String[] args) {
		
		int n = 100;
		
		ArrayList<String> destinos = new ArrayList<String>(n);
		
		ArrayList<String> pessoa = new ArrayList<String>(n);
		
		int fica_ou_sai = 1;
		int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de adicionar viagem? 1 - SIM / 2 - NÃO"));
		
		while(fica_ou_sai == 1) {
		
		
		switch(pergunta) {
		
		case 1:
			String cpf_pessoa = JOptionPane.showInputDialog("Por favor, informe o cpf do viajante: ");
			String destino = JOptionPane.showInputDialog("Por favor, informe o destino: ");
			
			destinos.add(destino);
			pessoa.add(cpf_pessoa);
			break;
		
		case 2:
			fica_ou_sai = 0;
			break;
			
		default:
			System.out.println("Informe um valor correto!!");
		
		}
		
		
		
		pergunta = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de adicionar viagem? 1 - SIM / 2 - NÃO"));
		
		if(pergunta == 2) {
			fica_ou_sai = 0;
		}
		}
		for(int i = 0; i<pessoa.size();i++) {
			System.out.println("CPF VIAJANTE: "+pessoa.get(i)+ " DESTINO:"+destinos.get(i) );
		}
	}
}