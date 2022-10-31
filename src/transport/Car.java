package transport;

import java.time.LocalDate;

import static java.lang.Integer.valueOf;

public class Car {

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance{
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }

            this.cost = cost;

            if (number == null) {
                this.number = "012345678";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000, null);

        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку.");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

    }

    private Insurance insurance;
    private Key key;
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String monthSeason;

    public Car(String brand, String model, int productionYear,
               String productionCountry, String color, double engineVolume,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats,
               Integer monthSeason, Key key, Insurance insurance) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engineVolume <= 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.length() != 9) {
            this.registrationNumber = "х000хх000";
        } else {
            char[] chars = registrationNumber.toCharArray();
            if (isNumberLetter(chars[0]) && isNumber(chars[1]) && isNumber(chars[2]) && isNumber(chars[3])
                    && isNumberLetter(chars[4]) && isNumberLetter(chars[5]) && isNumber(chars[6])
                    && isNumber(chars[7]) && isNumber(chars[8])) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "х000хх000";
            }
        }

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 3;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (monthSeason >= 4 && monthSeason <= 9) {
            this.monthSeason = "лето.";
        } else {
            this.monthSeason = "зима.";
        }

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getMonthSeason() {
        return monthSeason;
    }

    public void setMonthSeason(Integer monthSeason) {
        if (monthSeason >= 4 && monthSeason <= 9) {
            this.monthSeason = "лето.";
        } else {
            this.monthSeason = "зима.";
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String toString() {
        return this.brand + " " + this.model + ", " + this.productionYear + " года выпуска, сборка в " + this.productionCountry + ", "
                + this.color + " цвета, объём двигателя - " + this.engineVolume + ", трансмиссия - " + this.transmission
                + ", кузов - " + bodyType + ", гос номер - " + this.registrationNumber + ", количество мест - "
                + this.numberOfSeats + ", шины - " + this.monthSeason + ", "
                + (getKey().isKeylessAccess() ? " безключевой доступ, " : " ключевой доступ, ") +
                (getKey().isRemoteEngineStart() ? " удалённый запуск " : " обычный запуск ") +
                ", номер страховки " + getInsurance().getNumber() +
                ", стоимиость страховки " + getInsurance().getCost() +
                ", срок действия страховки: " + getInsurance().getExpireDate();
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbol = "АВЕКМНОРСТУХ";
        return allowedSymbol.contains("" + symbol);
    }

}
