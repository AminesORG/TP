import java.util.Date;

public class Commande_sur_place extends Commande
{
	private TTable type_table;
	private Panier panier;

	public TTable getType_table() {
		return type_table;
	}
	public void setType_table(TTable type_table) {
		this.type_table = type_table;
	}
	public int Prix_Commande()
	{
		return panier.MontantPan();
	}
	
	public int Prix_commande_Reduction()
	{
	return 0;
	}
}
