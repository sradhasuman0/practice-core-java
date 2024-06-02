public class Student {
    String name;
    int rollNumber;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[]args)
    {
        Student s1 = new Student();
        s1.setName("sradha");
        String name = s1.getName();
        System.out.println(name);


    }

}
