public class Car extends Transport implements Competing {
    private double engine;
    private String brand;
    private String model;

    public Car(String brand, String model, double engine) {
        super(brand, model, engine);
    }

    @Override
    public void startMoving() {
        System.out.println("Заводим автомобиль");
        System.out.println("Начинаем движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Останавливаем автомобиль");
        System.out.println("Выключаем зажигание");
    }

    @Override
    public String pitStop() {

        return "Легковой автомобиль заехал на пит-стоп";
    }

    @Override
    public String bestTime() {
        return "Лучшее время круга 1.20";
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость 240км/ч";
    }

    @Override
    public boolean passDiagnostic() {
        return Math.random()>0.5;
    }

    @Override
    public void repair() {
        System.out.println("Машина "+getBrand()+" "+ getModel()+ " починена");
    }
}
