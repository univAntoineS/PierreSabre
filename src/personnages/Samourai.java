package personnages;

public class Samourai extends Ronin{
	private String nomSeigneur;

	
	public Samourai(String nom, String boissonFav, String nomSeigneur) {
		super(nom, boissonFav);
		this.nomSeigneur = nomSeigneur;
	}
	
	@Override
	public void direBonjour() 
	{
		parler("Bonjour ! Je m’appelle "+ this.nom +" et j’aime boire du " + this.boissonFav);
		parler("Je suis fier de servir le seigneur " + this.nomSeigneur);
	}
	
	public void boire(String boisson)
	{
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}


}
