import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("ведите животное");
        System.out.println("1. Собака");
        System.out.println("2. Кошка");
        System.out.println("3. Утка");

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Гав-гав");
                break;
            case 2:
                System.out.println("Мяу-мяу");
                break;
            case 3:
                System.out.println("Га-Га-Га");
                break;
            default:
                System.out.println("Что ты за животное????");
        }
    }
}
