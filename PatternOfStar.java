import java.util.Scanner;

public class PatternOfStar {
    public static void main(String[] args) {


//    for(int j=1; j<=r; j++) {
//        for (int i = 1; i <= c; i++) {
//            System.out.println(i);
//
//
//        }
//        System.out.println();
//    }
        for(int I=1;I<=5;I++) {

            for (int j = 1; j <= I; j++)

                System.out.print(I);

            for (int j = 5; j > I; j--)

                System.out.print(I);

            System.out.println();
        }
    }
}
