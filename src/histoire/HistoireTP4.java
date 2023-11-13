package histoire;
import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant com = new Commercant("Marco","thé");
		Commercant com2 = new Commercant("Marco2","thé");

		Yakuza yak = new Yakuza("Yaku le noir", "whisky",30, "Warsong" );
		Yakuza yak2 = new Yakuza("Yaku le blanc", "whisky",30, "Warsong" );

		Ronin ron = new Ronin("Roro","Shochu");
		

		com.faireConnaissance(ron);
		com.faireConnaissance(yak);
		com.faireConnaissance(yak2);
		com.faireConnaissance(com2);
		com.listerConnaissance();

	}

}
