package principal;

public class Test {

	public static void main(String[] args) {
	
		Tablero t1= new Tablero();
		System.out.println(t1.mostrarTableroInicio());
		
		Coordenada c= new Coordenada(6, 'A');
		System.out.println(c.up());
		System.out.println(c.down());
		System.out.println(c.right());
		System.out.println(c.left());
		
	}
}
