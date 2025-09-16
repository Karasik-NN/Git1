package Nikita;
import java.util.Scanner;

public class vertejums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Ievadit skolenu skaitu: ");
        int sksk=scan.nextInt();
        scan.nextLine();
        
        String[] skoleni=new String[sksk];
        System.out.print("Ievadit darbu skaitu: ");
        int drb=scan.nextInt();
        scan.nextLine();
        
        String[] darbi=new String[drb];
        int[] svars=new int[drb];
        for(int i=0;i<sksk;i++)
        {
        	System.out.print("Vards "+(i+1)+": ");
        skoleni[i]=scan.nextLine();
        }
        for(int i=0;i<drb;i++)
        {
        	System.out.print("Darbs "+(i+1)+": ");
        darbi[i]=scan.nextLine();
        																																																																																																																													}
        System.out.println("Ievadi svarus % (kopā 100):");
        for(int i=0;i<drb;i++)
        {
        	System.out.print(darbi[i]+": ");
        svars[i]=scan.nextInt();
        }
        int[][] atzimes=new int[sksk][drb];
        for(int i=0;i<sksk;i++)
        {
        	System.out.println("\nAtzimes "+skoleni[i]+":");
            for(int j=0;j<drb;j++)
            {System.out.print(darbi[j]+": ");
            atzimes[i][j]=scan.nextInt();
            }
            }
        double[] videjas=new double[sksk];
        double klaseSumma=0;
        for(int i=0;i<sksk;i++)
        {
        	double sum=0;
            for(int j=0;j<drb;j++)
            	sum+=atzimes[i][j]*svars[j]/100.0;
            videjas[i]=sum;
            klaseSumma+=sum;
            }
        System.out.println("\n--- Rezultāti ---");
        for(int i=0;i<sksk;i++)
        	System.out.printf(skoleni[i],videjas[i]);
        System.out.printf("\nKlases vidējā:"+klaseSumma/sksk);
        scan.close();
    }
}