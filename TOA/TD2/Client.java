public class Client implements Comparable {
    public String nom;
    public String prenom;
    public int codePostal;

    public Client(String nom, String prenom, int codePostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.codePostal = codePostal;
    }

    /**
     * Ce client sera considéré comme << inférieur >> à un autre
     * si son nom de famille est << inférieur >> dans l'ordre alphabétique
     * à celui du dernier.
     * @param c Le client avec lequel on compare
     * @return Ce client est inférieur ou non à l'autre client.
     */
    public boolean compareTo(Client c) {
        return this.nom.compareTo(c.nom);
    }

    public boolean equals(Object o) {
        return (o instanceof Client)
        && (this.nom.equals( (Client)o.nom ))
        && (this.prenom.equals( (Client)o.prenom ));
    }

    public String toString() {
        return String.format("(%s, %s, %d)", this.prenom, this.nom, this.codePostal);
    }

    public int getCodePostal() {
        return this.codePostal;
    }
}
