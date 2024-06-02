 class InteruptedMethodExample  extends Thread{

    public void run(){
        System.out.println("starting of child thread");
        try{
            for(int i=0; i<10; i++)
            {
                System.out.println("running the chld thread");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("child thread got interupted");
        }
    }

}

  class ITest
{
    public static void main(String[] args) {
        InteruptedMethodExample im = new InteruptedMethodExample();
        im.start();
        im.interrupt();
        System.out.println("end of main thread");
    }
}
