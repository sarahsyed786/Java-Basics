class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}

class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }

    public int divd(int n1, int n2)
    {
        return n1/n2;
    }
}



public class inheritance {
        public static void main(String[] args) {
            AdvCalc obj = new AdvCalc();
            int r1 = obj.add(5, 3);
            int r2 = obj.sub(10, 4);
            int r3 = obj.divd(15, 3);
            int r4 = obj.multi(3, 5);

            System.out.println(r1 + "  " + r2 + "  " + r3 + "  " +  r4);
        }
}
