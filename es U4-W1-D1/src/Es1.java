import java.util.Arrays;

public class Es1 {

    public static char[] elements = new char[6];

    public static void main(String[] args) {
        Multiply(6, 7);
        Toconcat("gatto", 4, 2).concat("prova");


        elements[0] = 'A';
        elements[1] = 'B';
        elements[2] = 'C';
        elements[3] = 'D';
        elements[4] = 'E';

        char random = 'Z';

        AddintoArray(elements, random);


    }

    public static int Multiply(int n1, int n2) {

        System.out.println("il risultato e' " + " " + (n1 * n2));

        return n1 * n2;
    }

    public static String Toconcat(String str1, int n3, int n4) {
        System.out.println(" unione degli elementi" + " " + (str1 + String.valueOf(n3) + " " + String.valueOf(n4)));
        return str1 + String.valueOf(n3) + " " + String.valueOf(n4);
    }

    public static char[] AddintoArray(char[] arr, char random) {

        int i = 0;

        char[] NewArray = new char[6];

        {


            NewArray[0] = elements[3];
            NewArray[1] = elements[4];
            NewArray[2] = random;
            NewArray[3] = elements[0];
            NewArray[4] = elements[1];
            NewArray[5] = elements[2];

            System.out.printf("Il nuovo array e'" + " " + Arrays.toString(NewArray));

        }
        ;
        return NewArray;


    }

}
