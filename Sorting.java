import java.util.Arrays;

class hash{
    int[] arr = {3, 10, -2, 5, 7};
    int[] sArr = {};
        public void hash_code()
        {
           
           
            if (arr.length > 0){
                    sArr = new int[arr.length];
                    for (int i=0;i<5;i++){
                        if(i >arr[i]){
                        sArr[i] = arr[i];
                        }
                    }
        }
        
        System.out.println(sArr);
        }

       
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Arrays.hashCode(arr);
            result = prime * result + Arrays.hashCode(sArr);
            return result;
        }

}



public class Sorting {


    public static void main(String[] args) {
       hash obj = new hash();
       obj.hash_code();
        
     
    
}

    
    
    }

    