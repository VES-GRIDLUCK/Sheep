import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        System.out.println("Введите координаты");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Координата А: ");
        int a = scanner.nextInt();

        System.out.print("Координата Б: ");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println("Спуск!!!");
        }
        else if (a<b) {
            System.out.println("Подъём!!!");
        }
        else {
            System.out.println("Прямая!!!");
        }
    }
}
