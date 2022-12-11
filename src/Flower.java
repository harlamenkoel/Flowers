public class Flower {
    private final   String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        if (this.flowerColor == null || this.flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        }

        this.country = country;
        if (this.country == null || this.country.isEmpty()) {
            this.country = "Россия";
        }
        this.cost = cost;
        if (this.cost <= 0) {
            this.cost = 1;
        }
        this.lifeSpan = lifeSpan;
        if (this.lifeSpan <= 0) {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {

        return flowerColor;
    }


    public String getCountry() {
        return country;
    }

    public double getCost() {

        return cost;
    }


    public int getLifeSpan() {
        return lifeSpan;
    }

    @Override
    public String toString() {
        return "Цветок " +
                "Название: " + getFlowerName() +
                " | Цвет: " + getFlowerColor() +
                " | Производитель: " + getCountry() +
                " | Цена: " + getCost() +
                " | Срок стояния: " + getLifeSpan();
    }
}