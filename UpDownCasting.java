class A{

    public void showA()
    {
        System.out.println("In Class A.");

    }
}

class B extends A
{
    public void showB()
    {
        System.out.println("In Class B.");
    } 
}



public class UpDownCasting {
    public static void main(String[] args) {
        //Up casting
        A obj = (A) new B();
        obj.showA();

        //down casting
        B obj2 =  (B) obj;
        obj2.showB();

    }
}
