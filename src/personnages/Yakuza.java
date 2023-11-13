package personnages;

public class Yakuza extends Humain{

	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String boissonFav, int argent,String clan)
	{
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	@Override
	public void direBonjour()
	{
		this.parler("Bonjour ! Je m’appelle "+ this.nom +" et j’aime boire du " + this.boissonFav);
		this.parler("Mon clan est celui de " + this.clan);
	}
	
	
	//Getter
	public int getReputation()
	{
		return this.reputation;
	}
	
	public void extorquer(Commercant victime)
	{
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorquer = victime.seFaireExtorquer();
		this.argent += argentExtorquer;
		this.reputation += 1;
		parler("J’ai piqué les "+ argentExtorquer +" sous de "+ victime.getNom() +", ce qui me fait "+this.argent+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre()
	{
		int argentPerdu = this.argent;
		this.argent = 0;
		this.reputation -= 1;
		parler("J’ai perdu mon duel et mes "+argentPerdu+" sous, snif... J'ai déshonoré le clan de "+this.clan+".");
		return argentPerdu;	
	}
	public void gagner(int gain)
	{
		this.argent += gain;
		this.reputation += 1;
		parler("Ce ronin pensait vraiment battre "+ this.nom +" du clan de "+this.clan+" ? Je l'ai dépouillé de ses "+gain+" sous");
	}
}
