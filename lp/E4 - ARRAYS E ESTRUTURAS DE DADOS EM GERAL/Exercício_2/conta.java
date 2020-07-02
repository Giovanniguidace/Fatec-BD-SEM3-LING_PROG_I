package Exercício_2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class conta{
	
	public static void main(String[] args) {
	
		int n = 100;
		ArrayList<String> vetor_conta = new ArrayList<String>(n);
		ArrayList<String> vetor_pessoa = new ArrayList<String>(n);
		
		int fica_ou_sai_programa = 1;
		
		while(fica_ou_sai_programa == 1) {
			int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Para cadastrar conta, digite 1. Para excluir conta, digite 2. Para sair, digite 3."));
			
		switch(pergunta) {
			case 1:
				for(int i= 0 ; i< n;i++) {
					
					String cpf_pessoa = JOptionPane.showInputDialog("Informe o cpf da pessoa: ");
					vetor_pessoa.add(i, cpf_pessoa);
					String conta_pessoa = JOptionPane.showInputDialog("Nova conta da pessoa: ");
					vetor_conta.add(i, conta_pessoa);
					
					int contra_pergunta = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar uma nova conta? 1 - Sim 2 - Não"));
					
					if(contra_pergunta == 2) {
						i = n;
					}
				}
				break;
			case 2:
				String retorna_cpf = JOptionPane.showInputDialog("Por favor, informe o cpf para exclusão de conta: ");
				for(int x = 0; x<n;x++) {
					
					if(retorna_cpf.equals(vetor_pessoa.get(x))) {
						vetor_pessoa.remove(x);
						vetor_conta.remove(x);
						x = n;
					}
				}
				for(int x = 0; x<vetor_pessoa.size();x++) {
					System.out.println("CPF Pessoa: "+vetor_pessoa.get(x)+" - Conta Pessoa:"+vetor_conta.get(x));
				}
			
								
				break;
			case 3:
				for(int x = 0; x<n;x++) {
					System.out.println("CPF Pessoa: "+vetor_pessoa.get(x)+" - Conta Pessoa:"+vetor_conta.get(x));
				}
				break;
			
			default:
				System.out.println("Número Inválido!!");
				break;
				
			
		}
		int sai_ou_nao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar no programa? 1 - SIM 2 - NAO"));
		
		if(sai_ou_nao == 2) {
			fica_ou_sai_programa = 0;	
		}
	}
		
}
}
			
				
			
			
				
			
				
				
				
	
			
			
			
			
			
			
			
		
		
	
		
		
		
		
				
		
	
		
	
	
	
