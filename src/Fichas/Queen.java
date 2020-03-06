package Fichas;

import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.*;

public class Queen extends Fichas {
	
	public Queen(COLOR color, Coordenada c, Tablero t) {
	
		super(color, c , t);
		this.tablero.getCelda(c).setFicha(this);
					
	}
	
	public String toString() {
		
		if(color.name().equals("WHITE"))
			
			return FICHA.WHITEQUEEN.toString();
		
			else
			
				return FICHA.BLACKQUEEN.toString();
	}
	
	//Coordinates possibles BLACK
	public ArrayList<Coordenada> comprobarNegra() {
		
		Coordenada pos;
		coordenadasPosibles.clear();
		
		// UP
		pos=posicion.up();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.up();
		
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
			coordenadasPosibles.add(pos);
		
		// DOWN
		pos=posicion.down();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.down();
		
		}
		if(tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		// RIGHT
		pos=posicion.right();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.right();
	
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
	
		// LEFT
		pos=posicion.left();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.left();
	
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
			coordenadasPosibles.add(pos);
		
		// UP RIGHT
		pos=posicion.up().right();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.up().right();
						
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 	
		coordenadasPosibles.add(pos);
				
				
		// UP LEFT
		pos=posicion.up().left();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.up().left();
						
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);
				
				
		// DOWN RIGHT
		pos=posicion.down().right();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.down().right();
								
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);	
				
						
		// DOWN LEFT
		pos=posicion.down().left();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.down().left();
								
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);
					
		return coordenadasPosibles;
		
	}
	
	//Coordinates possibles WHITE
	public ArrayList<Coordenada> comprobarBlanca() {
		
		Coordenada pos;
		coordenadasPosibles.clear();
		
		// UP
		pos=posicion.up();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.up();
		
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
			coordenadasPosibles.add(pos);
		
		// DOWN
		pos=posicion.down();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.down();
		
		}
		if(tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		// RIGHT
		pos=posicion.right();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.right();
	
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
	
		// LEFT
		pos=posicion.left();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.left();
	
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
			coordenadasPosibles.add(pos);
		
		// UP RIGHT
		pos=posicion.up().right();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.up().right();
						
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 	
		coordenadasPosibles.add(pos);
				
				
		// UP LEFT
		pos=posicion.up().left();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.up().left();
						
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);
				
				
		// DOWN RIGHT
		pos=posicion.down().right();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.down().right();
								
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);	
				
						
		// DOWN LEFT
		pos=posicion.down().left();
		while(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
		coordenadasPosibles.add(pos);
		pos=pos.down().left();
								
		}
		if( tablero.contieneCoordenada(pos) && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);
					
		return coordenadasPosibles;
		
	}
	
	
	public ArrayList<Coordenada> getCoordenadasPosibles() {
		
		if(color.name().equals("WHITE"))
			return comprobarBlanca();
			else
				return comprobarNegra();
	}

	

}
