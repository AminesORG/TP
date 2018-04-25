import java.util.ArrayList;

public class Client_Fidele extends Client
{
	private String Code_fidelite;
	private ArrayList<String> Adresses;
	private int Nb_Commandes;



	private boolean etudiant ;
	public Client_Fidele(String nom, String Prenom, String Num_telephone,boolean etudiant,String Code_fidelite,ArrayList<String> Adresses)
	{
		super(nom, Prenom, Num_telephone);
		this.setCode_fidelite(Code_fidelite);
		this.setAdresses(Adresses);
		this.setNb_Commandes(0);
		this.etudiant = etudiant;
	}
	public String getCode_fidelite() {
		return Code_fidelite;
	}
	public void setCode_fidelite(String code_fidelite) {
		Code_fidelite = code_fidelite;
	}
	public ArrayList<String> getAdresses() {
		return Adresses;
	}
	public void setAdresses(ArrayList<String> adresses) {
		Adresses = adresses;
	}
	public int getNb_Commandes() {
		return Nb_Commandes;
	}
	public void setNb_Commandes(int nb_Commandes) {
		Nb_Commandes = nb_Commandes;
	}
	public boolean isEtudiant() {
		return etudiant;
	}

	public void setEtudiant(boolean etudiant) {
		this.etudiant = etudiant;
	}
	public void increment_NbCommandes()
	{
		this.Nb_Commandes = this.Nb_Commandes + 1;
	}
	public void Ajout_Adresse(String Adresse)
	{
		this.Adresses.add(Adresse);
	}
}
