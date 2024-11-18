package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prova.Desafio;

class DesafioTest {
	
	private Desafio meuDesafio;

	@BeforeEach
	void preparaDesafio() {
		this.meuDesafio = new Desafio("Estudar no fim de semana");
	}

	@Test
	public void adicionaExecucao() {
		meuDesafio.adicionaExecucao();
		assertEquals(1, meuDesafio.getExecucao());
	}

}
