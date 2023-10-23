package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav)
	{
		super(nom,boissonFav,20);
	}
	
	public int seFaireExtorquer()
	{
		int argentPerdu = this.argent;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		this.argent = 0;
		return argentPerdu;
	}
	
	public void recevoir(int argent)
	{
		parler(argent + " sous ! Je te remercie généreux donateur!");
		this.argent += argent;
	}

}
