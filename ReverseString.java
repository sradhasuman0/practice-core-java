public class ReverseString {
    public static void main(String[] args) {
        ReverseString rev = new ReverseString();
        rev.m1();

    }
    public void m1(){
        String s = "sradha suman  sarangi";
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder newReveredString = s1.reverse();
        String reversed = newReveredString.toString();
        System.out.println("reversed name is "+ reversed+ "length of the string is "+ reversed.length());
    }


}
