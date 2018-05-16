package br.com.db1.start.recibo;

public class Servico {

	private String nome;
	private Double valorUnitario;

	public Servico(String nome, Double valorUnitario) {
		super();
		this.nome = nome;
		this.valorUnitario = valorUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}
