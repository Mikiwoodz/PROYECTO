package Fichas;

import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.*;

public class Pawn extends Fichas{

	public Pawn(COLOR color, Coordenada c, Tablero t) {
	
		super(color, c , t);
		this.tablero.getCelda(c).setFicha(this);
					
	}
	public String toString() {
		
		if(color.name().equals("WHITE")) 
			
			return FICHA.WHITEPAWN.toString();
		else
			 return FICHA.BLACKPAWN.toString();
	}
	
	//Coordinates possibles WHITE
	public ArrayList<Coordenada> comprobarBlanca() {
		
		Coordenada pos;
		coordenadasPosibles.clear();
		
		//DOWN && DOWN DOWN
		pos=posicion.down();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
			coordenadasPosibles.add(pos);
			pos=posicion.down().down();
			if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null && getPosicion().getCoordenadaY()==2) 
			coordenadasPosibles.add(pos);
		}
			
		// DOWN RIGHT
		pos=posicion.down().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		//DOWN LEFT
		pos=posicion.down().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		return coordenadasPosibles;
			

		
	}	

	//Coordinates possibles BLACK
	public ArrayList<Coordenada> comprobarNegra() {
		
		Coordenada pos;
		coordenadasPosibles.clear();
		
		//UP && UP UP
		pos=posicion.up();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) {
			coordenadasPosibles.add(pos);
			pos=pos.up();
			if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null && posicion.getCoordenadaY()==7) 
				coordenadasPosibles.add(pos);
		}
			
		// UP RIGHT
		pos=posicion.up().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
		coordenadasPosibles.add(pos);
		
		//UP LEFT
		pos=posicion.up().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor()))
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
