package CLASS;

public class construc{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Harshit");
        Student s3=new Student(5);
    }
}
class Student{
    String name;
    int roll;
    //case of constructor overloading
    Student()
    {
        System.out.println("without parameter constructor calling");
    }
    Student(String s)
    {
        this.name=s;

    }
    Student(int roll)
    {
        this.roll=roll;
    }
}
