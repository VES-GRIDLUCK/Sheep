import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Шашлычная");

        int[] day = new int[30];

        for (int d = 1; d <= day.length+1; d++) {
            System.out.println("День " + d);

            int[] weight = new int[31];

            int[] wool = new int[2];

            System.out.println("п/н " + "Мясо " + "Шерсть");

            for (int i = 1; i < weight.length; i++) {
                weight[i] = ((int) (Math.random() * 30) + 50);

                if (i < 10) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print(i + " ");
                }

                for (int j = 1; j < wool.length; j++) {
                    wool[j] = ((int) (Math.random() * 350) + 1000);
                    System.out.println(" " + weight[i] + "   " + wool[j]);
                }
            }
        }
    }
 }

