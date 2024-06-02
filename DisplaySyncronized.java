public class DisplaySyncronized {
    public synchronized void display(String name){

        for(int i=0; i<10; i++){

            try{
                System.out.println("my name is "+name);
                Thread.sleep(20);
            }
            catch(InterruptedException e){
                System.out.println("end of code");
            }
        }
    }
}

class TestThread extends Thread{
    DisplaySyncronized d;
    String name;
    TestThread(DisplaySyncronized d, String name){
        this.d=d;
        this.name = name;
    }
    public void run(){
       d.display(name);
    }
}

 class TestMain
{
    public static void main(String[] args) {
        DisplaySyncronized d1 = new DisplaySyncronized();

        TestThread t = new TestThread(d1,"Dhoni");
        TestThread t1 = new TestThread(d1,"Virat");
        TestThread t2= new TestThread(d1,"Raina");
        TestThread t3 = new TestThread(d1,"sradha");


        t.start();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("main thread running");
    }
}
