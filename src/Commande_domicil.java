import java.util.Date;

public class Commande_domicil extends Commande
{
	private String Adresse_livraison;
	private int distance;

	public String getAdresse_livraison() {
		return Adresse_livraison;
	}
	public void setAdresse_livraison(String adresse_livraison) {
		Adresse_livraison = adresse_livraison;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}

}
