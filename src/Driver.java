public abstract class Driver<T extends Transport & Competing> {
    private T vehicle;
    private String name;
    private String category;
    private int experience;

    public Driver(String name, String category, int experience) {
        setName(name);
        setCategory(category);
        setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Не верные данные ";
        }

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category != null && !category.isBlank()) {
            throw new IllegalArgumentException("Введите категорию прав");
        } else {
            this.category = category;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 1) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
    }

    public void starMoving() {
        System.out.println("Начинаем движение");
    }

    public void stop() {
        System.out.println("Оставливаемся");
    }

    public void refuel() {
        System.out.println("Заправляемся");
    }

}

