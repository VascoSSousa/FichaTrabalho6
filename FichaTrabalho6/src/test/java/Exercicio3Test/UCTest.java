package Exercicio3Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import Exercicio3.Nota;
import Exercicio3.UC;

public class UCTest {
	
	
	private UC uc;
	@BeforeEach
	public void setupt() {
		uc=new UC("Qualidade Software",3);
		
	}
	
	@ParameterizedTest
	@DisplayName("Criar uma Nota")
	@CsvSource(value= {"41271, 15.1"})
	public void testInsereNotaUC(int numAluno,double nota) {
		uc.insereNotaUC(numAluno, nota);
		assertFalse(uc.getNotas().isEmpty());
		assertEquals(1, uc.notas.size());
	}
	
	@ParameterizedTest
	@DisplayName("Pesquisar Aluno")
	@ValueSource(ints= {41271})
	public void testPesquisaAluno(int numAluno) {
		int numero=41271;
		double nota=15.1;
		uc.insereNotaUC(numero, nota);
		assertEquals(15.1,uc.pesquisaAluno(numAluno));
	}
	
	@ParameterizedTest
	@DisplayName("Verificar aprovacao")
	@CsvSource(value= {"41271,15.1"})
	public void testAprovado(int numAluno,double nota) {
		uc.insereNotaUC(numAluno, nota);
		assertTrue(uc.aprovado(numAluno));
	}
	
	@Test
	@DisplayName("Verificar media")
	public void testMedia() {
		int numero=41271;
		double nota=15.1;
		uc.insereNotaUC(numero, nota);
		int numero2=41342;
		double nota2=14.1;
		uc.insereNotaUC(numero2, nota2);
		double expected=14.6;
		assertEquals(14.6,uc.media());
	}
}
