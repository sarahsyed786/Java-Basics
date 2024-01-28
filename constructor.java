class Student{


    int marks;
    String subject;
    String name;

    public Student() 
    {

    }

    public Student(int marks, String subject, String name) 
    {
        this.marks = marks;
        this.subject = subject;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}



public class constructor {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setMarks(85);
        obj1.setName("Mark");
        obj1.setSubject("OOP");

        System.out.println(obj1.getName() + ":"+obj1.getSubject()+ ":"+ obj1.getMarks());
    
    
        Student obj2 = new Student(89, " HCI", "Karl");
        System.out.println(obj2.getName()+":"+ obj2.getSubject()+":"+obj2.getMarks());
    
    
    }
}
