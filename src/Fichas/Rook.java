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
	
	public void movPosible() {
		
		for(int i= 0; i<2; i++)
		this.XY=XY.up();

		
		
		
	}

	
	

	
}

