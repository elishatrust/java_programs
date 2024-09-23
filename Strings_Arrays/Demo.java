class Student
{
    String name;
    int roll_no;
    int marks;


    public Student(String name, int roll_no, int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public String toString() {

        return "Student [Name: " +name+
                        ", RollNo: "+roll_no+
                        ", Marks: "+marks+"]";
    }



}

public class Demo {
    public static void main(String[] args) 
    {
        Student student[] = new Student[5];

        System.out.println("\nStudent List Array");
        student[0] = new Student("Elisha", 101, 60);
        student[1] = new Student("Esther", 102, 50);
        student[2] = new Student("Careen", 103, 40);
        student[3] = new Student("Calvin", 104, 30);
        student[4] = new Student("Caroline", 105, 20);

        for(Student st : student)
        {
            System.out.println(st);
        }
        
    }
    
}
