
package Exs;

public class Filiere {
    private static int compteur = 0;
    private final int id;
    private String nom;
    private Etudiant2[] etudiants;
    private int nbEtudiants;

    public Filiere(String nom) {
        this.id = ++compteur;
        this.nom = nom;
        this.etudiants = new Etudiant2[5];
        this.nbEtudiants = 0;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbEtudiants() {
        return nbEtudiants;
    }

    public void ajouterEtudiant(Etudiant2 e) {
        if (nbEtudiants == etudiants.length) {
            Etudiant2[] tmp = new Etudiant2[etudiants.length * 2];
            System.arraycopy(etudiants, 0, tmp, 0, etudiants.length);
            etudiants = tmp;
        }

        etudiants[nbEtudiants++] = e;
        e.setFiliere(this);
    }

    public void afficherEtudiants() {
        System.out.println("Filiere " + nom + " (id=" + id
                + ") -> " + nbEtudiants + " etudiants :");

        for (int i = 0; i < nbEtudiants; i++) {
            System.out.println("  " + etudiants[i].getNom() + " "
                    + etudiants[i].getPrenom()
                    + " (id=" + etudiants[i].getId() + ")");
        }
    }

    @Override
    public String toString() {
        return "Filiere[id=" + id
                + ", nom=" + nom
                + ", nbEtudiants=" + nbEtudiants + "]";
    }
}

