package ma.projet;

public class TestTripletH {
    public static void main(String[] args) {
        TripletH<Integer, String, Double> th = new TripletH<>(42, "Answer", 3.14);
        th.affiche();   // TripletH : [42, Answer, 3.14]

        TripletH<String, Integer, Boolean> th2 = new TripletH<>("Alice", 30, true);
        th2.affiche();  // TripletH : [Alice, 30, true]
    }
}