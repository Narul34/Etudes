
public class Professeurs {
	
	private String nom, prenom, matiere;
	
	public Professeurs(String nom, String prenom, String matiere){
		this.nom=nom;
		this.prenom=prenom;
		this.matiere=matiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

}
