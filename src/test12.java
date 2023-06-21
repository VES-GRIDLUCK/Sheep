import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        int sum1 = sum += x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        sum += x % 10;
        x /= 10;
        sum += x % 10;
        int sum2 = sum - sum1;
        System.out.println(sum1 == sum2);

    }
}
