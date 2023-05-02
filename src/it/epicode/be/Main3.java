package it.epicode.be;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Inserisci la prima stringa: ");
        String string1 = in.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String string2 = in.nextLine();
        System.out.print("Inserisci la terza stringa: ");
        String string3 = in.nextLine();
        String concatenation = string1.concat(string2).concat(string3);
        System.out.println("Concatenazione : " + concatenation);
        
//        String reverse = string3 + " " +  string2 + " " + string1;
//        
//        
//        System.out.println("al contrario :" + reverse);
        in.close();
        
	}

}
