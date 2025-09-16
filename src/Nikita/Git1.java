package Nikita;

import java.util.Random;
import java.util.Scanner;

public class Git1 {
	static void mestKaulinu(int reizes) {
		int skaitlis;
	Random rand = new Random();
	for (int i=1; i<reizes; i++) {
	
		skaitlis = rand.nextInt(6)+1;
	}
	}
	public static void main(String[] args) {

int reizes;
Scanner scan = new Scanner(System.in);

System.out.println("cik reizes mest kaulinu?");
reizes = scan.nextInt();
mestKaulinu(reizes);
scan.close();

System.out.println("Uzkrita skatilis: "+ skaitlis);
}

}





