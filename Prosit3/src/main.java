import java.util.Date;
public class main {
    public static void main(String[] args){

        Date dateexpiration1 = new Date();
        Date dateexpiration2 = new Date();
        dateexpiration1.setYear(123);
        dateexpiration1.setMonth(4);
        dateexpiration1.setDate(13);


        Produit Produit1 = new Produit(1021, "Lait ", "delice", 0, dateexpiration1 );
        Produit Produit2 = new Produit(2510, "Yaourt ", "delice", 0, dateexpiration2 );
        Produit Produit3 = new Produit(3250, "Tomates ", "Sicam", 1200, null );

        magasin magasin1 = new magasin(1, "xxxx");
        magasin magasin2 = new magasin(2, "yy");

        magasin1.ajouter(Produit1);
        magasin1.ajouter(Produit2);
        magasin2.ajouter(Produit3);

        Produit1.setPrix(700);
        Produit2.setPrix(500);

        magasin1.afficher();
        magasin2.afficher();

        System.out.println(magasin1.toString());
        System.out.println(magasin2.toString());

        Produit1.afficher();
        Produit2.afficher();
        Produit3.afficher();
        System.out.println(Produit1.toString());
    }


}
