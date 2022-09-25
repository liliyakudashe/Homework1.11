public class Main {

    public static void main(String[] args) {
        print(2028);
        operatingSystem(2011, 0);
        delivery(10);
    }


    public static void print(int year) {
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " это високосный год.");
        } else if ((year % 4 == 0) && (year % 100 == 0)
                && (year % 400 == 0)) {
            System.out.println(year + " это високосный год.");
        } else {
            System.out.println(year + " это не високосный год.");
        }
    }

    public static void operatingSystem(int year2, int os) {
        if (os == 0)
            if (year2 < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS");
            }
        else if (os == 1) {
            if (year2 < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android");
            }
        }

    }

    public static int delivery(int days) {
        int distance = 95;
       // int days = 1;
        if (distance > 20)
        days++;
        if (distance > 60)
            days++;
        System.out.println("Потребуется дней доставки: " + days);
        return days;
    }
}