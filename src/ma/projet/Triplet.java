package ma.projet;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Classe générique Triplet pour stocker trois objets du même type.
 * @param <T> le type des trois éléments
 */

public class Triplet<T> {
    private final T premier;
    private final T second;
    private final T troisieme;

    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public T getPremier(){
    	return premier; 
    }
    public T getSecond(){
    	return second; 
    }
    public T getTroisieme(){
    	return troisieme; 
    }

    public void affiche() {
        System.out.println("Triplet : [" + premier + ", " + second + ", " + troisieme + "]");
    }

    //Ajouter une méthode swap() qui échange deux positions (ex. premier et second).
    
    public Triplet<T> swap() {
        return new Triplet<>(second, premier, troisieme);
    }

    public List<T> toList() {
        return Arrays.asList(premier, second, troisieme);
    }

    //Implémenter equals et hashCode pour comparer deux triplets.
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triplet<?> t)) return false;
        return Objects.equals(premier, t.premier)
            && Objects.equals(second, t.second)
            && Objects.equals(troisieme, t.troisieme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(premier, second, troisieme);
    }

    @Override
    public String toString() {
        return "[" + premier + ", " + second + ", " + troisieme + "]";
    }
}