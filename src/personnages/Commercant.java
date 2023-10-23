package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav, int argent)
	{
		super(nom,boissonFav,argent);
	}
	
	public int seFaireExtorquer()
	{
		return 0;
	}
	
	public void recevoir(int argent)
	{
		this.argent += argent;
	}

}
