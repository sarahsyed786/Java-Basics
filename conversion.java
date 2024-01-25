public class conversion {
    public static void main(String[] args) {
        byte b = 127;
        int i  = b;
        System.out.println("The value of variable 'b' is " + b); //
        System.out.println(i);

        //byte conversion bytes range is 256 so if we store bigger values it will perform modulo
        int a = 257;
        byte k = (byte) a;
        System.out.println(k);

        //type promotion 

        byte alpha = 10;
        byte beta = 20;

        int result = alpha + beta ;

        System.out.println(result);


    }
}
