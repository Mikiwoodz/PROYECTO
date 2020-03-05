package principal;

public class Coordenada {

	private char x;
	private int y;
	
	
	public Coordenada( int coordenadaY,char coordenadaX) {
		
		super();
		x = coordenadaX;
		y = coordenadaY;
		
	}
	public char getCoordenadaX() {
		
		return x;
		
	}
	public void setCoordenadaX(char coordenadaX) {
		
		x = coordenadaX;
		
	}
	public int getCoordenadaY() {
		
		return y ;
		
	}
	public void setCoordenadaY(int coordenadaY) {
		
		y = coordenadaY;
		
	}
	public Coordenada up() {
		
		return new Coordenada(this.y-1 ,this.x );   
		
	}
	public Coordenada down() {
		
		return new Coordenada(this.y+1 ,this.x );
		
	}
	public Coordenada right() {
		
		return new Coordenada(this.y ,(char) (this.x+1) );
		
	}
	
	public Coordenada left() {
		
		return new Coordenada(this.y ,(char) (this.x-1) );
	}

	@Override
	public String toString() {
		
		return "("+ x + "," + y + ")";
		
	}
	
	
	
	
	
	
}
