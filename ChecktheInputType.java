import java.util.Scanner;

public class ChecktheInputType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);

        if(Character.isLowerCase(c))
            System.out.println("Lowercase");
        else if(Character.isUpperCase(c))
            System.out.println("Uppercase");
        else
            System.out.println("numeric charcter");
    }

}
