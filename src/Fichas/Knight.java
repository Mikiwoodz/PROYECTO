package Fichas;

import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.*;

public class Knight extends Fichas {

	public Knight(COLOR color, Coordenada c, Tablero t) {
	
		super(color, c , t);
		this.tablero.getCelda(c).setFicha(this);
					
	}
	public String toString() {
		
		if(color.name().equals("WHITE")) 
			
			return FICHA.WHITEKNIGHT.toString();
		else
			 return FICHA.BLACKKNIGHT.toString();
	}
	
	//Coordinates possibles WHITE
	public ArrayList<Coordenada> comprobarBlanca() {
		
		Coordenada pos;
		coordenadasPosibles.clear();
		
		// UP UP RIGHT
		pos=posicion.up().up().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);
			
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		// UP UP LEFT
		pos=posicion.up().up().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		//DOWN DOWN RIGHT
		pos=posicion.down().down().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);

		// DOWN DOWN LEFT
		pos=posicion.down().down().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		// RIGHT RIGHT DOWN
		pos=posicion.right().right().down();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);

		// RIGHT RIGHT UP
		pos=posicion.right().right().up();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		// LEFT LEFT DOWN
		pos=posicion.left().left().down();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		// LEFT LEFT UP
		pos=posicion.left().left().up();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
	
		return coordenadasPosibles;
	}
	
	//Coordinates possibles BLACK
	public ArrayList<Coordenada> comprobarNegra() {
		
		Coordenada pos;
		coordenadasPosibles.clear();
		
		// UP UP RIGHT
		pos=posicion.up().up().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		// UP UP LEFT
		pos=posicion.up().up().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		//DOWN DOWN RIGHT
		pos=posicion.down().down().right();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);

		// DOWN DOWN LEFT
		pos=posicion.down().down().left();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		// RIGHT RIGHT DOWN
		pos=posicion.right().right().down();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);

		// RIGHT RIGHT UP
		pos=posicion.right().right().up();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		// LEFT LEFT DOWN
		pos=posicion.left().left().down();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
		
		// LEFT LEFT UP
		pos=posicion.left().left().up();
		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()!=null && !tablero.getCelda(pos).getFicha().getColor().equals(this.getColor())) 
		coordenadasPosibles.add(pos);

		if(tablero.contieneCoordenada(pos) && tablero.getCelda(pos).getFicha()==null) 
		coordenadasPosibles.add(pos);
	
		return coordenadasPosibles;
	}


	
	@Override
	public ArrayList<Coordenada> getCoordenadasPosibles() {
		
		if(color.name().equals("WHITE"))
			return comprobarBlanca();
			else
				return comprobarNegra();
		
	}

	
}
