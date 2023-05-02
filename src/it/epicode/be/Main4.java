package it.epicode.be;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pariDispari();
//        perimetro();
        perimetroTriangolo();

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
	
	public static void perimetroTriangolo() {
		  Scanner in = new Scanner(System.in);
	        System.out.print("primo lato del triangolo: ");
	        double lato1 = in.nextDouble();
	        System.out.print("secondo lato del triangolo: ");
	        double lato2 = in.nextDouble();
	        System.out.print("terzo lato del triangolo: ");
	        double lato3 = in.nextDouble();
	        double perimetro = lato1+lato2+lato3;
	        double area = Math.sqrt(perimetro * (perimetro-lato1) * (perimetro-lato2) * (perimetro-lato3));
	        System.out.println("l'area del triangolo è:" + area);
	}


}

