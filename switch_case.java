public class switch_case {
    
    public static void main(String[] args) {
        int x = 3;

        switch (x) {
            case 1 -> System.out.println("Monday");

            case 2 ->  System.out.println("Tuesday");
                
            case 3 -> System.out.println("Wdnesday");

            case 4 -> System.out.println("Thursday");

            case 5 -> System.out.println("Friday");

            case 6 -> System.out.println("Saturday");
                
            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Not a valid number. ");
        }
    }
}
