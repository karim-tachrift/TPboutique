import java.time.LocalDate;

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