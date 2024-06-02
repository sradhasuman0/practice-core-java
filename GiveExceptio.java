import java.sql.SQLOutput;

public class GiveExceptio extends Exception {
    public void m1(int num){
        try
        {
            if(num%2!=0){
                throw new Exception("odd number");

            }

        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        GiveExceptio g = new GiveExceptio();
        g.m1(11);
    }
}
