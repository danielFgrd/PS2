package br.edu.etec.lojainformatica.model;

	import java.util.Date;

public class Vendas {
	private Integer idVenda;
	private Integer idCliente;
	private Date data;
	private Double valTotal;
	private Double desconto;
	private Double valPago;
	
	
	
	
	public Integer getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	public Double getValTotal() {
		return valTotal;
	}
	public void setValTotal(Double valTotal) {
		this.valTotal = valTotal;
	}
	
	
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	
	
	public Double getValPago() {
		return valPago;
	}
	public void setValPago(Double valPago) {
		this.valPago = valPago;
	}

}
