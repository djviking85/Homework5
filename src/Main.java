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
         var year = 2024 ;
         if ((year % 400 == 0) || (year %4 == 0 && year % 100 != 0))  {
            System.out.println( "Год високосный");
        } else {
             System.out.println( "Год обычный");
         }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var deliveryDistance = 11;
        if (deliveryDistance < 19) {
            System.out.println(" чтоб доставить клиенту карту, на " + deliveryDistance + " км, потребуется дней 1 день");
        } else if (deliveryDistance <= 59) {
            System.out.println( " чтоб доставить клиенту карту, на " + deliveryDistance + " км, потребуется дней 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println( " чтоб доставить клиенту карту, на " + deliveryDistance + " км, потребуется дней 3 дня");
        } else  {
            System.out.println( " У нас нет доставки на " + deliveryDistance + " км");

        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
         // Пишем код для задачи 2
    }
}