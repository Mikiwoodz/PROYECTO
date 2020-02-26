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
	
	public void calcularCoordenadas(Coordenada Coordenada) {
		
		int OrigenX= Coordenada.getCoordenadaX() - 'A';
		int OrigenY= Coordenada.getCoordenadaY();
		
	
		if(t1.getT()[XY.up().up().right().getCoordenadaY()-1][XY.up().up().right().getCoordenadaX()].getFicha().getColor()==t1.getT()[OrigenY][OrigenX].getFicha().getColor()){
			
			
		}
        XY.up().up().left();
        XY.down().down().right();
        XY.down().down().left();
        XY.right().right().down();
        XY.right().right().up();
        XY.left().left().down();
        XY.left().left().up();
		
		
	}
	

	
}
