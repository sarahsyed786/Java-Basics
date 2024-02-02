class Computer
{
        public void met()
        {
            System.out.println("This is a method in the computer class");
        }


}

class Laptop extends Computer
{
        public void met2()
        {
            System.out.println("This is a method in the laptop class");
        }
}




public class Dispatch {
    public static void main(String[] args) {

        Computer obj = new Laptop();
        obj.met();
        
    }
}
