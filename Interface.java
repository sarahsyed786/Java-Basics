interface Computer
{
    void code();
}

class Laptop implements  Computer 
{
    public void code()
    {
        System.out.println("This is Laptop");

    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("This is Desktop");
    }

}

class Developer 
{
    public void developer(Computer lap)
    {
        lap.code();
    }
}



public class Interface {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        Desktop desk = new Desktop();
        Developer dev = new Developer();
        dev.developer(obj);
        dev.developer(desk);
        
    }
    
}
