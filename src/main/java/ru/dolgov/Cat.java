package ru.dolgov;

public class Cat {

    private String name;
    private int appetite;
    private boolean full;

    /**
     * Возвращаем аппетит кота
     *
     * @return
     */
    public int getAppetite() {
        return appetite;
    }

    /**
     * Возвращаем сытость кота
     *
     * @return
     */
    public boolean isFull() {
        return full;
    }


    /**
     * Конструктор
     *
     * @param name
     * @param appetite
     */
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    /**
     * Метод кот кушает с тарелки
     *
     * @param plate Принимаем размер тарелки
     */
    void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            full = true;
        }
    }

    /**
     * Возвращаем имя кота
     *
     * @return
     */
    public String getName() {
        return name;
    }

}
