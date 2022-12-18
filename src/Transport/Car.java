package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private final String typeOfBody;
    private final int seatsCount;
    private String color;
    private double engineVolume;
    private String gears;
    private boolean summerTires;
    private int regNumber;
    private Key key;

    public Car(String brand, String model, String country, String color, double engineVolume, int year, String typeOfBody, int seatsCount, String gears, int regNumber, boolean summerTires, Key key) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;

        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
        this.color = color;
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = country;
        if (typeOfBody == null || typeOfBody.isEmpty()) {
            typeOfBody = "седан";
        }
        this.typeOfBody = typeOfBody;
        this.seatsCount = seatsCount;
        this.gears = gears;
        this.regNumber = regNumber;
        this.summerTires = summerTires;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }
    @Override
    public String toString() {
        return brand + " " + model +
                ", объем двигателя - " + engineVolume +
                ", цвет кузова - " + color +
                ", год выпуска - " + year +
                ", страна производства - " + country +
                ", количество мест - " + seatsCount +
                ", кузов - " + typeOfBody +
                ", коробка передач " + gears + ". " +
                (isSummerTires() ? "Кстати,сейчас " + LocalDate.now().getMonth() + " надо поменять резину на зимнюю" : "Резина зимняя, можно не менять.") +
                ". " + (key.isRemoteRunEngine() ? "Можно запустить удаленно" : "Завести только ключом") +
                ". " + (key.isWithoutKeyAccess() ? "Доступ бесключевой" : "Открывается ключом");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        this.gears = gears;
    }

    public boolean isSummerTires() {
        int month = LocalDate.now().getMonthValue();
        if (month >= 11 & month <= 2) {
            return true;
        }
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }


}


