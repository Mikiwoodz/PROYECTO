package Fichas;



import java.awt.Color;
import java.util.ArrayList;

import principal.Coordenada;
import principal.Tablero;

public class Knight extends Fichas {

	public COLOR color;
	private Coordenada XY;
	private Tablero t1;
	private ArrayList<Coordenada> CoordenadasPosibles= new ArrayList<Coordenada>();


	public Knight(COLOR color, Coordenada XY, Tablero t1) {
	
		super(color, XY , t1);
		this.XY=XY;
		this.color= color;
		this.t1=t1;
					
	}
	public String toString() {
		
		if(color.name().equals(COLOR.WHITE)) 
			
			return FICHA.WHITEKNIGHT.toString();
		else
			 return FICHA.BLACKKNIGHT.toString();
	}
	
	public void calcularCoordenadasPosibles(Coordenada Coordenada) {
		
		int OrigenX= Coordenada.getCoordenadaX() - 'A';
		int OrigenY= Coordenada.getCoordenadaY();
		
		CoordenadasPosibles.clear();
		
		//Comprobamos que el movimiento ARRIBA ARRIBA DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.up().up().right().getCoordenadaY()-1][XY.up().up().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.up().up().right().equals(null))			
			CoordenadasPosibles.add(XY.up().up().right());
		
		//Comprobamos que el movimiento ARRIBA ARRIBA IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.up().up().left().getCoordenadaY()-1][XY.up().up().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.up().up().left().equals(null))			
			CoordenadasPosibles.add(XY.up().up().left());
		
		//Comprobamos que el movimiento ABAJO ABAJO DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.down().down().right().getCoordenadaY()-1][XY.down().down().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.down().down().right().equals(null))
			CoordenadasPosibles.add(XY.down().down().right());
		
		//Comprobamos que el movimiento ABAJO ABAJO IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.down().down().left().getCoordenadaY()-1][XY.down().down().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.down().down().left().equals(null))
			CoordenadasPosibles.add(XY.down().down().right());
		
		//Comprobamos que el movimiento DERECHA DERECHA ABAJO sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[ XY.right().right().down().getCoordenadaY()-1][ XY.right().right().down().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.right().right().down().equals(null))
			CoordenadasPosibles.add( XY.right().right().down());
		
		//Comprobamos que el movimiento DERECHA DERECHA ARRIBA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[  XY.right().right().up().getCoordenadaY()-1][  XY.right().right().up().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.right().right().up().equals(null))	
			CoordenadasPosibles.add( XY.right().right().up());

		
		//Comprobamos que el movimiento IZQUIERDA IZQUIERDA ABAJO sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.left().left().down().getCoordenadaY()-1][XY.left().left().down().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.left().left().down().equals(null))			
			CoordenadasPosibles.add( XY.right().right().down());

		//Comprobamos que el movimiento IZQUIERDA IZQUIERDA ARRIBA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if (!t1.getT()[XY.left().left().up().getCoordenadaY()-1][XY.left().left().up().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.left().left().up().equals(null))					
			CoordenadasPosibles.add(XY.left().left().up());
    
     
		
	}
	

	
}
