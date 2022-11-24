package upt.FichaTrabalho6;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercicio2Test {
	
	Exercicio2 numero=new Exercicio2();
	
	@ParameterizedTest
	@DisplayName("Testar se numero e primo")
	@ValueSource(ints= {3,23,311,487,653,947})
	public void testIsPrime(int number) {
		assertTrue(numero.isPrime(number));
	}
	
	@ParameterizedTest
	@DisplayName("Testar se numero e par")
	@ValueSource(ints= {32,64,2,20,30,26})
	public void testIsEven(int number) {
		assertTrue(numero.isEven(number));
	}
	
	@ParameterizedTest
	@DisplayName("Testar se numero e multiplo de outro")
	@CsvSource(value={"23,23","46,23","115,23","184,23","207,23","230,23"})
	public void testIsMultiple(int number,int divisor) {
		assertTrue(numero.isMultiple(number, divisor));
	}
}
