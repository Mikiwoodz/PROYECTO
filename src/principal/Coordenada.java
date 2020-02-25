package principal;

public class Coordenada {

	

	private char X;
	private int Y;
	
	public Coordenada( int coordenadaY,char coordenadaX) {
		super();
		X = coordenadaX;
		Y = coordenadaY;
	}

	public char getCoordenadaX() {
		return X;
	}

	public void setCoordenadaX(char coordenadaX) {
		X = coordenadaX;
	}

	public int getCoordenadaY() {
		return Y;
	}

	public void setCoordenadaY(int coordenadaY) {
		Y = coordenadaY;
	}
	
	public Coordenada up() {
		
		return new Coordenada(this.Y-1 ,this.X );
	}
	public Coordenada down() {
		
		return new Coordenada(this.Y+1 ,this.X );
		
	}
	public Coordenada right() {
		
		return new Coordenada(this.Y ,(char) (this.X+1) );
		
	}
	
	public Coordenada left() {
		
		return new Coordenada(this.Y ,(char) (this.X-1) );
	}

	@Override
	public String toString() {
		return "("+ X + "," + Y + ")";
	}
	
	
	
	
	
	
}
