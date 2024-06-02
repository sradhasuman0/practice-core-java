import com.sun.jdi.PathSearchingVirtualMachine;

public class SingletonMyclass {
     private static volatile SingletonMyclass sm = null;
    private SingletonMyclass(){
    }

    public static SingletonMyclass getSingletonMyclass(){
       if (sm == null){
           synchronized (SingletonMyclass.class)
           {
               if(sm == null)
                   return sm = new SingletonMyclass();
           }
       }
       return sm;
    }
}

class SingletonTest{
    public static void main(String[] args) {
        SingletonMyclass t = SingletonMyclass.getSingletonMyclass();
        SingletonMyclass t1 = SingletonMyclass.getSingletonMyclass();

        System.out.println(t);
        System.out.println(t1);
    }
}