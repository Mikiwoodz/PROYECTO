package Fichas;

import principal.Coordenada;
import principal.Tablero;

public abstract class Fichas {

	public enum COLOR{
		
		WHITE("\u001B[37m"), BLACK("\\u001B[30m");
		
		private String color;
		
		COLOR(String color){
			
			this.color=color;
			
		}
		public String ToString() {
			
			return color;
			
		}
		
	}
	
	public enum FICHA{
		
		WHITEROOK("R", COLOR.WHITE), WHITEQUEEN("Q",COLOR.WHITE), WHITEKING("K",COLOR.WHITE), WHITEBISHOP("B", COLOR.WHITE), WHITEKNIGHT("C",COLOR.WHITE), WHITEPAWN("P",COLOR.WHITE),
		BLACKROOK("R", COLOR.BLACK), BLACKQUEEN("Q",COLOR.BLACK), BLACKKING("K",COLOR.BLACK), BLACKBISHOP("B", COLOR.BLACK), BLACKKNIGHT("C",COLOR.BLACK), BLACKPAWN("P",COLOR.BLACK),;
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
	
	private FICHA ficha;
	private COLOR color;
	private Coordenada XY;
	private Tablero t;
	

	public Fichas(COLOR color, Coordenada xY, Tablero t) {
		super();
		this.color = color;
		XY = xY;
		this.t = t;
	}

	public Tablero getT() {
		return t;
	}

	public void setT(Tablero t) {
		this.t = t;
	}


	
	public COLOR getColor() {
		return color;
	}

	public void setColor(COLOR color) {
		this.color = color;
	}

	public Coordenada getXY() {
		return XY;
	}

	public void setXY(Coordenada xY) {
		XY = xY;
	}
	

	
	public String toString() {
		
		 return ficha.color.toString() +  ficha.toString() + "\u001B[0m";
	}
	
}
