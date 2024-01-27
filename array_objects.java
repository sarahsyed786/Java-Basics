class Student{
    String name;
    int marks;
}


public class array_objects {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Jhon";
        s1.marks = 87;

        Student s2 =  new Student();
        s2.name = "Mark";
        s2.marks = 85;

        Student s3 = new Student();
        s3.name = "Karl";
        s3.marks = 83;

        Student students[] =  new Student[3];
        for (int i = 0; i<students.length; i++){
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;

            System.out.println(students[i].name + ":" + students[i].marks);
        }
        

        for( Student std : students)
        {
            System.out.println(std.name + " : " + std.marks);
        }
    }
}
