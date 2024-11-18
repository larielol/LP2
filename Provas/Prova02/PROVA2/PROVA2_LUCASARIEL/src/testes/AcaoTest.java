package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import prova.Acao;

class AcaoTest {
	
	private Acao minhaAcao;
	

	@Test
	void testEquals() {
		Acao atividade = new Acao("Viver", "05/05/2015", 60);
		Acao atividade2 = new Acao("Viver", "05/05/2015", 60);
		assertEquals(atividade, atividade2);
	}
}
