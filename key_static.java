class Mobile{
    static String name;
     int price;
     String brand ;

    

     public void details(){
        System.out.println(name + " : " + price + " : " + brand);
     }
}

public class key_static {
    public static void main(String arg[])
    {
        Mobile mob = new Mobile();
        mob.brand = "Apple";
        mob.price= 65000;

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 66000;
        Mobile.name = " Smart Phone ";

        mob.details();
        mob2.details();



    }

}
