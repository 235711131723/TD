import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.SortedSet;

public class FileAttente {
    private ArrayList<Client> clients;

    public FileAttente() {
        this.clients = new ArrayList<Client>();
    }

    public boolean add(Client c) {
        if(this.clients.contains(c)) return false;
        this.clients.add(c);
        return true;
    }

    public void remove() {
        if(!this.clients.isEmpty()) this.clients.remove(0);
    }

    public Client head() {
        if(!this.clients.isEmpty()) return null;
        return this.clients.get(0);
    }

    public String toString() {
        return (new TreeSet<Client>(this.clients)).toString();
    }

    public String listeClient() {
        return this.clients.toString();
    }

    public String listeClientsLocalite() {
        ComparateurClient comparateur = new ComparateurClient();
        SortedSet<Client> clientsTries = new TreeSet<>(comparateur);
        clientsTries.addAll(this.clients);
        return clientsTries.toString();
    }
}
