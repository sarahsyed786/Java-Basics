abstract class Animal
{
    abstract  void eat();
    public void running()
    {
        System.out.println("Animal running...");
    }
}

class Cat extends Animal
{
    public  void eat(){
        System.out.println("Cat is eating...");
    }
}



public class Abstract {
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.eat();
        obj.running();
    }
    
}
