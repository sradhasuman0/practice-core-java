import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        float c =1;
        Scanner in = new Scanner(System.in);
        float f = in.nextFloat();
        c = (f-32)*5/9;
        System.out.println(c);
    }
}
