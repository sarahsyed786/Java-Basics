public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Original string: " + str);
        String rstr = "";

        for(int i =  str.length() - 1; i >= 0; i--) {
            rstr += str.charAt(i);
        
        }
        System.out.println("\nReversed string: " + rstr);
    
}}
