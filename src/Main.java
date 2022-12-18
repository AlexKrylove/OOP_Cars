import transport.Car;
public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", "Россия", "Желтый", -23, 2015, "Хэтчбэк", 5, "Механическая", 345,true,new Car.Key(false,false));
        Car audi = new Car("Audi", "A8 50L TDI quattro", "Германия", "Черный", 3.0, -2015, "Хэтчбэк", 5, "Механическая", 445,false,new Car.Key(true,true));
        Car BMW = new Car("BMW", "Z8", "Германия", "Черный", 3.0,2021,"Хэтчбэк",5,"Механическая",445,true,new Car.Key(true,true));
        Car KIA = new Car("KIA", "Sportage 4-го поколения", "Южная Корея", "Красный", 2.4,2018,"Хэтчбэк",5,"Механическая",445,true,new Car.Key(true,true));
        Car hyundai = new Car("Hyundai", "Avante", "Южная Корея", "Оранжевый", 1.6,2016,"Хэтчбэк",5,"Механическая",445,true,new Car.Key(true,true));
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(BMW);
        System.out.println(KIA);
        System.out.println(hyundai);
    }
}