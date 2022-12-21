package transport;

import java.util.Objects;

public class Transport {
    protected String brand;
    protected String model;
    protected int year;
    protected String country;
    protected String colorBody;
    protected double maxSpeed;

    public Transport(String brand, String model, int year, String country, String colorBody, double maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "Значение не указано";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "Значение не указано";
        }
        this.model = model;
        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty()) {
            country = "Значение не указано";
        }
        this.country = country;
        setColorBody(colorBody);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return colorBody;
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

    public String getColorBody() {
        return colorBody;
    }

    public final void setColorBody(String colorBody) {
        if (colorBody == null || colorBody.isEmpty() || colorBody.isBlank()) {
            this.colorBody = "Значение не указано";
        } else {
            this.colorBody = colorBody;
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public final void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 20) {
            this.maxSpeed = 90;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "Транспорт: " +
                "Марка: " + brand +
                ", модель: " + model +
                ", год выпуска: " + year +
                ", страна выпуска: " + country +
                ", цвет: " + colorBody +
                ", макс. скорость: " + maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && Double.compare(transport.maxSpeed, maxSpeed) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(colorBody, transport.colorBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, colorBody, maxSpeed);
    }
}




