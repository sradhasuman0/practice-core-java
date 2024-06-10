import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a>b)
//            System.out.println("A");
//        else if(b>a)
//            System.out.println("B");
        AB ab = new AB();
        ab.asciiTableOutput();
    }
    public void asciiTableOutput(){
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.nextLine().charAt(0);
        int assciiValue = (int) ch;
        System.out.println("The asscii value of the "+ch+" is "+assciiValue);
        sc.close();


    }

}
