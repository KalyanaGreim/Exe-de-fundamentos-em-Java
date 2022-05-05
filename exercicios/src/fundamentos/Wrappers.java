package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//Tipos primitivos versão objeto
		
		//Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next())
		Integer i = 1000;// tipo primitivo é o int
		Long l = 100000L;
		
		Float f = 123F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Character c = '#'; //char
		System.out.println(c);
		
	}

}
