
public class Main {

	public static void main (String[] args){
		
		Etudiant[] etudiants = new Etudiant[10]; 
		
		etudiants[0] = new Etudiant("toto", "titi","S");
		etudiants[1]= new Etudiant("toto", "titi","S");
		etudiants[2]= new Etudiant("toto", "titi","S");
		etudiants[3]= new Etudiant("toto", "titi","S");
		etudiants[4]= new Etudiant("toto", "titi","S");
		etudiants[5]= new Etudiant("toto", "titi","L");
		etudiants[6]= new Etudiant("toto", "titi","L");
		etudiants[7]= new Etudiant("toto", "titi","L");
		etudiants[8]= new Etudiant("toto", "titi","L");
		etudiants[9]= new Etudiant("toto", "titi","L");
		
		Professeur p1 = new Professeur("tarlatata", "turlututu", "Langue", new Etudiant[etudiants.length]);
		Professeur p2 = new Professeur("tarlatata", "turlututu", "Math", new Etudiant[etudiants.length]);
		
		for (int i = 0; i < etudiants.length; i++) {
			if (etudiants[i].getCursus().equals("S")){
				p2.setEtudiant(etudiants[i], i);
			}
			if (etudiants[i].getCursus().equals("L")){
				p1.setEtudiant(etudiants[i], i);
			}
		}
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
