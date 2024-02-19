public class Sorting {
    public static void check(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
// Bubble sorting
//        // here Time complexitiy is O*n2 big O and n square;
    }
    // bubble sorting like elements in ascading order;
    // here we give condition like array.length-1 which is defines that last element manuplate it`self
    // without iterting
    public static void main(String[] args) {
        int[] array = {2,6,4,7,3,9};
        for(int i=0; i< array.length-1; i++){
            for(int j=0; j< array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
// in stable sorting the original order of Similiar value will not be change ....

        }
      check(array);

    }

}


// Selection sorting  

