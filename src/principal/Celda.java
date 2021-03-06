package principal;



import Fichas.Fichas;
import Fichas.Fichas.COLOR;

public class Celda {

	private Fichas ficha;
	
	
	
	public Celda() {
		
		this.ficha=null;
		
	}
	
	public void colocarFicha(Fichas ficha, Coordenada c) {
		
		this.ficha=ficha;
		this.ficha.setPosicion(c);
	
	}
	

	public Fichas getFicha() {
		return ficha;
	}

	public void setFicha(Fichas ficha) {
		this.ficha = ficha;
	}
	
	public void deleteFicha() {
		
		this.ficha=null;
	}
	
	public boolean estaVacio() {
		
		if(ficha==null)
			return true;

		return false;
	}


	public String toString() {
		
		if (estaVacio())
			return " ";
		else
			
		return  ficha.toString();
	}
	public boolean comprobarColor(COLOR color) {
		
		if(estaVacio())
			return false;
		if(ficha.getColor().equals(color))
			return true;
		
		return false;
		
		
	}
	
	

	
	
}
