import java.util.Scanner;

public class Es3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /*  System.out.println("inserire il primo lato "); // es 1
        double L1 = scanner.nextDouble();
        System.out.println("inserire il secondo lato ");
        double L2 = scanner.nextDouble();

        double Perimetro = PerimetroRettangolo(L1, L2);*/

        System.out.println("Inserisci un numero");  //es 2
        int N6 = scanner.nextInt();

        int Result = IsN6EvenorOdd(N6);
        System.out.println(Result);


        System.out.println("Inserire il primo lato");
        double lt1 = scanner.nextDouble();
        System.out.println("Inserire il secondo lato");
        double lt2 = scanner.nextDouble();

        double Perimetro = PerimetroT(lt1, lt2);

    }

    public static double PerimetroRettangolo(double L1, double L2) {

        System.out.println("il perimetro e'" + " " + 2 * (L1 + L2) + "cm");
        return 2 * (L1 + L2);
    }

    public static int IsN6EvenorOdd(int N6) {

        if (N6 % 2 == 0) {
            return 0;
        } else {
            return 1;
        }


    }

    public static double PerimetroT(double lt1, double lt2) {

        
    }

}
