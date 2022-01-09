package ru.dolgov;

public class Plate {
    private int food;

    /**
     * Конструктор тарелки
     *
     * @param food
     */
    Plate(int food) {
        this.food = food;
    }


    /**
     * Принимаем аппетит кота и уменьшаем тарелку
     *
     * @param appetite
     */
    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    /**
     * Возвращаем информацию о тарелки
     *
     * @return
     */
    int getFood() {
        return food;
    }

    /**
     * Добавляем еду в тарелку
     * @param amount
     */
    void increaseFood(int amount) {
        food += amount;
    }

}