class Student 
{
    private int age;
    private String name;

    public int getAge()
        {
            return age;
        }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

}

public class encapsulation
 {
    
    public static void main(String args[])
   {

    Student obj = new Student();
    obj.setAge(20);
    obj.setName("Sarah");

    System.out.println(obj.getName() + ":" + obj.getAge());
        
    }
}
