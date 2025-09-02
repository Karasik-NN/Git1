package Nikita;

import java.util.Random;

public class Git1 {
static void mestKaulinu(int reizes) {
	int skaitlis;
Random rand = new Random();
for (int i=1; i<reizes; i++) {
	skaitlis = rand.nextInt(6)+1;
System.out.println("Uzkrita skatilis: "+ skaitlis);
}

}
	public static void main(String[] args) {
		mestKaulinu(5);


	}

}

