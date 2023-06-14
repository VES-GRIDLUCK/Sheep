import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("Введите время :");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        if( time <= 6 ){
            System.out.println("Доброй ночи!");
        }
        if( time <= 15 ){
            System.out.println("Доброй день!");
        }
        if( time <= 21 ){
            System.out.println("Доброй вечер!");
        }
        if( time <= 24 ){
            System.out.println("Доброй ночи!");
        }
    }
}
