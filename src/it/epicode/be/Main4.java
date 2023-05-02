package it.epicode.be;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pariDispari();
        perimetro();

	}
	public static void pariDispari() {
		Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int numero = in.nextInt();
        
        if (numero % 2 == 0) {
        	System.out.println(0);
        }else {
        	System.out.println(1);
        }
        
	}
	
	public static void perimetro() {
		Scanner in = new Scanner(System.in);
		System.out.println("Base");
		double base = in.nextDouble();
		System.out.println("Altezza");
		double altezza = in.nextDouble();
		System.out.println("il perimetro è:" + (base+altezza) *  2);
	}


}

