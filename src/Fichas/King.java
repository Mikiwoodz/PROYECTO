package Fichas;

import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.Coordenada;
import principal.Tablero;

public class King extends Fichas {



	public King(COLOR color, Coordenada c, Tablero t1) {
	
		super(color, c , t1);
	
		this.tablero.getCelda(c).setFicha(this);
					
	}
	public String toString() {
		
		if(color.name().equals(COLOR.WHITE)) 
			
			return FICHA.WHITEKING.toString();
		else
			 return FICHA.BLACKKING.toString();
	}	
	
	//Coordenadas posibles NEGRA
	public ArrayList<Coordenada> comprobarNegra() {
		

		Coordenada pos;
		
		// DOWN
		pos=posicion.down();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		

		// UP
		pos=posicion.up();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
		
		//LEFT
		pos=posicion.left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
	
		//RIGHT
		pos=posicion.right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
			
		//UP RIGHT
		pos=posicion.up().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
			
		//UP LEFT
		pos=posicion.up().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
			
		//DOWN RIGHT
		pos=posicion.down().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
		
		//DOWN LEFT
		pos=posicion.down().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
		return coordenadasPosibles;

		
	}
	//Coordenadas posibles BLANCA
	public ArrayList<Coordenada> comprobarBlanca() {
		

		Coordenada pos;
		
		// DOWN
		pos=posicion.down();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		

		// UP
		pos=posicion.up();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
		
		//LEFT
		pos=posicion.left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
	
		//RIGHT
		pos=posicion.right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
			
		//UP RIGHT
		pos=posicion.up().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
			
		//UP LEFT
		pos=posicion.up().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
			
		//DOWN RIGHT
		pos=posicion.down().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
		
		//DOWN LEFT
		pos=posicion.down().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null)
		coordenadasPosibles.add(pos);
		
		return coordenadasPosibles;

		
	}
	
	
	public ArrayList<Coordenada> getCoordenadasPosibles() {
		
		if(ficha.getColor().equals(COLOR.WHITE))
			return comprobarBlanca();
			else
			return comprobarNegra();
		
	}
	
	
	  
}
