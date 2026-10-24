
package Exs;

public class Main2 {
    public static void main(String[] args) {

        Filiere info = new Filiere("Informatique");
        Filiere genie = new Filiere("Genie Civil");

        Etudiant2 e1 = new Etudiant2("El Idrissi", "Mohamed");
        Etudiant2 e2 = new Etudiant2("Bentaleb", "Fatima");
        Etudiant2 e3 = new Etudiant2("Chouaib", "Youssef");
        Etudiant2 e4 = new Etudiant2("Lahlou", "Salma");
        Etudiant2 e5 = new Etudiant2("Roussafi", "Hassan");
        Etudiant2 e6 = new Etudiant2("Amrani", "Aicha");

        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(new Etudiant2("Belkahia", "Khadija"));
        genie.ajouterEtudiant(new Etudiant2("Laaroussi", "Walid"));

        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        System.out.println("Detail de e3 : " + e3);
    }
}
