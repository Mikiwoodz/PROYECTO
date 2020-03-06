package principal;

import java.util.Arrays;

import java.util.Scanner;

import Fichas.Fichas.COLOR;
import Fichas.Fichas.FICHA;
import Fichas.*;
public class Tablero {
	
	Celda[][] t;
	public Coordenada whiteKingPos;
	public Coordenada blackKingPos;
	private int finish;
	
	public Tablero(){
		
		this.t= new Celda[8][8];
		
		for(int fil=0; fil<t.length; fil++) {
			for(int col=0; col<t.length; col++) {
				
				t[fil][col]= new Celda();
				
			}}
				t[0][0].setFicha(new Rook(COLOR.WHITE, new Coordenada(1,'A'), this));
				t[0][1].setFicha(new Knight(COLOR.WHITE, new Coordenada(1,'B'), this));
				t[0][2].setFicha(new Bishop(COLOR.WHITE, new Coordenada(1,'C'), this));
				t[0][3].setFicha(new King(COLOR.WHITE, new Coordenada(1,'D'), this));
				t[0][4].setFicha(new Queen(COLOR.WHITE, new Coordenada(1,'E'), this));
				t[0][5].setFicha(new Bishop(COLOR.WHITE, new Coordenada(1,'F'), this));
				t[0][6].setFicha(new Knight(COLOR.WHITE, new Coordenada(1,'G'), this));
				t[0][7].setFicha(new Rook(COLOR.WHITE, new Coordenada(1,'H'), this));
				for(int i=0; i<8; i++) {
					int a= 'A' + i;
					t[1][i].setFicha(new Pawn(COLOR.WHITE, new Coordenada(2, (char) a), this));
		
				}
				t[7][0].setFicha(new Rook(COLOR.BLACK, new Coordenada(8,'A'), this));
				t[7][1].setFicha(new Knight(COLOR.BLACK, new Coordenada(8,'B'), this));
				t[7][2].setFicha(new Bishop(COLOR.BLACK, new Coordenada(8,'C'), this));
				t[7][3].setFicha(new Queen(COLOR.BLACK, new Coordenada(8,'D'), this));
				t[7][4].setFicha(new King(COLOR.BLACK, new Coordenada(8,'E'), this));
				t[7][5].setFicha(new Bishop(COLOR.BLACK, new Coordenada(8,'F'), this));
				t[7][6].setFicha(new Knight(COLOR.BLACK, new Coordenada(8,'G'), this));
				t[7][7].setFicha(new Rook(COLOR.BLACK, new Coordenada(8,'H'), this));
				for(int i=0; i<8; i++) {
					int a= 'A' + i;
				t[6][i].setFicha(new Pawn(COLOR.BLACK , new Coordenada(7, (char) a), this));
				}
				
			
		
	}
	

	public String toString() {
		return  Arrays.toString(t);
	}
	
	
	public boolean comprobarOrigen(COLOR color,Coordenada origen) {
		

		if(!hayFicha(origen) || !contieneCoordenada(origen)) {
		System.out.println("WARNING! En ese origen no se encuentra ninguna ficha");
		return false;
		
		}
			else if(getCelda(origen).getFicha().getColor()!=color) {
				System.out.println("Esa ficha no es tuya");
				return false;
		}
			else {
				if(getCelda(origen).getFicha().getCoordenadasPosibles().isEmpty()) {
				System.out.println("Introduce otro origen, esa ficha no se puede mover");
				return false;
				}
			return true;		
			
		}
				
		
	}
	
	
	public boolean pedirCoordenadas(String turno) {
		
		Scanner sc= new Scanner(System.in);
		int yOrigen=0;
		char xOrigen=' ';
		Coordenada origen=new Coordenada(yOrigen,xOrigen);
		COLOR color=null;

		
		do {
			
			switch(turno) {
			
			case "Player1":
				
				color=COLOR.WHITE;
				System.out.println("Indiqueme la coordenada X");
				xOrigen=sc.next().charAt(0);
		
				System.out.println("Indiqueme la coordenada Y");
				yOrigen=sc.nextInt();
				origen= new Coordenada(yOrigen,xOrigen);
				break;
				
			case "Player2":
				
				color=COLOR.BLACK;
				System.out.println("Indiqueme la coordenada X");
				xOrigen=sc.next().charAt(0);
		
				System.out.println("Indiqueme la coordenada Y");
				yOrigen=sc.nextInt();
				origen= new Coordenada(yOrigen,xOrigen);
				break;
			}
			
		}while(!comprobarOrigen(color,origen));
		
		
		int yDestino=0;
		char xDestino=' ';
		Coordenada destino= new Coordenada(yDestino,xDestino);
		
		do {
		
			switch(turno) {
			
			case "Player1":
				color=COLOR.WHITE;
				System.out.println(getCelda(origen).getFicha().getCoordenadasPosibles().toString());
				System.out.println("Indiqueme la coordenada X de tu destino");
				xDestino=sc.next().charAt(0);
			
				System.out.println("Indiqueme la coordenada Y de tu destino");
				yDestino=sc.nextInt();
				destino= new Coordenada(yDestino, xDestino);
				if(jaqueMate())
					System.out.println("--------------JAQUE---------------");
				if(ganador(destino)) {
					System.out.println("--------------JAQUE MATE HA GANADO EL J1--------------");
					return true;
				}
				
				
			break;
			
			
			case "Player2":
				color=COLOR.BLACK;
				System.out.println(getCelda(origen).getFicha().getCoordenadasPosibles().toString());
				System.out.println("Indiqueme la coordenada X de tu destino");
				xDestino=sc.next().charAt(0);
			
				System.out.println("Indiqueme la coordenada Y de tu destino");
				yDestino=sc.nextInt();
				destino= new Coordenada(yDestino, xDestino);
				if(jaqueMate())
					System.out.println("--------------JAQUE---------------");
				if(ganador(destino)) {
					System.out.println("--------------JAQUE MATE HA GANADO EL J2--------------");
					return true;
				}
				
			break;
			}
		}while(!moverFicha(origen, destino));
		
		turno="Player2";
		System.out.println(mostrarTableroInicio());
		return false;
		
	}
	
	
	public boolean moverFicha(Coordenada o, Coordenada d) {
		
  
		if(getCelda(o).getFicha().getCoordenadasPosibles().contains(d)) {

	       getCelda(d).colocarFicha(getCelda(o).getFicha(),d);
	       getCelda(o).deleteFicha();
	       System.out.println("Ficha movida a : " + getCelda(d).getFicha().getPosicion().toString());
	            
	            
	            return true;


        }
        
        System.out.println("Coordenada no contenida");

        return false;
		
		
	}
	
	
 	public Celda getCelda(Coordenada c) {
		
		return t[c.getCoordenadaY()-1][ c.getCoordenadaX()-'A'];
	}

	
 	public boolean contieneCoordenada(Coordenada c) {
		
		
		if(c.getCoordenadaY()>8 || c.getCoordenadaY()<1)
			return false;
		if(c.getCoordenadaX()< 'A' || c.getCoordenadaX()>'H')
			return false;
		
			return true;
	 
	}
 	
 	
	public boolean hayFicha(Coordenada c) {
		
		if(getCelda(c).estaVacio()==true)
		return false;
		
		return true;
	}
		
	
	public String  mostrarTableroInicio() {
		
	return  "           A   B   C   D   E   F   G   H\r\n" + 
			"         ╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗\r\n" + 
			"       1 ║ " + t[0][0].toString() + " │ "+ t[0][1].toString() +" │ " + t[0][2].toString() +" │ " + t[0][3].toString() + " │ " + t[0][4].toString() + " │ " + t[0][5].toString() + " │ " + t[0][6].toString() + " │ " + t[0][7].toString() + " ║ 1\r\n" + 
			"         ╟───┼───┼───┼───┼───┼───┼───┼───╢\r\n" + 
			"       2 ║ " + t[1][0].toString() +" │ "+ t[1][1].toString() + " │ " + t[1][2].toString() +" │ " + t[1][3].toString() + " │ " + t[1][4].toString() + " │ " + t[1][5].toString() + " │ " + t[1][6].toString() + " │ " + t[1][7].toString() + " ║ 2\r\n" +
			"         ╟───┼───┼───┼───┼───┼───┼───┼───╢\r\n" + 
			"       3 ║ " + t[2][0].toString() +" │ "+ t[2][1].toString() + " │ " + t[2][2].toString() +" │ " + t[2][3].toString() + " │ " + t[2][4].toString() + " │ " + t[2][5].toString() + " │ " + t[2][6].toString() + " │ " + t[2][7].toString() + " ║ 3\r\n" + 
			"         ╟───┼───┼───┼───┼───┼───┼───┼───╢\r\n" + 
			"       4 ║ " + t[3][0].toString() +" │ "+ t[3][1].toString() + " │ " + t[3][2].toString() +" │ " + t[3][3].toString() + " │ " + t[3][4].toString() + " │ " + t[3][5].toString() + " │ " + t[3][6].toString() + " │ " + t[3][7].toString() + " ║ 4\r\n" + 
			"         ╟───┼───┼───┼───┼───┼───┼───┼───╢\r\n" + 
			"       5 ║ " + t[4][0].toString() +" │ "+ t[4][1].toString() + " │ " + t[4][2].toString() +" │ " + t[4][3].toString() + " │ " + t[4][4].toString() + " │ " + t[4][5].toString() + " │ " + t[4][6].toString() + " │ " + t[4][7].toString() + " ║ 5\r\n" + 
			"         ╟───┼───┼───┼───┼───┼───┼───┼───╢\r\n" + 
			"       6 ║ " + t[5][0].toString() +" │ "+ t[5][1].toString() + " │ " + t[5][2].toString() +" │ " + t[5][3].toString() + " │ " + t[5][4].toString() + " │ " + t[5][5].toString() + " │ " + t[5][6].toString() + " │ " + t[5][7].toString() + " ║ 6\r\n" + 
			"         ╟───┼───┼───┼───┼───┼───┼───┼───╢\r\n" + 
			"       7 ║ " + t[6][0].toString() +" │ "+ t[6][1].toString() + " │ " + t[6][2].toString() +" │ " + t[6][3].toString() + " │ " + t[6][4].toString() + " │ " + t[6][5].toString() + " │ " + t[6][6].toString() + " │ " + t[6][7].toString() + " ║ 7\r\n" +
			"         ╟───┼───┼───┼───┼───┼───┼───┼───╢\r\n" + 
			"       8 ║ " + t[7][0].toString() +" │ "+ t[7][1].toString() + " │ " + t[7][2].toString() +" │ " + t[7][3].toString() + " │ " + t[7][4].toString() + " │ " + t[7][5].toString() + " │ " + t[7][6].toString() + " │ " + t[7][7].toString() + " ║ 8\r\n" + 
			"         ╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝\r\n" + 
			"           A   B   C   D   E   F   G   H\r\n" + 
			 
			"";
	}
	
	
	
	public boolean empezarAJugar() {
		
		Scanner sc= new Scanner(System.in);
		String j1= "Jugador1";
		String j2= "Jugador2";
		System.out.println(j1 + " eres las blancas [ARRIBA]");
		System.out.println(j2 + " eres las negras [ABAJO]");
		
		System.out.println("Empiezan las blancas");
		System.out.println("Estas ready?");
		System.out.println("");
		sc.next();
		
		System.out.println(mostrarTableroInicio());
		jugar();
		
		return true;
	}
	
	
	public void jugar() {
		
		String turno;
		
		
		do {
			turno="Player1";
			System.out.println("----------TURNO PARA EL JUGADOR 1-----------");
			System.out.println(" ");
			pedirCoordenadas(turno);
			turno="Player2";
			System.out.println("----------TURNO PARA EL JUGADOR 2-----------");
			System.out.println(" ");
			pedirCoordenadas(turno);
			
		}while(this.finish==0);
	}
	
	
	public boolean jaqueMate() {
		
		for(int i =0; i<8;i++) {
			for(int a = 0; a<8; a++) {
				
				if(!t[i][a].estaVacio()) {
					if(!(t[i][a].getFicha().toString()==Fichas.FICHA.BLACKKING.toString()||t[i][a].getFicha().toString()==Fichas.FICHA.WHITEKING.toString()))
					if(t[i][a].getFicha().getCoordenadasPosibles().contains(blackKingPos) || t[i][a].getFicha().getCoordenadasPosibles().contains(whiteKingPos)) {
						getFinish(0);
						return true;
					
						
					}
					
				}
			}
		}
		return false;
	}
	
	
	public boolean ganador(Coordenada c) {
		
		if(!getCelda(c).estaVacio()) {
			if(getCelda(c).getFicha().toString()==Fichas.FICHA.BLACKKING.toString()||getCelda(c).getFicha().toString()==Fichas.FICHA.WHITEKING.toString()) 
				return true;
			
			else
				return false;
			
		}
			return false;
	}
	
	
	public void clear() {
		
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	
	public void getFinish(int f) {
		
		this.finish=f;
		
	}
}
