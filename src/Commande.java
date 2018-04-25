import java.util.Date;

public abstract class Commande 
{
	protected Client client;
	protected Boolean Validite;
	protected Date Date_Consommation;
	protected int  Heure_Consommation;
	protected int nb_personne;
	protected int prix;

    public Date getDate_Consommation() {
        return Date_Consommation;
    }
}
