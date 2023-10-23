package personnages;

public class Yakuza extends Humain{

	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String boissonFav, int argent,String clan)
	{
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	void extorquer(Commercant victime)
	{
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentExtorquer = victime.seFaireExtorquer();
		this.argent += argentExtorquer;
		this.reputation += 1;
		parler("J’ai piqué les "+ argentExtorquer +" sous de "+ victime.getNom() +", ce qui me fait "+this.argent+" sous dans ma poche. Hi ! Hi !");
	}
}
