import java.util.Arrays;

public class Professeurs {
	
	private String nom, prenom, matiere;
	private Etudiant[] etudiants;
	
	public Professeurs(String nom, String prenom, String matiere, Etudiant[] etudiants){
		this.nom=nom;
		this.prenom=prenom;
		this.matiere=matiere;
		this.etudiants=etudiants;
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

	public Etudiant[] getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Etudiant[] etudiants, int i) {
		this.etudiants[i] = etudiants[i];
	}

	@Override
	public String toString() {
		return "Professeurs [nom=" + nom + ", prenom=" + prenom + ", matiere=" + matiere + ", etudiants="
				+ Arrays.toString(etudiants) + "]";
	}


}
