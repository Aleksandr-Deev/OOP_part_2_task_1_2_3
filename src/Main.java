import transport.Car;

public class Main {

    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        Human ania = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт-менеджер");
        Human artem = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001,null);

        System.out.println(maksim);
        System.out.println(ania);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

        System.out.println();

        Flower roza = new Flower("Роза", "Голандия", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", null, 15.00, 5);
        Flower pion = new Flower("Пион", "Англия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.50, 10);

        System.out.println(roza);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);

        System.out.println();

        Car ladaGrande = new Car("Lada", "Grande", 2015, "России",
                "желтого", 1.7, "МКПП", "Лифтбек", "А256ВС702",
                5, 4, null, null);

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии",
                "черного", 3.0, "", "", "А452Ом702",
                5, 11, null, null);

        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германии",
                "черного", 3.0, "", "", "А452О8702",
                2, 6, null, null);

        Car kiaSportage = new Car("Kia", "Sportage 4 поколение", 2018, "Южнаой Кореи",
                "красного", 2.4, "", "", "А452ОМ70",
                5, 10, null, null);

        Car hyundaiAvante = new Car("Hyundai", "Avante", 2016, "Южной Кореи",
                "красного", 1.6, "", "", "А452ОМ702",
                5, 9, null, null);

        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);

        System.out.println();

        printCostBouquet(roza, roza, roza,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila);
    }

    private static void printCostBouquet(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            System.out.println(flower.getFlowerName() + " - " + flower.getCountry() + ", стоимость штуки - "
                    + flower.getCost() + " рублей, срок стояния - " + flower.getLifeSpan() + " дней.");
        }
        totalCost *= 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стоиния букета: " + minimumLifeSpan);
    }
}