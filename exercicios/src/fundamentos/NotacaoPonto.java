package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia, X";		
		
		s = s.replace("X", "Senhora");
		
		s = s.toUpperCase(); // para funcionar o metodo
		
		s = s.concat("!!!");
		
		System.out.println(s);
		
		
		//outra forma de fazer:
		String y = "Bom dia X".replace("X","Kaly").toUpperCase().concat("!!!");
		System.out.println(y);
	}

}
