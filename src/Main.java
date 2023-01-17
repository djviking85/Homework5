public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        var clientOS = 1;
                if (clientOS == 0) {
            System.out.println( "Установите версию приложения для iOS по ссылке");
                }
            if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
    }}

    public static void task2 () {
        System.out.println("Задача 2");
        var clientOS = 1;
        int clientDeviceYear = 2013;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println( "Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println( "Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");
        }}
    public static void task3 () {
        System.out.println("Задача 3");
         // Пишем код для задачи 2
    }
    public static void task4 () {
        System.out.println("Задача 4");
         // Пишем код для задачи 2
    }
    public static void task5 () {
        System.out.println("Задача 5");
         // Пишем код для задачи 2
    }
}