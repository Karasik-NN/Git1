package OOP;

import java.time.Year;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class MinkuTante {
	
	static String virknesParbaude(String zinojums, String noklusejums) {
		String virkne;
		do {
			virkne = JOptionPane.showInputDialog(zinojums, noklusejums);
			if(virkne ==null)
				return null;
		}while(!Pattern.matches("^[\\p{L} ]+$", virkne));
		return virkne;
	}

	static int skaitlaParbaude(String zinojums, int min, int max) {
		String ievade;
		int skaitlis;
		while(true) {
			ievade = JOptionPane.showInputDialog(null, zinojums, "Datu ievade", JOptionPane.INFORMATION_MESSAGE);
			if(ievade == null)
				return -1;
			
			try {
				skaitlis = Integer.parseInt(ievade);
				if(skaitlis < min || skaitlis > max) {
					JOptionPane.showMessageDialog(null, "Noradits nekorets intervals","Nekorekti dati", JOptionPane.WARNING_MESSAGE);
					continue;
				}
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Netika ievadits vesels skaitlis", "Nekorekti dati", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	
	public static void main(String[] args) {
//Minka Gosa =
        //  new Minka("Gosa", "Svinks", "Melna", "Bogdans ", 2019, true, "kot1.png");

//Gosa.pabarot(" Zivs");

	// Minka lolka =
		//	 new Minka("lolka", "Bez šķirnes", "Balta", "Nikita ", 2022, false, "kot2.png");
		 
	// lolka.pabarot(" Desa");
	// Gosa.medit();
	 
	 
	 String izvele;
	 Minka runcis = null;
	 String[] darbibusaraksts = {
			 "Izveidot kaki", "Izsaukt metodes",
			 "Saglabat faila", "Apskatit failu", "Apturet"
	 };
	 do {
		 izvele = (String)JOptionPane.showInputDialog(null,
				 "Izvelies darbibu", "Darbibu izvele", 
				 JOptionPane.QUESTION_MESSAGE, null, darbibusaraksts, darbibusaraksts[0]);
		 
		 if(izvele==null) {
			 izvele="Apturet";
		 }
		 
		 
		 
		 switch(izvele) {
		 case "Izveidot kaki":
			 String minkaVards = 
			 JOptionPane.showInputDialog("Ievadi kaka vardu", "Felikss");
			 
			 String skirne =
		     JOptionPane.showInputDialog("ievadi kaka skirne", "Meinkuns");
			 
			 String spalvasKrasa =
					 JOptionPane.showInputDialog("Iavedi kazoka krasu", "Melna");
			 
			 String saimnieks =
					 JOptionPane.showInputDialog("Ka sauc saimnieka", "Intars");
			 
			 int dzGads = 
					 skaitlaParbaude("Noradi dzimsanas gadu",
							 (Year.now().getValue())-15, Year.now().getValue());					 
			 break;
		 }
	 }while(!izvele.equals("Apturet"));
	}

}
