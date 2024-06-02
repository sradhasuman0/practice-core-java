import java.net.StandardSocketOptions;

public class Practice {
    public void m1(){
        try {
            // Code that may throw an exception
            System.out.println(10/0);
        } catch (Exception e) {
            // Code to handle the exception
            System.out.println(10/2);

        }

    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.m1();
    }

}
