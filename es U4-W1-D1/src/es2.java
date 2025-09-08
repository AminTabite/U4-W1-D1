import java.util.Scanner;

public class es2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("inserire la prima stringa");
        String str1 = scanner.nextLine();

        System.out.println("inserire seconda stringa");
        String str2 = scanner.nextLine();

        System.out.println("inserire terza stringa");
        String str3 = scanner.nextLine();

        InteractiveStrings(str1, str2, str3 + " " + str3 + str2 + str1);
    }


    public static String InteractiveStrings(String str1, String str2, String str3) {


        System.out.println("Hai dichiarato che" + " " + str1 + str2 + str3);
        return str1 + " " + str2 + " " + str3 + "al contrario" + " " + str3 + str2 + str1;
    }

    ;


}

