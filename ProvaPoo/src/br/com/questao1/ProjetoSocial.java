package br.com.questao1;

import javax.swing.JOptionPane;

public class ProjetoSocial {

	public static void main(String[] args) {
		
		String op = JOptionPane.showInputDialog("(1) Distribui��o de Alimentos \n(2) Trabalho Volunt�rio \n(3) Sair");
		
		
		switch (op) {
			case "1":
				DistribuicaoAlimento x = new DistribuicaoAlimento("alimentoPaulo", "qtdePaulo", "descricaoPaulo","enderecoPaulo", "iniciodataPaulo", "finaldataPaulo");
				
				x.validarProjeto("PauloDISTRIBUICAO_ALIMENTO");
				JOptionPane.showMessageDialog(null, x.imprimeProjeto());
				
				break;
			case "2":
				TrabalhoVoluntario y = new TrabalhoVoluntario("alimentoPaulo", 3, "descricaoPaulo","enderecoPaulo", "iniciodataPaulo", "finaldataPaulo");
				y.validarProjeto("PauloTRABALHO_VOLUNTARIO");
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