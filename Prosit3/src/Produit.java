import java.util.Date;
public class Produit {
    private int identifiant ;
    private String libellé, marque ;
    private float prix ;
    Date dateexpiration;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if(prix>0)
            prix=prix;
        else System.out.println("le prix doit être positif");
        this.prix = prix;
    }

    public Date getDateexpiration() {
        return dateexpiration;
    }

    public void setDateexpiration(Date dateexpiration) {
        this.dateexpiration = dateexpiration;
    }

    public Produit() {
    }

    public Produit (int identifiant, String libellé, String marque, float prix, Date dateexpiration ){
        this.identifiant=identifiant;
        this.libellé= libellé;
        this.marque=marque;
        this.prix=prix;
        this.dateexpiration=dateexpiration;
    }
    public void afficher () {
        System.out.println("identifiant:  " + identifiant +"  libellé:  " + libellé +"  marque:  " + marque+ "prix:  " + prix + "date expiration:   " + dateexpiration);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libellé='" + libellé + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateexpiration=" + dateexpiration +
                '}';
    }
    public boolean comparerprod(Produit P){
        if (this.identifiant == P.identifiant && this.libellé == P.libellé && marque.equals(P.marque))
            return (true);
        else return (false);
    }

    public boolean comparerprod (Produit P1, Produit P2){
        if (P1.identifiant == P2.identifiant && P1.libellé == P2.libellé && P1.marque.equals(P2.marque))
            return (true);
        else return (false);
    }
}
