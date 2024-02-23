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

// Classes ProduitElectronique
class ProduitElectronique extends Produit {
    private int dureeGarantie;

    // Constructeur
    public ProduitElectronique(String nom, String description, int dureeGarantie, int prix) {
        super(nom, description, prix); // Appel du constructeur de la classe parente Produit
        this.dureeGarantie = dureeGarantie;
    }

    // Mtd pour afficher les détails du produit électronique
    @Override
    public void afficher() {
        super.afficher(); // Appel de la méthode d'affichage de la classe parente Produit
        System.out.println("Durée de garantie : " + dureeGarantie + " mois");
    }
}

// Classes ProduitAlimentaire
class ProduitAlimentaire extends Produit {
    private LocalDate dateExpiration;

    // Constructeur
    public ProduitAlimentaire(String nom, String description, LocalDate dateExpiration, int prix) {
        super(nom, description, prix); // Appel du constructeur de la classe parente Produit
        this.dateExpiration = dateExpiration;
    }

    // Mtd pour afficher les détails du produit alimentaire
    @Override
    public void afficher() {
        super.afficher(); // Appel de la mtd d'affichage de la classe parente Produit
        System.out.println("Date d'expiration : " + dateExpiration);
    }
}

// Classes ProduitBoisson
class ProduitBoisson extends Produit {
    private int quantite;

    // Constructeur
    public ProduitBoisson(String nom, String description, int quantite, int prix) {
        super(nom, description, prix); // Appel du constructeur de la classe parente Produit
        this.quantite = quantite;
    }

    // Mtd pour afficher les détails du produit boisson
    @Override
    public void afficher() {
        super.afficher(); // Appel de la mtd d'affichage de la classe parente Produit
        System.out.println("Quantité : " + quantite + "cl");
    }
}