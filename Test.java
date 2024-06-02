class Parent {
    public void m1(){
        System.out.println("parent");
    }

    }
class Child extends Parent {
    public void m2() {
        System.out.println("child");


    }
}

class Test implements T {
    public void meth1(int i){
        System.out.println("My number is "+i);
    }
    public void meth2(String j){
        System.out.println("My name is "+j);

    }
    public static void main(String[] args){
        Parent p = new Parent();
        p.m1();
        Parent p1 =new Child();
        p.m1();
        //Child c = new Parent();  - incampatable type of reference 
        //p.m2(); - this wnt work, parent reference and child object will not work
        Test t =new Test();
        t.m1();
        t.meth1(25); //example of method overloading 
        t.meth2("Sradha");


    }

    @Override
    public void m1() {
        System.out.println("Hello Hii Bye Bye");
    }
}


