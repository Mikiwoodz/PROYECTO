package Fichas;

import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.*;

public class Rook extends Fichas {

	public Rook(COLOR color, Coordenada c, Tablero t) {
	
		super(color, c , t);
		this.tablero.getCelda(c).setFicha(this);
		
	}
	public String toString() {
		
		if(color.name().equals("WHITE"))
			
			return FICHA.WHITEROOK.toString();
		
		else
			
			 return FICHA.BLACKROOK.toString();
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
		
			return coordenadasPosibles;
		}
		
		
	public ArrayList<Coordenada> getCoordenadasPosibles() {
			
		if(color.name().equals("WHITE"))
			return comprobarBlanca();
			else
				return comprobarNegra();
		
	}
		

	
}

