import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Produit> produits;

    // Constructeur
    public Panier() {
        this.produits = new ArrayList<>();
    }

    // Mtd pour ajouter un produit au panier
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Mtd pour calculer le prix total du panier
    public int prixTotalPanier() {
        int prixTotal = 0;
        for (Produit produit : produits) {
            prixTotal += produit.getPrix(); // Ajoute le prix de chaque produit au prix total
        }
        return prixTotal;
    }
}
