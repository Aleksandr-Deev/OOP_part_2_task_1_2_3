public class Flower {

    private String flowerName;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isBlank()) {
            this.flowerName = "default";
        } else {
            this.flowerName = flowerName;
        }

        if (country == null || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0.0) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }

        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public Flower(String flowerName, String country, double cost) {
        this(flowerName, country, cost, 3);
    }

    @Override
    public String toString() {
        return this.flowerName + " - " + this.country + ", стоимость штуки - "
                + cost + " рублей, срок стояния - " + lifeSpan + " дней.";
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        if (flowerName == null || flowerName.isBlank()) {
            this.flowerName = "default";
        } else {
            this.flowerName = flowerName;
        }
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return this.lifeSpan;
    }

}
