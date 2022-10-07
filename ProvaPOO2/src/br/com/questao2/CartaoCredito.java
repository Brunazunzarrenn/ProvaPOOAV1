package br.com.questao2;

public class CartaoCredito {
	 String numcartao;
	 String bandeiracartao;
	 String titularcartao;
	 
	public CartaoCredito(String numcartao, String bandeiracartao, String titularcartao) {
		super();
		this.numcartao = numcartao;
		this.bandeiracartao = bandeiracartao;
		this.titularcartao = titularcartao;
	}
	public String getNumcartao() {
		return numcartao;
	}
	public void setNumcartao(String numcartao) {
		this.numcartao = numcartao;
	}
	public String getBandeiracartao() {
		return bandeiracartao;
	}
	public void setBandeiracartao(String bandeiracartao) {
		this.bandeiracartao = bandeiracartao;
	}
	public String getTitularcartao() {
		return titularcartao;
	}
	public void setTitularcartao(String titularcartao) {
		this.titularcartao = titularcartao;
	}
	 
	
}
