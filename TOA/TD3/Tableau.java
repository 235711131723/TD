import java.util.ArrayList;
import java.util.List;

public class Tableau {
    public static <T> void afficherTableau(T[] tableau) {
        for(T element: tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> void echangerElements(T[] tableau, int i, int j) {
        if(tableau != null
        && (i >= 0 && i < tableau.length)
        && (j >= 0 && j < tableau.length)) {
            E tmp = tableau[i];
            tableau[i] = tableau[j];
            tableau[j] = tmp;
        }
    }

    /**
     * Bien noter que @tableau est une List<T> contrairement aux deux méthodes précédentes. 
     */
    public static <T extends Comparable> T getMaximum(List<T> tableau, int debut, int fin) {
        if((tableau != null && !tableau.isEmpty())
        && (debut >= 0)
        && (debut <= fin)
        && (fin >= 0 && fin < tableau.size())) {
            T maximum = tableau.get(0);
            for(int i = debut; i <= fin; i++) {
                if(maximum.compareTo(tableau.get(i)) < 0) {
                    maximum = tableau.get(i);
                }
            }

            return maximum;
        }

        return null;
    }
}
