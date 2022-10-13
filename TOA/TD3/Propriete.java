import java.util.ArrayList;
import java.util.List;

public class Propriete {
    public static <T> int nombreElementsVerifiantPredicat(List<T> tableau, Predicat<T> p) {
        int count = 0;
        for(T element: tableau) {
            if(p.test(tableau.get(i))) {
                count++;
            }
        } 

        return count;
    }
}
