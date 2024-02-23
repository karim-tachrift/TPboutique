import java.time.LocalDate;

public class Produit {
    private String nom;
    private String description;
    private int prix;

    // Constructeur
    public Produit(String nom, String description, int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    // Getters et setters pour les attributs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    // Mtd pour afficher les détails du produit
    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Description : " + description);
        System.out.println("Prix : " + prix + " euros"); // Affichage du prix
    }
}
