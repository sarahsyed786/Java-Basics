
abstract class HasName
{
    public abstract void show();
   
}

public class AnonyInnerClass {

    public static void main(String[] args) {
        HasName obj = new HasName()
        {
            public void show()
            {
                System.out.println("This is Anonymous Class");
            }
        };
        obj.show(); // calling the method of anonymous inner class
    }
    
}
