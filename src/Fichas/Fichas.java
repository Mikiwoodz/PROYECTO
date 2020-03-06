package Fichas;

import java.util.ArrayList;

import principal.Coordenada;
import principal.Tablero;

public abstract class Fichas {

	
	public enum COLOR{
		
		WHITE("\u001B[37m"), BLACK("\u001B[30m");
		
		private String color;
		
		COLOR(String color){
			
			this.color=color;
			
		}
		public String ToString() {
			
			return color;
			
		}
		
	}
	
	
	public enum FICHA{
		
		WHITEROOK("\u2656", COLOR.WHITE), WHITEQUEEN("\u2655",COLOR.WHITE), 
		WHITEKING("\u2654",COLOR.WHITE), WHITEBISHOP("\u2657", COLOR.WHITE), 
		WHITEKNIGHT("\u2658",COLOR.WHITE), WHITEPAWN("\u2659",COLOR.WHITE),
		BLACKROOK("\u265C", COLOR.BLACK), BLACKQUEEN("\u265B",COLOR.BLACK), 
		BLACKKING("\u265A",COLOR.BLACK), BLACKBISHOP("\u265D", COLOR.BLACK), 
		BLACKKNIGHT("\u265E",COLOR.BLACK), BLACKPAWN("\u265F",COLOR.BLACK),;
		private String ficha;
		private COLOR color;
		
		FICHA(String ficha, COLOR color){
			this.ficha=ficha;
			this.color=color;
		}

		public String getFicha() {
			return ficha;
		}

		public void setFicha(String ficha) {
			this.ficha = ficha;
		}

		public COLOR getColor() {
			return color;
		}

		public void setColor(COLOR color) {
			this.color = color;
		}
		
		public String toString() {
			
			return ficha ;
		}
	}
	
	
	protected FICHA ficha;
	protected COLOR color;
	protected Coordenada posicion;
	protected Tablero tablero;
	protected ArrayList<Coordenada> coordenadasPosibles= new ArrayList<Coordenada>();
	
	
	public Fichas(COLOR color, Coordenada c, Tablero t) {
		
		this.color = color;
		posicion = c;
		this.tablero = t;
	}
	
	
	public COLOR getColor() {
		return color;
	}

	
	public void setColor(COLOR color) {
		this.color = color;
	}


	public Coordenada getPosicion() {
		return posicion;
	}


	public void setPosicion(Coordenada posicion) {
		this.posicion = posicion;
	}


	public Tablero getTablero() {
		return tablero;
	}
	
	
	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	
	public abstract ArrayList<Coordenada> getCoordenadasPosibles();

	
	public boolean equals(Object object){
		
        boolean sameSame = false;

        if (object != null && object instanceof Coordenada){
        	
            sameSame = this.posicion.getCoordenadaX() == ((Coordenada) object).getCoordenadaX() 
            && this.posicion.getCoordenadaY() == ((Coordenada) object).getCoordenadaY();
            
        }

        return sameSame;
    }
	
	
	public boolean contains(Object c) {
		
        Coordenada a = (Coordenada) c;

        for(Coordenada b : coordenadasPosibles) {

            if (b.equals(a))
            	return true;

        }
 
        return false;
    }
	
	
	public String toString() {
		
		 return ficha.color.toString() +  ficha.toString() + "\u001B[0m";
	}

	
}
