package it.epicode.be;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero intero:");
        int numero = in.nextInt();
        
        if (numero % 2 == 0) {
        	System.out.println(0);
        }else {
        	System.out.println(1);
        }
        in.close();

	}


}

