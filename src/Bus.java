public class Bus extends Transport implements Competing {
    private String brand;
    private String model;
    private double engine;

    public Bus(String brand, String model, double engine) {
        super(brand, model, engine);

    }

    @Override
    public void startMoving() {
        System.out.println("Заводим автобус");
        System.out.println("Начинаем движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Останавливаем автобус");
        System.out.println("Выключаем зажигание");
    }

    @Override
    public boolean passDiagnostic() {
        System.out.println("Автобус "+ getBrand()+" "+ getModel()+" в диагностике не нуждается");
        return true;
    }

    @Override
    public String pitStop() {

        return "Автобус заехал на пит-стоп";
    }

    @Override
    public String bestTime() {
        return "Лучшее время круга 2.20";
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость 150км/ч";
    }
    @Override
    public void repair() {
        System.out.println("Автобус "+getBrand()+" "+ getModel()+ " починен");
    }

}