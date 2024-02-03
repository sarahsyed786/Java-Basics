class Outer
{

    public void Outer()
        {
           System.out.println("This is outer class");

        }

    static class Inner 
    {
        public void Inner()
        {
           System.out.println("This is inner class");

        }
    }
}



public class InnerClass {
    public static void main(String[] args) {
        
        Outer objOuter = new Outer();
        objOuter.Outer();
        Outer.Inner objInner = new  Outer.Inner();
        objInner.Inner();

    }
    
}
