import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {

        System.out.println("Enter year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year%4==0)&&(year%100!=0)){
            System.out.println("366 days");
        }
        else if((year%4==0)&&(year%100==0)&&(year%400==0)){
            System.out.println("366 days");
        }
        else {
            System.out.println("365 days");
        }
    }
}

