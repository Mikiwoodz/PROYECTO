package Fichas;


import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.Coordenada;
import principal.Tablero;
public class Pawn extends Fichas{

	
	public Pawn(COLOR color, Coordenada XY, Tablero t1) {
	
		super(color, XY , t1);
		
					
	}
	public String toString() {
		
		if(color.name().equals(COLOR.WHITE)) 
			
			return FICHA.WHITEPAWN.toString();
		else
			 return FICHA.BLACKPAWN.toString();
	}
	
	//Coordenadas posibles BLANCA
	public ArrayList<Coordenada> comprobarBlanca() {
		
		Coordenada pos;
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
	//Coordenadas posibles NEGRA
	public ArrayList<Coordenada> comprobarNegra() {
		
		Coordenada pos;
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
		
		if(ficha.getColor().equals(COLOR.WHITE))
		return comprobarBlanca();
		else
		return comprobarNegra();
		
	}

	

	
}
