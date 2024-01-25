
class Computer
{
    public void  musics()
    {
        System.out.println("Music is playing ");
    }

    public String add(int cost)
    {
        if (cost >= 10)
        {
            return "Pen";
        }

        return "Nothiing";
    }

}

public class objects
 {
    public static void main(String args[])
    {
        Computer obj = new Computer();
        obj.musics();
        String str = obj.add(10);
        System.out.println(str);
    }
}
