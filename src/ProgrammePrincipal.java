import java.time.LocalDate;

        //karim tachrift
public class ProgrammePrincipal {
    public static void main(String[] args) {
        // Je Remplit la boutique
        Boutique maBoutique = new Boutique();
        ProduitElectronique produitElectronique = new ProduitElectronique("Casque audio", "Casque sans fil", 18, 150);
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire("Lait", "Lait entier", LocalDate.of(2024, 4, 25), 3);
        ProduitBoisson produitBoisson = new ProduitBoisson("Fuze tea", "Soda", 500, 1);

        maBoutique.addProduit(produitElectronique);
        maBoutique.addProduit(produitAlimentaire);
        maBoutique.addProduit(produitBoisson);

        // Ici j'affiche la boutique
        maBoutique.afficherStock();

        // Ici j'ajoute les produits au panier et j'affiche le prix total du panier
        Panier monPanier = new Panier();
        monPanier.ajouterProduit(produitElectronique);
        monPanier.ajouterProduit(produitAlimentaire);
        monPanier.ajouterProduit(produitBoisson);

        // Ici j'affiche le prix total du panier
        System.out.println("Prix total du panier : " + monPanier.prixTotalPanier() + " euros");
    }
}
