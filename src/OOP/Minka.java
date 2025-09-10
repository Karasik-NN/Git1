package OOP;

import java.awt.Image;
import java.io.File;
import java.time.Year;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Minka {
//atributi
	String vards, skirne, spalvasKrasa, saimnieks;
	int vecums, medijumuSk, edienreize;
	boolean siksnina;
	ImageIcon bilde;
	Random rand = new Random();
	
	// Konstruktors
	Minka(String vards, String skirne, String spalvasKrasa, String saimnieks,
			int dzGads, boolean siksnina, String cels){
		this.vards = vards;
		this.skirne = skirne;
		this.spalvasKrasa = spalvasKrasa;
		this.saimnieks = saimnieks;
		edienreize = kungis();
		vecums = Year.now().getValue() - dzGads;
		medijumuSk = 0;
		this.siksnina = siksnina;
		bilde = new ImageIcon(
				new ImageIcon("Atteli"+File.separator+cels).getImage()
				.getScaledInstance(120, 120, Image.SCALE_SMOOTH));
				
	}

	
	//Metodes
	int kungis() {
		return rand.nextInt(5)+1;
	}
	
	
	
	void murrat() {
		JOptionPane.showMessageDialog(null,
				vards+"saka  'Murr Murr Murr....'","Paziņojums",
				JOptionPane.PLAIN_MESSAGE, bilde);
	}
	
	String nolasitAtributus() {
		return vards+" ir "+vecums+" gadus vecs "+
	skirne+" šķirnes kaķis ar "+spalvasKrasa+" krāsa kažoku."
	+"\nKaķim "+((siksnina)? "ir" : "nav")+" siksnina"
	+"\nKaķa saimnieks ir "+saimnieks+"."
	+"\nMedījumu skaits: " +medijumuSk;
	}
	
	String pabarot(String ediens) {
		if(edienreize > 0) {
			JOptionPane.showMessageDialog(null,
					"Namm... man garso"+ediens
					, "Paziņojums", JOptionPane.INFORMATION_MESSAGE, bilde);
			ediens = "Tukša bļodiņa";
			edienreize--;
		}else {
			JOptionPane.showMessageDialog(null,
					"Murr.... esmu pārēdies un"+ediens+" nevēlos!",
					"Brīginājums", JOptionPane.WARNING_MESSAGE);
			edienreize = kungis();
		}
		
		return ediens;
	}
	//Metozu parslogošana
	void gulet() {
		JOptionPane.showMessageDialog(null,
				saimnieks+"! Aizmirsi man iedot sadziņu, nevarēšu pagulēt!",
				"Kļūde", 
				JOptionPane.ERROR_MESSAGE);
	}
	void gulet(String prieksmets) {
		if(prieksmets.equalsIgnoreCase("sedziņa")) {
			JOptionPane.showMessageDialog(null,
					"Zzzzzz.... paldies par"+prieksmets,"Infomacija",
					 JOptionPane.INFORMATION_MESSAGE, bilde);
			
		}else {
			JOptionPane.showMessageDialog(null, 
					saimnieks+"! "+prieksmets+
					" man neder gelēšanai, murr!","Brīdinājums", 
					JOptionPane.WARNING_MESSAGE);
		}
	}
	 
	void palielinatVecumu() {
		if(vecums <= 16) {
			vecums++;
			JOptionPane.showMessageDialog(null,
					vards+" vecums palielināts par vienu gadu!","Informacija",
					JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,
					"Sasniegts maksinalais vecums!","Bridinajums",
					JOptionPane.WARNING_MESSAGE);
		}
	}
	
	int nolasitVecumu() {
		JOptionPane.showMessageDialog(null,
				vards+" vecums ir "+vecums+" gadus vecs",
				"Informācija", JOptionPane.INFORMATION_MESSAGE);
		
		return vecums;
	}
	void medit() {
		if((rand.nextInt(3)) == 0) {
			medijumuSk++;
			JOptionPane.showMessageDialog(null,
					"Medījums tika notverts!", "Uzvara",
					JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,
					"Medijums aizlaidas :( !","Neveiksme",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
