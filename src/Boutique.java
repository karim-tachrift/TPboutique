import java.util.ArrayList;
import java.util.List;

public class Boutique {
    private List<Produit> produits;

    // Constructeur
    public Boutique() {
        this.produits = new ArrayList<>();
    }

    // Mtd pour ajouter un produit à la boutique
    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    // Mtd pour obtenir la liste des produits de la boutique
    public List<Produit> getProduits() {
        return produits;
    }

    // Mtd pour afficher le stock de la boutique
    public void afficherStock() {
        for (Produit produit : produits) {
            produit.afficher();
            System.out.println();
        }
    }
}