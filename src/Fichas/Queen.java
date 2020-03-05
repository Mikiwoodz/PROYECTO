package Fichas;



import java.util.ArrayList;

import principal.Coordenada;
import principal.Tablero;

public class Queen extends Fichas {
	
	private COLOR color;
	private Coordenada XY;
	private Tablero t1;
	private ArrayList<Coordenada> CoordenadasPosibles= new ArrayList<Coordenada>();
	
	public Queen(COLOR color, Coordenada XY, Tablero t1) {
	
		super(color, XY , t1);
		this.XY=XY;
		this.color= color;
		this.t1=t1;
					
	}
	public String toString() {
		
		if(color.name().equals("Blanco")) 
			
			return FICHA.WHITEQUEEN.toString();
		else
			 return FICHA.BLACKQUEEN.toString();
	}
	@Override
	public ArrayList<Coordenada> getCoordenadasPosibles() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public void calcularCoordenadasPosibles() {
//		
//		CoordenadasPosibles.clear();
//		Coordenada RecurXY;
//		RecurXY=XY;
//		
//		//Comprobamos que el movimiento ARRIBA DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
//		while(!t1.getT()[RecurXY.up().right().getCoordenadaY()-1][RecurXY.up().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !RecurXY.up().right().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.up().right());
//			RecurXY=RecurXY.up().right();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ABAJO DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
//		while(!t1.getT()[RecurXY.down().right().getCoordenadaY()-1][RecurXY.down().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !RecurXY.down().right().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.down().right());
//			RecurXY=RecurXY.down().right();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ARRIBA IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist	
//		while(!t1.getT()[RecurXY.up().left().getCoordenadaY()-1][RecurXY.up().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !RecurXY.up().left().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.up().left());
//			RecurXY=RecurXY.up().left();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ABAJO IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist	
//		while(!t1.getT()[RecurXY.down().left().getCoordenadaY()-1][RecurXY.down().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !RecurXY.down().left().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.down().left());
//			RecurXY=RecurXY.down().left();
//			
//		}
//			RecurXY=XY;
//		//Comprobamos que el movimiento ARRIBA DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
//		while(!t1.getT()[RecurXY.up().right().getCoordenadaY()-1][RecurXY.up().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !RecurXY.up().right().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.up().right());
//			RecurXY=RecurXY.up().right();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ABAJO DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
//		while(!t1.getT()[RecurXY.down().right().getCoordenadaY()-1][RecurXY.down().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !RecurXY.down().right().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.down().right());
//			RecurXY=RecurXY.down().right();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ARRIBA IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist	
//		while(!t1.getT()[RecurXY.up().left().getCoordenadaY()-1][RecurXY.up().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !RecurXY.up().left().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.up().left());
//			RecurXY=RecurXY.up().left();
//		}
//			RecurXY=XY;
//		
//		//Comprobamos que el movimiento ABAJO IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist	
//		while(!t1.getT()[RecurXY.down().left().getCoordenadaY()-1][RecurXY.down().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !RecurXY.down().left().equals(null)) {
//			CoordenadasPosibles.add(RecurXY.down().left());
//			RecurXY=RecurXY.down().left();
//			
//		}
//			RecurXY=XY;
//		
//	}
//
//	
	

}
