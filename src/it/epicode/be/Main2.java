package it.epicode.be;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
//		Primoesercizio();
//		Secondoesercizio();
		Terzoesercizio();
	}
	
	public static void Primoesercizio(){
		Scanner in = new Scanner(System.in);
		
		//primo esercizio
		
		System.out.println("Primo numero");
		int num1 = in.nextInt();
		
		System.out.println("Secondo numero");
		int num2= in.nextInt();
		
		int result = num1 * num2;
		
		System.out.println("Risultato:" + result);
		
		in.close();
	}
		
		
		//secondo esercizio 
	public static void Secondoesercizio() {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il numero");
		int numero = in.nextInt();
		System.out.println("Inserisci il testo");
		String text = in.nextLine();
		String concatenazione = text + numero;
		System.out.println("Concatenazione:" + concatenazione);
		in.close();
	}
		
		//terzo esercizio 
	public static void Terzoesercizio() {
		Scanner in = new Scanner(System.in);
		
		String[] array = {"lillo","chiara","laura","francesco","lorenzo"};
		System.out.println("Scrivi il tuo nome:");
		String newName = in.nextLine();
		array[2] = newName;
		String thirdposition = array[3];
		String fourthposition = array[4];
		
		array[3]= fourthposition;
		array[4] = thirdposition;
		System.out.println(Arrays.toString(array));
		
		in.close();
		
		
	}
		
}
