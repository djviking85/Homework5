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
         var monthNumber = 6;
         switch (monthNumber) {
             case 1:
                 System.out.println( monthNumber + " месяц - это: Январь, Зима");
                 break;
             case 2:
                 System.out.println( monthNumber + " месяц - это: Февраль, Зима" );
                 break;
             case 3:
                 System.out.println( monthNumber + " месяц - это: Март, Весна");
                 break;
             case 4:
                 System.out.println( monthNumber + " месяц - это: Апрель, Весна" );
                 break;
             case 5:
                 System.out.println( monthNumber + " месяц - это: Май, Весна");
                 break;
             case 6:
                 System.out.println( monthNumber + " месяц - это: Июнь, Лето" );
                 break;
             case 7:
                 System.out.println( monthNumber + " месяц - это: Июль, Лето");
                 break;
             case 8:
                 System.out.println( monthNumber + " месяц - это: Август, Лето" );
                 break;
             case 9:
                 System.out.println( monthNumber + " месяц - это: Сентябрь, Осень");
                 break;
             case 10:
                 System.out.println( monthNumber + " месяц - это: Октябрь, Осень" );
                 break;
             case 11:
                 System.out.println( monthNumber + " месяц - это: Ноябрь, Осень");
                 break;
             case 12:
                 System.out.println( monthNumber + " месяц - это: Декабрь, опять Зима" );
                 break;
             default:
                 System.out.println("Месяцы в календаре с 1 по 12, не иначе. Выбери число с 1 по 12");
         }
    }
}