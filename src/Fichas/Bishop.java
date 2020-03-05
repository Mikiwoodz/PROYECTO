package Fichas;

import java.util.ArrayList;

import principal.Coordenada;
import principal.Tablero;

public class Bishop extends Fichas {

	public COLOR color;
	private Coordenada XY;
	private Tablero t1;
	private ArrayList<Coordenada> CoordenadasPosibles= new ArrayList<Coordenada>();

	public Bishop(COLOR color, Coordenada XY, Tablero t1) {
	
		super(color, XY , t1);
		this.XY=XY;
		this.color= color;
		this.t1=t1;
					
	}
	public String toString() {
		
		if(color.name().equals("Blanco")) 
			
			return FICHA.WHITEBISHOP.toString();
		else
			 return FICHA.BLACKBISHOP.toString();
	}
	@Override
	public ArrayList<Coordenada> getCoordenadasPosibles() {
		
		return null;
	}

//	public void calcularCoordenadasPosibles() {
//		
//		CoordenadasPosibles.clear();
//		Coordenada RecurXY;
//		RecurXY=XY;
//		
//		
//		//Comprobamos que el movimiento ARRIBA DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
//		while(!t1.getT()[RecurXY.up().right().getCoordenadaY()-1][RecurXY.up().right().getCoordenadaX()].comprobarColor(this.color) && !RecurXY.up().right().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.up().right());
//			RecurXY=RecurXY.up().right();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ABAJO DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
//		while(!t1.getT()[RecurXY.down().right().getCoordenadaY()-1][RecurXY.down().right().getCoordenadaX()].comprobarColor(this.color) && !RecurXY.down().right().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.down().right());
//			RecurXY=RecurXY.down().right();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ARRIBA IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist	
//		while(!t1.getT()[RecurXY.up().left().getCoordenadaY()-1][RecurXY.up().left().getCoordenadaX()].comprobarColor(this.color) && !RecurXY.up().left().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.up().left());
//			RecurXY=RecurXY.up().left();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ABAJO IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist	
//		while(!t1.getT()[RecurXY.down().left().getCoordenadaY()-1][RecurXY.down().left().getCoordenadaX()].comprobarColor(this.color) && !RecurXY.down().left().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.down().left());
//			RecurXY=RecurXY.down().left();
//			
//		}
//			RecurXY=XY;
//		
//	}
}
