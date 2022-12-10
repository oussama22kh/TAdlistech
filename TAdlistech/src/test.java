
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Liste l1 = Liste.liste_vide();
        Liste l2 = Liste.liste_vide();
        // Element e1 = new Element(4);

        creationListe(l1);

        creationListe(l2);

        // System.out.println("------");
        // utilisation de methode rechercher
        /*
         * if (l1.est_vide()) {
         * System.out.println("La liste est vide, la recherche est impossible");
         * } else {
         * if (l1.rechercher(e1) == null) {
         * System.out.println("l'élément e1 n'existe pas dans la liste");
         * } else {
         * System.out.println("l'élément e1 existe dans la list");
         * }
         * }
         */

        System.out.println("------");
        // affichage de la liste
        affichageListe(l1);

        // System.out.println("------");
        // affichageListe(l2);
        // System.out.println("------");
        // affichage de difference de l1 et l2
        System.out.println("affichage de difference de l1 et l2");
        Liste l3 = l1.difference(l2);
        affichageListe(l3);

    }

    public static void creationListe(Liste L) {
        // scan the length of the list
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre des elements :");
        int nbrElement = sc.nextInt();
        if (nbrElement == 0) {
            System.out.println("La liste est vide");
            // enter the numbers of the list
        } else {
            System.out.println("Entrez les elements  :");
            for (int i = 0; i < nbrElement; i++) {
                int value = sc.nextInt();
                L.inserer(i, new Element(value));
            }

        }
    }

    public static void affichageListe(Liste L) {
        Liste pt = L;
        System.out.println("Les élément de la liste sont :");
        while (pt != null) {
            System.out.println(pt.acces(0).getId());
            pt = pt.Suivant();
        }

    }
}
