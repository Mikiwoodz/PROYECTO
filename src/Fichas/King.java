package Fichas;

import java.util.ArrayList;

import Fichas.Fichas.COLOR;

import principal.*;

public class King extends Fichas {

	public King(COLOR color, Coordenada c, Tablero t) {
	
		super(color, c , t);
		this.posicion=c;
		this.tablero.getCelda(c).setFicha(this);
					
	}
	
	public String toString() {
		
		if(color.name().equals(COLOR.WHITE))
			
			return ficha.WHITEKING.toString();
		else
			 return ficha.BLACKKING.toString();
	}	
	
	//Coordinates possibles BLACK
	public ArrayList<Coordenada> comprobarNegra() {
		

		Coordenada pos;
		coordenadasPosibles.clear();
		
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
	
	//Coordinates possibles WHITE
	public ArrayList<Coordenada> comprobarBlanca() {
		

		Coordenada pos;
		coordenadasPosibles.clear();
		
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
		
		if(color.name().equals("WHITE"))
			
			return comprobarBlanca();
		
			else
				
				return comprobarNegra();
		
	}
	
	public void getPosicion(Coordenada c) {

		this.posicion=c;
		if (this.color.equals(COLOR.WHITE)) {

			this.tablero.whiteKingPos=this.posicion;
			
		} else {
			this.tablero.blackKingPos=this.posicion;
		}
		
	  
	}
	
}
