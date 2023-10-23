package histoire;
import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant com = new Commercant("Marco","thé");
		Commercant com2 = new Commercant("Marco2","thé");

		Yakuza yak = new Yakuza("Yaku le noir", "whisky",30, "Warsong" );
		Yakuza yak2 = new Yakuza("Yaku le blanc", "whisky",30, "Warsong" );

		Ronin ron = new Ronin("Roro","Shochu");
		
		System.out.println("\n"+(com.getArgent()+com.getArgent()+
				yak.getArgent() + yak2.getArgent() + ron.getArgent()
				)
		+"\n");

		com.direBonjour();
		yak.direBonjour();
		ron.direBonjour();
		
		
		yak.extorquer(com);
		yak2.extorquer(com2);
		
		ron.provoquer(yak);
		ron.provoquer(yak2);

		ron.donner(com);
		System.out.println("\n"+(com.getArgent()+ com2.getArgent() +
				yak.getArgent() + yak2.getArgent() + ron.getArgent()
				)
		+"\n");
	}

}
