package br.com.db1.start.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.db1.start.recibo.Emitente;
import br.com.db1.start.recibo.Endereco;

class TestUnitario {

	@Test
	void testCepFormatado() {

		Endereco endereco = new Endereco();

		endereco.setCep(87023060);

		assertEquals("87023-060", endereco.getCepFormatado());

	}
	
	
	@Test
	void testCpfFormatado() {
		
		Emitente emitente = new Emitente();
		
		emitente.setCpf("10009989987");
		
		assertEquals("100.099.899-87", emitente.getCpfFormatado());
	}
}
