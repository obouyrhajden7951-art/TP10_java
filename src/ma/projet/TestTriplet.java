package ma.projet;

public class TestTriplet {
    public static void main(String[] args) {
        Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
        tInt.affiche();                               // Triplet : [1, 2, 3]

        Triplet<String> tStr = new Triplet<>("A", "B", "C");
        tStr.affiche();                               // Triplet : [A, B, C]

        System.out.println("Second élément de tInt : " + tInt.getSecond());

        // Extensions
        System.out.println("swap : " + tInt.swap()); // [2,1,3]
        System.out.println("equals : " + tInt.equals(new Triplet<>(1, 2, 3))); // true
        System.out.println("toList : " + tStr.toList());
    }
}