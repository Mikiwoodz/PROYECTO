package Fichas;


import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.Coordenada;
import principal.Tablero;
public class Pawn extends Fichas{

	private COLOR color;
	private Coordenada XY;
	private Tablero t1;
	private ArrayList<Coordenada> CoordenadasPosibles= new ArrayList<Coordenada>();
	
	public Pawn(COLOR color, Coordenada XY, Tablero t1) {
	
		super(color, XY , t1);
		this.XY=XY;
		this.color= color;
		this.t1=t1;
					
	}
	public String toString() {
		
		if(color.name().equals(COLOR.WHITE)) 
			
			return FICHA.WHITEPAWN.toString();
		else
			 return FICHA.BLACKPAWN.toString();
	}
	public void calcularCordenadasPosibles() {
		
		CoordenadasPosibles.clear();
		
		if(t1.getT()[XY.up().getCoordenadaY()-1][XY.up().getCoordenadaX()].estaVacio() && !XY.up().equals(null))
			CoordenadasPosibles.add(XY.up());
		
		if(t1.getT()[XY.up().getCoordenadaY()-1][XY.up().getCoordenadaX()].estaVacio() && !XY.up().equals(null))
			CoordenadasPosibles.add(XY.up());
		
		//Comprobamos que el movimiento ARRIBA DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.up().right().getCoordenadaY()-1][XY.up().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.up().right().equals(null) && !t1.getT()[XY.up().right().getCoordenadaY()-1][XY.up().right().getCoordenadaX()].estaVacio())
			CoordenadasPosibles.add(XY.up().right());
				
				//Comprobamos que el movimiento ARRIBA IZQUIEDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.up().left().getCoordenadaY()-1][XY.up().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.up().left().equals(null) && !t1.getT()[XY.up().right().getCoordenadaY()-1][XY.up().right().getCoordenadaX()].estaVacio() )
					CoordenadasPosibles.add(XY.up().left());
	}

	
}
