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