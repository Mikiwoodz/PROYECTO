package Fichas;




import java.util.ArrayList;

import Fichas.Fichas.COLOR;
import principal.Coordenada;
import principal.Tablero;

public class King extends Fichas {

	public COLOR color;
	private Coordenada XY;
	private Tablero t1;
	private ArrayList<Coordenada> CoordenadasPosibles= new ArrayList<Coordenada>();
	
	public King(COLOR color, Coordenada XY, Tablero t1) {
	
		super(color, XY , t1);
		this.XY=XY;
		this.color= color;
		this.t1=t1;
					
	}
	public String toString() {
		
		if(color.name().equals(COLOR.WHITE)) 
			
			return FICHA.WHITEKING.toString();
		else
			 return FICHA.BLACKKING.toString();
	}	
	
	
	public void calcularCoordenadasPosibles() {
		
		CoordenadasPosibles.clear();
		
		//Comprobamos que el movimiento IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.left().getCoordenadaY()-1][XY.left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.left().equals(null))
			CoordenadasPosibles.add(XY.left());
		
		//Comprobamos que el movimiento DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.right().getCoordenadaY()-1][XY.right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.right().equals(null))
			CoordenadasPosibles.add(XY.right());
		
		//Comprobamos que el movimiento ARRIBA  sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.up().getCoordenadaY()-1][XY.up().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.up().equals(null))
			CoordenadasPosibles.add(XY.up());
		
		//Comprobamos que el movimiento ABAJO sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.down().getCoordenadaY()-1][XY.down().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.down().equals(null))
			CoordenadasPosibles.add(XY.down());
		
		//Comprobamos que el movimiento ARRIBA DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.up().right().getCoordenadaY()-1][XY.up().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.up().right().equals(null))
			CoordenadasPosibles.add(XY.up().right());
		
		//Comprobamos que el movimiento ARRIBA IZQUIEDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.up().left().getCoordenadaY()-1][XY.up().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.up().left().equals(null))
			CoordenadasPosibles.add(XY.up().left());
		
		//Comprobamos que el movimiento ABAJO DERECHA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.down().right().getCoordenadaY()-1][XY.down().right().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.down().right().equals(null))
			CoordenadasPosibles.add(XY.down().right());
		
		//Comprobamos que el movimiento ABAJO IZQUIERDA sea posible(Es decir que no haya una ficha de tu mismo color), en caso de que lo sea se guardará en el arraylist
		if(!t1.getT()[XY.down().left().getCoordenadaY()-1][XY.down().left().getCoordenadaX()].getFicha().getColor().equals(this.color) && !XY.down().left().equals(null))
			CoordenadasPosibles.add(XY.down().left());
		
		
		
		
	}

	
	
}
