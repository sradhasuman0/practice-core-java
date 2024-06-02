public class StringReverseWithoutMethod {
    String name ="sradha";
    String space = "";
    String reversed;
    char c;
    public static void main(String[] args) {
        StringReverseWithoutMethod s = new StringReverseWithoutMethod();
        s.m1();
    }
    public void m1(){
        for(int i =0; i<name.length(); i++)
        {
            c= name.charAt(i);
            space = c+space;

        }
        System.out.println("the new revesed string is "+space);



    }

}
