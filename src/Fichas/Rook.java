package Fichas;


import java.util.ArrayList;

import principal.*;

public class Rook extends Fichas {

	private COLOR color;
	private Coordenada XY;
	private Tablero t1;
	private ArrayList<Coordenada> CoordenadasPosibles= new ArrayList<Coordenada>();

	public Rook(COLOR color, Coordenada XY, Tablero t1) {
	
		super(color, XY , t1);
		this.XY=XY;
		this.color= color;
		this.t1=t1;
					
	}
	public String toString() {
		
		if(color.name().equals("Blanco")) 
			
			return FICHA.WHITEROOK.toString();
		else
			 return FICHA.BLACKROOK.toString();
	}
	
	public void calcularCoordenadasPosibles() {
		
		CoordenadasPosibles.clear();
		Coordenada RecurXY;
		RecurXY=XY;
		
		//Comprobamos que el movimiento ARRIBA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist			
		while(!t1.getT()[XY.up().getCoordenadaY()-1][XY.up().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.up().equals(null)) {
			CoordenadasPosibles.add(XY.up());
			RecurXY=XY.up();
		}
		RecurXY=XY;
			
		//Comprobamos que el movimiento ABAJO sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		while(!t1.getT()[XY.down().getCoordenadaY()-1][XY.down().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.down().equals(null)) {
			CoordenadasPosibles.add(XY.down());
			RecurXY=XY.down();
		}
		RecurXY=XY;
		
		//Comprobamos que el movimiento DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		while(!t1.getT()[XY.right().getCoordenadaY()-1][XY.right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.right().equals(null)) {
			CoordenadasPosibles.add(XY.right());
			RecurXY=XY.right();
		}
		RecurXY=XY;
			
		//Comprobamos que el movimiento IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		while(!t1.getT()[XY.left().getCoordenadaY()-1][XY.left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.left().equals(null)) {
			CoordenadasPosibles.add(XY.left());
			RecurXY=XY.left();
		}
		RecurXY=XY;	

	
	}

	
}

