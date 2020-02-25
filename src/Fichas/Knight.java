package Fichas;



import principal.Coordenada;
import principal.Tablero;

public class Knight extends Fichas {

	public COLOR color;
	private Coordenada XY;
	private Tablero t1;

	public Knight(COLOR color, Coordenada XY, Tablero t1) {
	
		super(color, XY , t1);
		this.XY=XY;
		this.color= color;
		this.t1=t1;
					
	}
	public String toString() {
		
		if(color.name().equals("Blanco")) 
			
			return FICHA.WHITEKNIGHT.toString();
		else
			 return FICHA.BLACKKNIGHT.toString();
	}

	
}
