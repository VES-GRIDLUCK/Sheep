import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x > -10 && x < 0 && y < 10 && y > 0){
                System.out.println("II");
        }

        if(x < 10 && x > 0 && y < 10 && y > 0){
                System.out.println("I");
        }

        if(x > -10 && x < 0 && y > -10 && y < 0){
                System.out.println("III");
        }

        if(x < 10 && x > 0 && y > -10 && y < 0){
                System.out.println("IV");
        }
    }
}
