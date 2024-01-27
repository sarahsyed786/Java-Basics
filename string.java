public class string {
    public static void main(String[] args) {
         String name  = " Jhon ";
         System.out.println(name);

         StringBuffer sb = new StringBuffer("Jhon");
         //add char at specific position
         sb.insert(4, "s");
         System.out.println(sb);//output: Jhons

         System.out.println(sb.capacity());

         sb.deleteCharAt(2);
         System.out.println(sb);



    }
}
