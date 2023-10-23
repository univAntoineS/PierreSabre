package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	
	public Humain(String nom,String boissonFav,int argent)
	{
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	// Getters && Setters
	public String getNom() {
		return nom;
	}
	public String getBoissonFav() {
		return boissonFav;
	}
	public int getArgent() {
		return argent;
	}
	// Autre Fonctions
	public void parler(String texte)
	{
		System.out.println(texte);
	}
	
	public void direBonjour()
	{
		parler("Bonjour ! Je m’appelle "+ this.nom +" et j’aime boire du " + this.boissonFav);
	}
	
	public void boire()
	{
		parler(" Mmmm, un bon verre de "+ this.boissonFav +" ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain)
	{
		this.argent += gain;
	}
	
	public void perdreArgent(int perte)
	{
		this.argent -= perte;
	}
}
