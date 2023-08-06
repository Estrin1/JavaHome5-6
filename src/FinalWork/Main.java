package FinalWork;

import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
//        Задание на дом :
//• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//• Создать множество ноутбуков.
//• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//“Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//• Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

        Laptop lap = new Laptop("Lenovo", "Green", "Linux", 1, 500, 25000);
        Laptop lap2 = new Laptop("HP", "Yellow", "Mac Os", 2, 1000, 27000);
        Laptop lap3 = new Laptop("Lenovo", "Red", "Linux", 1, 500, 25000);
        Laptop lap4 = new Laptop("HP", "Blue", "Windows", 4, 2000, 42000);
        Laptop lap5 = new Laptop("Lenovo", "Red", "Linux", 3, 1000, 32000);
        Laptop lap6 = new Laptop("Acer", "Yellow", "Mac Os", 1, 500, 29000);
        Set<Laptop> Lap = new HashSet<Laptop>();
        Lap.add(lap);
        Lap.add(lap2);
        Lap.add(lap3);
        Lap.add(lap4);
        Lap.add(lap5);
        Lap.add(lap6);
//        Map<Integer, Object> computer = new HashMap<>();
//        computer.put(1, lap);
//        computer.put(2, lap2);
//        computer.put(3, lap3);
//        computer.put(4, lap4);
//        computer.put(5, lap5);
//        computer.put(6, lap6);

        System.out.println(Lap);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите по какому критерию отбирать ноутбук, нажмите :\n 1 - Производитель " +
                "2 - Цвет" + " 3 - Операционная система\n" + " 4 - ram" + " 5 - HDD" + " 6 - price\n");
        String figure = scanner.nextLine();
        findParametr(Lap, scanner, figure);
    }

    private static void findParametr(Set<Laptop> Lap, Scanner scanner, String figure) {
        switch (figure) {
            case "1": {
                System.out.println("Введите производителя: Lenovo, Acer , HP");
                String nameL = scanner.nextLine();

                for (Laptop ap : Lap) {
                    if (ap.getName().equals(nameL)) {
                        System.out.println(ap.toString());
                    }

                }
                break;

            }
            case "2": {
                System.out.println("цвет : Red, Green , Yellow, Blue");
                String nameL = scanner.nextLine();

                for (Laptop ap : Lap) {
                    if (ap.getColor().equals(nameL)) {
                        System.out.println(ap.toString());
                    }
                }
                break;


            }
            case "3": {
                System.out.println("Введите Os: Linux, Mac Os , Windows");
                String nameL = scanner.nextLine();

                for (Laptop ap : Lap) {
                    if (ap.getName().equals(nameL)) {
                        System.out.println(ap.toString());
                    }
                }
                break;
            }
            case "4": {
                System.out.println("Введите ram: 1, 2 , 3, 4");
                Integer nameL = scanner.nextInt();

                for (Laptop ap : Lap) {
                    if (ap.getRam() == nameL) {
                        System.out.println(ap.toString());
                    }
                }
                break;
            }
            case "5": {
                System.out.println("Введите Объем HDD: ");
                Integer nameL = scanner.nextInt();

                for (Laptop ap : Lap) {
                    if (ap.getHDD() == nameL) {
                        System.out.println(ap.toString());
                    }
                }
                break;
            }
            case "6": {
                System.out.println("Введите цену: покажет все ноутбуки от ....");
                Integer nameL = scanner.nextInt();

                for (Laptop ap : Lap) {
                    if (ap.getPrice() >= nameL) {
                        System.out.println(ap.toString());
                    }
                }
                break;

            }
        }
    }
}








