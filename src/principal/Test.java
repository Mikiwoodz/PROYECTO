package principal;

public class Test {

	public static void main(String[] args) {
	
		Tablero t1= new Tablero();
		System.out.println(t1.mostrarTableroInicio());
		
		t1.moverFicha('A', 7, 'A', 1);
		System.out.println(t1.mostrarTableroInicio());
		t1.moverFicha('A', 1, 'B', 1);
		System.out.println(t1.mostrarTableroInicio());
	}
}
