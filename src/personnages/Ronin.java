package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav)
	{
		super(nom, boissonFav, 60);
	}
	
	void donner(Commercant beneficiaire)
	{
		
		int argentDonner = (int)(argent/10);
		this.argent -= argentDonner;
		parler(" "+ beneficiaire.getNom()+ " prend ces "+ argentDonner +" sous.");
		beneficiaire.gagnerArgent(argentDonner);
	}	

}
