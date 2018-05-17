package br.com.db1.start.recibo;

import javax.print.DocFlavor.BYTE_ARRAY;

public class Emitente {

	private String cpf;
	private String nome;
	private String rg;
	private BYTE_ARRAY assinatura;

	public Emitente() {
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

	public String getCpfFormatado() {
		String cpfFormatado = cpf;
		if (cpfFormatado.length() == 11) {
			cpfFormatado = cpfFormatado.substring(0, 3) + "." + cpfFormatado.substring(3, 6) + "."
					+ cpfFormatado.substring(6, 9) + "-" + cpfFormatado.substring(9, 11);
			return cpfFormatado;
		}
		return null;
		}
	}

