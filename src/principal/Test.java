package principal;

import java.util.Scanner;

import Fichas.*;
import Fichas.Fichas.COLOR;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Tablero t1= new Tablero();
		

		int option;
		menuPrincipal();
		do {
			
			option=sc.nextInt();
			switch(option) {
			case 0: System.out.println("ADIOS");
				
				break;
			case 1: t1.empezarAJugar();
				break;
			default: System.out.println("Introduce otra opcion");
			 	break;
			
			
			}
		
			
			
		}while(option!=0);
			
		
	}
	
	public static void menuPrincipal() {
		
		System.out.println("----------BIENVENIDO AL AJEDREZ-----------");
		System.out.println(" ");
		System.out.println("----------------1. JUGAR------------------");
		System.out.println("----------------0. Salir------------------");
		
		
	}
	



}
