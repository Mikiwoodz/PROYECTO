package principal;

import java.util.Arrays;

import java.util.Scanner;

import Fichas.Fichas.COLOR;
import Fichas.Fichas.FICHA;
import Fichas.King;
import Fichas.Knight;
import Fichas.Pawn;
import Fichas.Queen;
import Fichas.Rook;
import Fichas.Bishop;
import Fichas.Fichas;
public class Tablero {
	
	Celda[][] t;
	
	
	public Tablero(){
		
		this.t= new Celda[8][8];
		
		for(int fil=0; fil<t.length; fil++) {
			for(int col=0; col<t.length; col++) {
				
				t[fil][col]= new Celda();
				
			}}
				t[0][0].setFicha(new Rook(COLOR.WHITE, new Coordenada(0,'A'), this));
				t[0][1].setFicha(new Knight(COLOR.WHITE, new Coordenada(0,'B'), this));
				t[0][2].setFicha(new Bishop(COLOR.WHITE, new Coordenada(0,'C'), this));
				t[0][3].setFicha(new Queen(COLOR.WHITE, new Coordenada(0,'D'), this));
				t[0][4].setFicha(new King(COLOR.WHITE, new Coordenada(0,'E'), this));
				t[0][5].setFicha(new Bishop(COLOR.WHITE, new Coordenada(0,'F'), this));
				t[0][6].setFicha(new Knight(COLOR.WHITE, new Coordenada(0,'G'), this));
				t[0][7].setFicha(new Rook(COLOR.WHITE, new Coordenada(0,'H'), this));
				for(int i=0; i<8; i++) {
					int a= 'A' + i;
					t[1][i].setFicha(new Pawn(COLOR.WHITE, new Coordenada(1, (char) a), this));
		
				}
				t[7][0].setFicha(new Rook(COLOR.BLACK, new Coordenada(7,'A'), this));
				t[7][1].setFicha(new Knight(COLOR.BLACK, new Coordenada(7,'B'), this));
				t[7][2].setFicha(new Bishop(COLOR.BLACK, new Coordenada(7,'C'), this));
				t[7][3].setFicha(new Queen(COLOR.BLACK, new Coordenada(7,'D'), this));
				t[7][4].setFicha(new King(COLOR.BLACK, new Coordenada(7,'E'), this));
				t[7][5].setFicha(new Bishop(COLOR.BLACK, new Coordenada(7,'F'), this));
				t[7][6].setFicha(new Knight(COLOR.BLACK, new Coordenada(7,'G'), this));
				t[7][7].setFicha(new Rook(COLOR.BLACK, new Coordenada(7,'H'), this));
				for(int i=0; i<8; i++) {
					int a= 'A' + i;
				t[6][i].setFicha(new Pawn(COLOR.BLACK , new Coordenada(6, (char) a), this));
				}
			
		
	}
	

	public String toString() {
		return  Arrays.toString(t);
	}
	
	public void moverFicha(char x1, int y1, char x2, int y2) {
		
		int xOrigen = (int) x1 - 'A';
		int xDestino = (int) x2 - 'A';
		int yOrigen= y1-1;
		int yDestino = y2-1;
		
		if(comprobarOrigen(yOrigen,xOrigen)==false)
			System.out.println("WARNING! En ese origen no se encuentra ninguna ficha");
		
		else {
		
		t[yDestino][xDestino].setFicha(t[yOrigen][xDestino].getFicha());
		t[yOrigen][xOrigen].deleteFicha();
		t[yDestino][xDestino].getFicha().setXY(new Coordenada(yDestino,(char)(xDestino +'A')));
		}
	}
	
	public boolean comprobarOrigen(int yOrigen, int xOrigen) {
		
		if(t[yOrigen][xOrigen].getFicha()==null) 
			
			return false;
		
		return true;
	 
	}
		


	public Celda[][] getT() {
		return t;
	}


	public void setT(Celda[][] t) {
		this.t = t;
	}


	public String  mostrarTableroInicio() {
		
	return  "           A   B   C   D   E   F   G   H\r\n" + 
			"         ╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗\r\n" + 
			"       1 ║ " + t[0][0].toString() +" │ "+ t[0][1].toString() + " │ " + t[0][2].toString() +" │ " + t[0][3].toString() + " │ " + t[0][4].toString() + " │ " + t[0][5].toString() + " │ " + t[0][6].toString() + " │ " + t[0][7].toString() + " ║ 1\r\n" + 
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
			"\r\n" + 
			"  ╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗\r\n" + 
			"  ║ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? ║\r\n" + 
			"  ╟───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───╢\r\n" + 
			"  ║ 1 │ 1 │ 2 │ 2 │ 2 │ 8 │ 1 │ 1 │ 2 │ 2 │ 2 │ 8 ║\r\n" + 
			"  ╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"";
	}
}
