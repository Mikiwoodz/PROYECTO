package Fichas;



import java.awt.Color;
import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.Coordenada;
import principal.Tablero;

public class Knight extends Fichas {

//	public COLOR color;
//	private Coordenada posicion;
//	private Tablero tablero;
//	private ArrayList<Coordenada> coordenadasPosibles= new ArrayList<Coordenada>();


	public Knight(COLOR color, Coordenada c, Tablero t) {
	
		super(color, c , t);
		this.posicion=c;
		this.color= color;
		this.tablero=t;
		
		this.tablero.getCelda(c).setFicha(this);
					
	}
	public String toString() {
		
		if(color.name().equals(COLOR.WHITE)) 
			
			return FICHA.WHITEKNIGHT.toString();
		else
			 return FICHA.BLACKKNIGHT.toString();
	}
	
	public ArrayList<Coordenada> comprobarBlanca() {
		
		Coordenada pos;
		
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
	
	  public ArrayList<Coordenada> comprobarNegra() {
		
		Coordenada pos;
		
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
		
		if(ficha.getColor().equals(COLOR.WHITE))
			return comprobarBlanca();
			else
			return comprobarNegra();
		
	}

	
}
