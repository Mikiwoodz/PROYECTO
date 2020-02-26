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


	public String toString() {
		
		if (ficha==null)
			return " ";
		else
			
		return  ficha.toString();
	}
	  
	
	

	
	
}
