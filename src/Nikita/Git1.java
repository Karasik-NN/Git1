package Nikita;

import java.util.Random;
import java.util.Scanner;

public class Git1 {
<<<<<<< HEAD

	public static void main(String[] args) {
int skaitlis, reizes;
Random rand = new Random();
Scanner scan = new Scanner(System.in);
System.out.println("cik reizes mest kaulinu?");
reizes = scan.nextInt();
for(int i=1; i<reizes;i++) {
=======
static void mestKaulinu(int reizes) {
	int skaitlis;
Random rand = new Random();
for (int i=1; i<reizes; i++) {
>>>>>>> idejuzars
	skaitlis = rand.nextInt(6)+1;
System.out.println("Uzkrita skatilis: "+ skaitlis);
}

}
	public static void main(String[] args) {
		mestKaulinu(5);


	}
scan.close();
}


}

