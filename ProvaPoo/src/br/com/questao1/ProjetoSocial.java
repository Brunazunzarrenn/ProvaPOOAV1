package br.com.questao1;

import javax.swing.JOptionPane;

public class ProjetoSocial {

	public static void main(String[] args) {
		
		String op = JOptionPane.showInputDialog("(1) Distribui��o de Alimentos \n(2) Trabalho Volunt�rio \n(3) Sair");
		
		
		switch (op) {
			case "1":
				DistribuicaoAlimento x = new DistribuicaoAlimento("alimentoBruna", "qtdeBruna", "descricaoBruna","enderecoBruna", "iniciodataBruna", "finaldataBruna");
				
				x.validarProjeto("BrunaDISTRIBUICAO_ALIMENTO");
				JOptionPane.showMessageDialog(null, x.imprimeProjeto());
				
				break;
			case "2":
				TrabalhoVoluntario y = new TrabalhoVoluntario("alimentoBruna", 3, "descricaoBruna","enderecoBruna", "iniciodataBruna", "finaldataBruna");
				y.validarProjeto("BrunaTRABALHO_VOLUNTARIO");
				JOptionPane.showMessageDialog(null, y.imprimeProjeto());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "Vlwwww!!!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Resposta Inval�da");
		}
		

	}

}
