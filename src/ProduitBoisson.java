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