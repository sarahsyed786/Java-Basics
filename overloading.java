class method_overloading
{
    public int add( int n1,  int n2)
    {
        int r = n1+n2;
        return r;
    }

    public double add (int  n1, int n2, int n3)
    {
        int r = n1+n2+n3;
        return r;
    }
}

public class overloading {
    public static void main(String[] args) {
        
        method_overloading obj = new method_overloading();
        int result = obj.add(5, 5);
        double result2 = obj.add(5, 5, 5);
        System.out.println(result + " " +  result2);



    }
}
