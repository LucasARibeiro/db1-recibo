package br.com.db1.start.recibo;

import javax.print.DocFlavor.BYTE_ARRAY;

public class Emitente {

	private String cpf;
	private String nome;
	private String rg;
	private BYTE_ARRAY assinatura;

	public Emitente(String cpf, String nome, String rg, BYTE_ARRAY assinatura) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.assinatura = assinatura;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public BYTE_ARRAY getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(BYTE_ARRAY assinatura) {
		this.assinatura = assinatura;
	}

}
