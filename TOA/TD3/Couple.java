public class Couple<R, T> {
    public final R cle;
    public T valeur;

    public Couple(R cle, T valeur) {
        this.cle = cle;
        this.valeur = valeur;
    }

    public R getCle() {
        return this.cle;
    }

    public T getValeur() {
        return this.valeur;
    }

    public void setValeur(T valeur) {
        this.valeur = valeur;
    }
}