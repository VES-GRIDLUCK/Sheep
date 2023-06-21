import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        System.out.println("Введите номер квартиры: ");
        Scanner scanner = new Scanner(System.in);
        int m = 36;
        int n = scanner.nextInt();
        int res = (n / m) + 1;
        System.out.println("Номер подъезда: " + res);
    }
}
