class Mythread extends Thread{
    static Thread t1;
    public void run(){
        t1.yield();
        for(int i=0; i<10; i++){
            System.out.println("child thread");
        }

    }
}

public class ChildThreadWillWait {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        Mythread.t1 = Thread.currentThread();
        //Thread.t1 = Thread.currentThread();
        //why we cant call t1 object with Thread, it's static right?
        t.start();

        System.out.println(Thread.currentThread());
        for(int i=0; i<10; i++)
        {
            System.out.println("main thread");
        }
    }
}


