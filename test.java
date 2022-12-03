
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Liste l1 = new Liste();
        Liste l2 = new Liste();
        l2.inserer(0, new Element(12));
        creationListe(l1);
        System.out.println("------");
        l1.supprimer(2);
        affichageListe(l1);
        System.out.println(l1.est_vide());
        System.out.println(l1.egale(l2));

    }

    public static void creationListe(Liste L) {
        // scan the length of the list
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre des elements :");
        int nbrElement = sc.nextInt();
        // enter the numbers of the list
        System.out.println("Entrez les elements  :");
        for (int i = 0; i < nbrElement; i++) {
            int value = sc.nextInt();
            L.inserer(i, new Element(value));
        }
        sc.close();
    }

    public static void affichageListe(Liste L) {
        Liste pt = L;
        while (pt != null) {
            System.out.println(pt.acces(0).getId());
            pt = pt.Suivant();
        }
    }
}
