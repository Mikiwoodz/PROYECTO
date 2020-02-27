package principal;

import Fichas.Fichas;

public class Celda {

	private Fichas ficha;
	
	
	
	public Celda() {
		
		this.ficha=null;
		
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
	  
	
	

	
	
}
