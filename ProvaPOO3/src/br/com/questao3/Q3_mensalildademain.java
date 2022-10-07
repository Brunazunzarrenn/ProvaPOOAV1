package br.com.questao3;
import java.util.Scanner;
public class Q3_mensalildademain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o valor da mensalidade? ");
		double mensalidade = scan.nextDouble();
		
		System.out.println("Quantidade de irmão? ");
		int qtd_irmao = scan.nextInt();
		scan.close();
		
		Q3_mensalidade matricula = new Q3_mensalidade(mensalidade, qtd_irmao);
		
		matricula.calculaMensalidade();
		System.out.println("Valor da mensalidade: "+ matricula.getMensalidade());
	}

}

