package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav)
	{
		super(nom, boissonFav, 60);
	}
	
	public void donner(Commercant beneficiaire)
	{
		int argentDonner = (int)(this.argent/10);
		this.argent -= argentDonner;
		parler(" "+ beneficiaire.getNom()+ " prend ces "+ argentDonner +" sous.");
		beneficiaire.recevoir(argentDonner);

	}	
	
	public void provoquer(Yakuza adversaire)
	{
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		int force = 2*this.honneur;
		if(force>=adversaire.getReputation()) // gagne
		{
			this.argent += adversaire.perdre();
			parler("Je t’ai eu petit yakusa!");
		}
		else // perdue
		{
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.argent);
			this.argent = 0;
		}
	}

}
