package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (�F - 32) * 5/9.0 = �C
		final double FATOR = 5/9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.printf("O resultado � %.0f�C ", celsius );
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.printf("O resultado � %.0f�C", celsius);
		
	}

}
