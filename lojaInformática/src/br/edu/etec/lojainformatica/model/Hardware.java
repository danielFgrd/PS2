package br.edu.etec.lojainformatica.model;

public class Hardware {
	private int idHardware;
	private String descricao;
	private double precoUnit;
	private int quantAtual;
	private int quantMinima;
	//private Image img;
	///////////////
	public void setIdHardware(int IdHardware){
		this.idHardware = IdHardware;
	}
	
	public int getIdHardware() {
		return idHardware;
	}
	//////////////
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	///////////////
	public void setPrecoUnit(double precoUnit) {
		this.precoUnit = precoUnit;
	}
	
	public double getPrecoUnit() {
		return precoUnit;
	}
	//////////////////
	public void setQuantAtual(int quantAtual) {
		this.quantAtual = quantAtual;
	}
	
	public int getQuantAtual() {
		return quantAtual;
		
	}
	///////////////////
	public void setQuantMinima(int quantMinima) {
		this.quantMinima = quantMinima;
	}
	
	public int getQuantMinima() {
		return quantMinima;
	}

}
