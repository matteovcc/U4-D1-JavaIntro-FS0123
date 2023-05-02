package it.epicode.be;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Primo numero");
		int num1 = in.nextInt();
		
		System.out.println("Secondo numero");
		int num2= in.nextInt();
		
		int result = num1 * num2;
		
		System.out.println("Risultato:" + result);
		
//		in.close();
		
		
		
		String testo = "Matteo";
		int x = 10;
		
		System.out.println(testo + x);
		
		
		
//		Scanner second = new Scanner(System.in);
		
		System.out.println("Inserisci il numero");
		int numero = in.nextInt();
		in.nextLine();
		
		System.out.println("Inserisci il testo");
		String text = in.nextLine();
		
		String concatenazione = text + numero;
		System.out.println("Concatenazione:" + concatenazione);
		in.close();
		
		
		
	}
}
