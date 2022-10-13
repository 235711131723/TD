import java.util.Comparator;

public class ComparateurClient implements Comparator<Client> {
    public int compare(Client c1, Client c2) {
        if(c1.getCodePostal() == c2.getCodePostal()) return c1.compareTo(c2);
        return c1.getCodePostal() - c2.getCodePostal();
    }
}