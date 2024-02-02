class  Calc
{
    public final int add(int a, int b) {
        System.out.println("This is method in super class");
        return a+b;

    }

}

class AdvCalc extends Calc
{
    // public int  add(int a, int b) {
    //     System.out.println("This is method in sub class");
    //     return a+b;

    // }

}


public class Final {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.add(5, 5);
    }
}
