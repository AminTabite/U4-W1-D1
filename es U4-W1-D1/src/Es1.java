public class Es1 {

    public static void main(String[] args) {
        Multiply(6, 7);
        Toconcat("gatto", 4, 2).concat("prova");


    }

    public static int Multiply(int n1, int n2) {

        System.out.println("il risultato e' " + " " + (n1 * n2));

        return n1 * n2;
    }


    public static String Toconcat(String str1, int n3, int n4) {
        System.out.println(" unione degli elementi" + " " + (str1 + String.valueOf(n3) + " " + String.valueOf(n4)));
        return str1 + String.valueOf(n3) + " " + String.valueOf(n4);
    }


}
