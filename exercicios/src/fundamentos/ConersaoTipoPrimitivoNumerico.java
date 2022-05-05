package fundamentos;

public class ConersaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // conversao implicita
		System.out.println(a);
		
		float b = (float) 1.8888888888888888; //conversao explicita (CAST) - perda de informação
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
