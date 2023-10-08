public class magasin {
    int identifiant;
    String adresse;
    final int capacite = 50;
    Produit [] tabproduit=new Produit[capacite];
    int numprod;
    public magasin() {
    }
    public magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
    }


    public void ajouter(Produit produit) {
        for (int i=0; i<capacite; i++){
            if (tabproduit[i] != null){
                numprod ++;
            }
        }
        if (!chercher(produit) ){
            tabproduit[numprod + 1] = produit;
            numprod ++;
            System.out.println("produit ajoute ");
        }
    }
    public boolean chercher (Produit P){
        for (int i=0; i < capacite; i++ ){
            if (P.comparerprod(tabproduit[i]))

                return true;
        }
        return false;
    }

    public void supprimer(Produit produit) {
        for (int i = 0; i < capacite; i++) {
            if (chercher(produit)) {
                tabproduit[i] = tabproduit[numprod - 1];
                tabproduit[numprod - 1] = null;
                numprod--;
            }
        }
    }
    public String comparermagsin (magasin M1, magasin M2){
        if (M1.numprod>M2.numprod)
            return (M1.toString());
        else {
            return (M2.toString());
        }
    }


    @Override
    public String toString() {
        return "magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + numprod +
                '}';
    }
    public void afficher() {
        System.out.println("Les Produits du magasin :");
        for (int i = 0; i < tabproduit.length; i++) {

                System.out.println("Marque :"+tabproduit[i].getMarque() + "libelle :" + tabproduit[i].getLibellé() + "date :"+tabproduit[i].dateexpiration+ "prix :"+tabproduit[i].getPrix() + "Identifiant :"+tabproduit[i].getIdentifiant());

        }
    }
}
