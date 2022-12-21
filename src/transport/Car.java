package transport;

import java.time.LocalDate;

public final class Car extends Transport {
    private String typeOfBody;
    private int seatsCount;
    private double engineVolume;
    private String gears;
    private boolean summerTires;
    private int regNumber;
    private Key key;

    public Car(String brand, String model, int year, String country, String colorBody, double maxSpeed) {
        super(brand, model, year, country, colorBody, maxSpeed);
    }

    public Car(String brand, String model, String country, String colorBody, double engineVolume, int year, String typeOfBody, int seatsCount, String gears, int regNumber, boolean summerTires, Key key) {
        super(brand, model, year, country, colorBody, 0);
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
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
                ", цвет кузова - " + colorBody +
                ", год выпуска - " + year +
                ", страна производства - " + country +
                ", количество мест - " + seatsCount +
                ", кузов - " + typeOfBody +
                ", коробка передач " + gears + ". " +
                (isSummerTires() ? "Кстати,сейчас " + LocalDate.now().getMonth() + " надо поменять резину на зимнюю" : "Резина зимняя, можно не менять.") +
                ". " + (key.isRemoteRunEngine() ? "Можно запустить удаленно" : "Завести только ключом") +
                ". " + (key.isWithoutKeyAccess() ? "Доступ бесключевой" : "Открывается ключом");
    }

    public void getInfo() {
        System.out.println("Транспорт: " +
                "Марка: " + brand +
                ", модель: " + model +
                ", год выпуска: " + year +
                ", страна выпуска: " + country +
                ", цвет: " + colorBody +
                ", макс. скорость: " + maxSpeed);
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
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


