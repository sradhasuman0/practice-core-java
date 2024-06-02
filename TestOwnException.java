 class TooyoungException extends RuntimeException {
    TooyoungException(String msg){
        super(msg);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String msg){
        super(msg);
    }
}

class TestOwnException{
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>18){
            throw new TooyoungException("It's not right time to get married");
        }
        else if(age<35){
            throw new TooOldException("You are too old to get married");
        }
        else
        {
            System.out.println("your application is registered");
        }
    }
}
