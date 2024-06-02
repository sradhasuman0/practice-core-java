 class ParentThread {
    public static void main(String[] args) {
        Newthreading t = new Newthreading();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("parent thread");
        }
    }
}
