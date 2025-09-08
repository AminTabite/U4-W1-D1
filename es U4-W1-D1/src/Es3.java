import java.util.Scanner;

public class Es3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserire il primo lato ");
        double L1 = scanner.nextDouble();
        System.out.println("inserire il secondo lato ");
        double L2 = scanner.nextDouble();

        double Perimetro = PerimetroRettangolo(L1, L2);
    }

    public static double PerimetroRettangolo(double L1, double L2) {

        System.out.println("il perimetro e'" + " " + 2 * (L1 + L2) + "cm");
        return 2 * (L1 + L2);
    }


}
