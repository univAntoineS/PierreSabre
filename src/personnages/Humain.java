package personnages;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Humain implements Comparable<Humain>{
	protected String nom;
	protected String boissonFav;
	protected int argent;
	
	public PriorityQueue<Humain> connaissances = new PriorityQueue<>();
	private int nbConnaissance = 0;
	
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
	protected void parler(String texte)
	{
		System.out.println("("+this.nom+") - " +texte);
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
	
	private void memoriser(Humain autreHumain)
	{
		if(this.nbConnaissance<30)
		{
			this.connaissances.add(autreHumain);
			this.nbConnaissance++;
		}
		else
		{
			this.connaissances.poll();
			this.connaissances.add(autreHumain);
		}
	}
	
	public void repondre(Humain autreHumain)
	{
		this.direBonjour();
		this.memoriser(autreHumain);
	}
	
	public void faireConnaissance(Humain autreHumain)
	{
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance()
	{
		String strToSay = "";
		Iterator<Humain> it = this.connaissances.iterator();
		while(it.hasNext())
		{
			strToSay += it.next().getNom() + ", ";
		}
		this.parler("Je connais beaucoup de monde dont : " + strToSay);

	}
	@Override
	public int compareTo(Humain o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
