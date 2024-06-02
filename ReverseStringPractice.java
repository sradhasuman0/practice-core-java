 class TestMe{

    public void m1(){
        String s = "hello World";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = sb.reverse();
        String reversed = sb1.toString();

    }


}
class ReverseMe{
    public static void main(String[] args) {
        TestMe t = new TestMe();

    }
}
