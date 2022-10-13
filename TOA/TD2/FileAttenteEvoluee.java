import java.util.ArrayList;

public class FileAttenteEvoluee extends FileAttente {
    /**
     * Par héritage, nous avons donc :
     * - head()
     * - remove()
     * - add(Client c)
     */
    public int size() {
        /**
         * Tableau vide de clients
         * DIFFERENT de celui défini en attribut
         * dans la classe parente.
         */
        ArrayList<Client> clients = new ArrayList<Client>();
        while(this.head() != null) {
            clients.add(this.head());
            this.remove();
        }

        /**
         * On rajoute les clients supprimés dans la boucle précédente.
         */
        for(int i = 0; i < clients.size(); i++) {
            this.add(clients.get(i));
        }

        return clients.size();
    }

    public void clear() {
        while(!this.isEmpty()) {
            this.remove();
        }
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }
}
