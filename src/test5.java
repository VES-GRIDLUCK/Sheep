import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        System.out.println("Введите дату рождения");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();


        if (day >= 22 && day <= 31 || day >= 1 && day <=20 && month ==12 || month == 1 ) {
            System.out.println(day +"\n" + "Козерог");
            System.exit(0);
        }
        if  (day >= 21 && day <= 31 || day >= 1 && day <=19 && month ==1 || month == 2 ) {
            System.out.println(day +"\n" + "Водолей");
            System.exit(0);
        }
        if (day >= 20 && day <= 28 || day >= 1 && day <=20 && month ==2 || month == 3 ) {
            System.out.println(day +"\n" + "Рыбы");
            System.exit(0);
        }
        if (day >= 21 && day <= 31 || day >= 1 && day <=20 && month ==3 || month == 4 ) {
            System.out.println(day +"\n" + "Овен");
            System.exit(0);
        }
        if (day >= 21 && day <= 30 || day >= 1 && day <=21 && month ==4 || month == 5 ) {
            System.out.println(day +"\n" + "Телец");
            System.exit(0);
        }
        if (day >= 22 && day <= 31 || day >= 1 && day <=21 && month ==5 || month == 6 ) {
            System.out.println(day +"\n" + "Близнецы");
            System.exit(0);
        }
        if (day >= 22 && day <= 30 || day >= 1 && day <=23 && month ==6 || month == 7 ) {
            System.out.println(day +"\n" + "Рак");
            System.exit(0);
        }
        if (day >= 24 && day <= 31 || day >= 1 && day <=23 && month ==7 || month == 8 ) {
            System.out.println(day +"\n" + "Лев");
            System.exit(0);
        }
        if (day >= 24 && day <= 31 || day >= 1 && day <=23 && month ==8 || month == 9 ) {
            System.out.println(day +"\n" + "Дева");
            System.exit(0);
        }
        if (day >= 24 && day <= 30 || day >= 1 && day <=23 && month ==9 || month == 10 ) {
            System.out.println(day +"\n" + "Весы");
            System.exit(0);
        }
        if (day >= 24 && day <= 31 || day >= 1 && day <=22 && month ==10 || month == 11 ) {
            System.out.println(day +"\n" + "Скорпион");
            System.exit(0);
        }
        if (day >= 23 && day <= 30 || day >= 1 && day <=21 && month ==11 || month == 12 ) {
            System.out.println(day +"\n" + "Стрелец");
            System.exit(0);
        }

        int yearK = year % 12;
        switch (yearK){
            case (0):
                System.out.println("Обезьяна");
                break;
            case (1):
                System.out.println("Петух");
                break;
            case (2):
                System.out.println("Собака");
                break;
            case (3):
                System.out.println("Свинья");
                break;
            case (4):
                System.out.println("Крыса");
                break;
            case (5):
                System.out.println("Бык");
                break;
            case (6):
                System.out.println("Тигр");
                break;
            case (7):
                System.out.println("Кролик");
                break;
            case (8):
                System.out.println("Дракон");
                break;
            case (9):
                System.out.println("Змея");
                break;
            case (10):
                System.out.println("Лошадь");
                break;
            case (11):
                System.out.println("Коза");
                break;
        }
    }
}
