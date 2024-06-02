 interface NewInterface {
    public void m1();

}
interface OldInterface{
public void m1();

}

interface T extends NewInterface, OldInterface{


}