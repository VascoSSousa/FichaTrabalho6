package upt.FichaTrabalho6;

public class Exercicio2 {
	
	public static boolean isPrime(int number) {
	    for (int j = 2; j < number; j++) {
	        if (number % j == 0)
	            return false;   
	    }
	    return true;
	}
	
	public static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}
		else return false;
	}
	
	public static boolean isMultiple(int number, int divisor) {
		if(number%divisor==0) {
			return true;
		}
		else return false;
	}
}
