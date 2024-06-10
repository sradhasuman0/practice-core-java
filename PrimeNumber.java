import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        int count =0;
        for(int i=1; i<100; i++){
            if(prime%i==0)
                count ++;
        }
        if(count == 1 || count ==2)
            System.out.println("number is prime");
        else
            System.out.println("number is not prime");
    }
}
