public class Truck extends Transport implements Competing {
    private String brand;
    private String model;
    private double engine;

    public Truck(String brand, String model, double engine) {
        super(brand,model,engine);
    }
    @Override
    public void startMoving() {
        System.out.println("Заводим грузовик");
        System.out.println("Начинаем движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Останавливаем грузовик");
        System.out.println("Выключаем зажигание");
    }

    @Override
    public String pitStop() {
        return "Грузовой автомобиль заехал на пит-стоп";
    }

    @Override
    public String bestTime() {
        return "Лучшее время круга 1.50";
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость 210км/ч";
    }

    @Override
    public boolean passDiagnostic() {
        return Math.random()>0.8;
    }
    @Override
    public void repair() {
        System.out.println("Грузовик "+getBrand()+" "+ getModel()+ " починен");
    }
}
