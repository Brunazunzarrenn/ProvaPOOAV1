package br.com.questao2;

public class CartaoDebito {
	 String numcartao;
	 String titularcartao;
	 
	public CartaoDebito(String numcartao, String titularcartao) {
		super();
		this.numcartao = numcartao;
		this.titularcartao = titularcartao;
	}
	public String getNumcartao() {
		return numcartao;
	}
	public void setNumcartao(String numcartao) {
		this.numcartao = numcartao;
	}
	public String getTitularcartao() {
		return titularcartao;
	}
	public void setTitularcartao(String titularcartao) {
		this.titularcartao = titularcartao;
	}

}
