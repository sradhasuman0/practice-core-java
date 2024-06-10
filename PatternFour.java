import java.util.Scanner;

public class PatternFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=1; r<=n; r++){
            for(int c =r; c<=r+(r-1); c++){
                System.out.print(c);
            }
            System.out.println(" ");
        }


    }
}
