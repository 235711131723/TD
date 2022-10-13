public abstract class Bibliotheque implements InterfaceBibliotheque {
    public int size() {
        int count = 0;
        Livre livre = remove();
        if(livre == null) return count;
        count = 1 + size();
        add(livre);
        return count; 
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Livre l) {
        if(isEmpty()) {
            return false;
        }

        Livre livre = remove();
        boolean flag = livre.equals(l) ? true : contains(l);
        add(livre);
        return flag;
    }


    public abstract Livre remove();
    public abstract void add(Livre l);
    public abstract boolean addAll(InterfaceBibliotheque b);
    public abstract boolean removeAll(InterfaceBibliotheque b);
    public abstract void clear();
}
