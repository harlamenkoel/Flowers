public class Main {
    public static void main(String[] args) {
        Flower roze = new Flower("Роза", null, "Голандия", 35.59, 0);
        Flower peony = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15.00, 5);
        Flower gypsophila = new Flower("Гипcофила", null, "Турция", 19.5, 10);


        System.out.println(peony);
        System.out.println();
        Bouquet bouquet = new Bouquet(new Flower[]{
                roze, roze, roze,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila
        }
        );
        bouquet.printInfo();
    }
}