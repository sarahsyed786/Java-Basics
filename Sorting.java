public class Sorting {
        public static void print(int[] unSortedArray)
        {
            for(int sortedArray:unSortedArray)
            {
                System.out.print(sortedArray + " ");
            }
        }

    public static void main(String[] args) {

        int[] unSortedArray = {7,8,3,0,1,2,5};

            /* Bubble Sort */
            /*for(int i=0; i<unSortedArray.length-1; i++)
            {
                for(int j =0; j<unSortedArray.length-i-1; j++)
                {
                    if(unSortedArray[j] > unSortedArray[j+1])
                    {
                        int temp = unSortedArray[j];
                        unSortedArray[j] = unSortedArray[j+1];
                        unSortedArray[j+1] = temp;
                    }
                }
            }*/

            //Selection Sort

            /*for(int i=0; i<unSortedArray.length-1; i++)
            {
                int smallest = i;
                for(int j = i+1; j<unSortedArray.length; j++)
                {
                    if(unSortedArray[j] < unSortedArray[smallest])
                    {
                        smallest = j;
                    }
                    
                }
                //Swap
                int  temp = unSortedArray[smallest];
                unSortedArray[smallest] = unSortedArray[i];
                unSortedArray[i] = temp;

            }*/

            //Insertion Sort

            for (int i =1; i<unSortedArray.length; i++ )
            {
                int key = unSortedArray[i];
                int j = i-1;
                while(j>=0 &&  unSortedArray[j]>key)
                {
                    unSortedArray[j+1] = unSortedArray[j];
                    j--;
                }
                unSortedArray[j+1] = key;

            }

        print(unSortedArray);
    
    


    
    }
    }

    