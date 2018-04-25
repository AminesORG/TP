
public class Client 
{
	private String nom;
	private String Prenom ;
	private String Num_telephone;
	public Client(String nom,String Prenom,String Num_telephone)
	{
		this.nom = nom;
		this.Prenom = Prenom;
		this.Num_telephone = Num_telephone;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getNum_telephone() {
		return Num_telephone;
	}
	public void setNum_telephone(String num_telephone) {
		Num_telephone = num_telephone;
	}
	public void afficher_Client()
	{
		System.out.println(this.nom + " " + this.Prenom + " " + this.Num_telephone);
	}
}

