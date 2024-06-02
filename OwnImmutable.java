public class OwnImmutable {
    private int i;
    OwnImmutable(int i){
        this.i = i;
    }
    public OwnImmutable modify(int i){
        if(this.i == i){
            return this;
        }
        else
            return new OwnImmutable(i);
    }
}

class TestOwn{

    public static void main(String[] args) {
        OwnImmutable t = new OwnImmutable(10);
        OwnImmutable t1 = t.modify(100);
        OwnImmutable t2 = t.modify(10);
        System.out.println(t==t1);
        System.out.println(t==t2);
}

}
