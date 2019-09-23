package blok2.weekend5.Figury;

public class Four {

    public static void main(String[] args) {


        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

                int sum = i + j;

                if (i == j) {
                    System.out.print("*");
                }
                if (sum == 5) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}
