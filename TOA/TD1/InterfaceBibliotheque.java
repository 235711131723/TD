public interface InterfaceBibliotheque {
    int size();
    boolean isEmpty();
    boolean contains(Livre l);
    boolean addAll(InterfaceBibliotheque b);
    boolean removeAll(InterfaceBibliotheque b);
    void clear();
}