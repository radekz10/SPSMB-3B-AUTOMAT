import java.util.Scanner;

public class BabylonMethod {

    static double odmocnina(double c) {

        double a = c;
        double b = 1;
        double e = 0.000001;

        while (a - b > e) {
            a = (a + b) / 2;
            b = c / a;
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo :");

        int number = Integer.parseInt(sc.nextLine());

        System.out.print("Odmocnina "+ number + " je " + odmocnina(number));

    }
}