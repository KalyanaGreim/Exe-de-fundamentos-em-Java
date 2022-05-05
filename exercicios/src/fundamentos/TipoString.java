package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		//formas de usar as funcionalidades em String
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!")); //Ex 1
		System.out.println(s + "!!!"); // Ex 2
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
	}

}
