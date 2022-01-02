package ru.dolgov;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean restar;
    public static Plate plate = new Plate(10);

    public static void main(String[] args) {
        System.out.println("Коты голодны!");
        System.out.println("Тарелка наполнена на: "+plate.getFood());
        while (!restar) {//Перезапускаем пока restart false
            System.out.println("Хотите покормить котов Y-да N-нет");
            String sc = scanner.nextLine();
            if (sc.equalsIgnoreCase("Y")) {
                start();//Запуск программы
            } else if (sc.equalsIgnoreCase("N")) {
                restar = true;
            }
        }
    }

    /**
     * Метод для запуска
     */
    public static void start() {
        System.out.println("Положите котам еды!");
        plate.increaseFood(scanner.nextInt()); //можно было обойтись без метода, но тех задание есть тех задание Plate plate = new Plate(scanner.nextInt());
        scanner.nextLine();
        Cat[] cat = {new Cat("Барсик", 15), new Cat("Васька", 5), new Cat("Рыжик", 15)};
        for (Cat c : cat) { //пробегаем по массиву котов
            c.eat(plate);// Кушают
            System.out.println("Имя: "+c.getName()+" мой аппетит: "+c.getAppetite()+" моя сытость: "+c.isFull()+
                    " В тарелке осталось: "+plate.getFood()); //Вы водим информацию о сытости
        }
    }
}
