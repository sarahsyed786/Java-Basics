class X
{
    public int add(int a, int b )
    {
        return a + b;
    }
}

class Y extends X
{
    public int add(int a, int b )
    {
        return a + b + 5;
    }
}




public class OverRiding {
    public static void main(String[] args) {
        Y obj  = new Y();
        int result = obj.add(5,5);
        System.out.println(result);

    }
}
