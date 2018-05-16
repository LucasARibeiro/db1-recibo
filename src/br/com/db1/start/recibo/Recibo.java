package br.com.db1.start.recibo;

import java.util.Date;

public class Recibo {

	private Integer numero;
	private Double valor;
	private Date dataCadastro;
	private Boolean confirmacao;
	private Date dataEmissao;
	private Emitente emitente;
	private Pagador pagador;
	private Servico servico;
	private Cidade cidade;

	public Recibo(Integer numero, Double valor, Date dataCadastro, Boolean confirmacao, Date dataEmissao,
			Emitente emitente, Pagador pagador, Servico servico, Cidade cidade) {
		this.numero = numero;
		this.valor = valor;
		this.dataCadastro = dataCadastro;
		this.confirmacao = confirmacao;
		this.dataEmissao = dataEmissao;
		this.emitente = emitente;
		this.pagador = pagador;
		this.servico = servico;
		this.cidade = cidade;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Boolean getConfirmacao() {
		return confirmacao;
	}

	public void setConfirmacao(Boolean confirmacao) {
		this.confirmacao = confirmacao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getValorFormatado() {
		Double valor = getValor();
		return valor.toString();
	}

	public String getDataEmissaoDescritiva() {
		Date dataEmissao = getDataEmissao();
		return dataEmissao.toString();
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Emitente getEmitente() {
		return emitente;
	}

	public void setEmitente(Emitente emitente) {
		this.emitente = emitente;
	}

	public Pagador getPagador() {
		return pagador;
	}

	public void setPagador(Pagador pagador) {
		this.pagador = pagador;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}
}
