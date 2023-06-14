import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("ведите день недели");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Понедельник");
            break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня нет");

        }
    }
}
