public class ReverseStringRe {
    public static void main(String[] args) {
        ReverseStringRe rv = new ReverseStringRe();
        rv.reverseString();
    }
    public void reverseString(){
        String s = "Sradha";
        char c;
        String space = " ";
        for(int i=0; i<s.length(); i++)
        {
            c = s.charAt(i);
            space = c + space;

        }
        System.out.println("the reversed string " + space);
    }
}
