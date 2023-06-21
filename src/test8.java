import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        System.out.println("Введите числа:");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y  = scanner.nextInt();
        if((x%2==0)&&(y%2==0)){
            System.out.println("Чётные!!!");
        }
        else if((x%2!=0)&&(y%2!=0)){
            System.out.println("Нечётные!!!");
        }
        else{
            System.out.println("   ");
        }
    }
}
