package CLASS;

public class copycons {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        s1.name="Harshit";
        s1.roll=4;

        Student s2=new Student(s1);

    }
}
class Student{
    String name;
    int roll;
    int marks[];
    Student(Student s1){
        int marks[]=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;

    }
    Student(){
        int marks[]=new int[3];

    }
}
