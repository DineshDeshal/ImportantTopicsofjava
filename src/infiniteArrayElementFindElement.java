public class infiniteArrayElementFindElement {
    public static void main(String[] args) {
   int[] array = {21,34,45,67,78,98,114,122,144,663,777,888,999,9993,388383,272728832,273737373};
   int target = 567892;
        System.out.println(check(array,target));
    }
//    yanha start point 0 and end point 1 then use phle ye element fir start Agli bar end + 1, end = phli array ke tukde ka
    // double lete jaenge

  static int check(int[] array,int target){
        int start = 0;
        int end = 1;
        while(target>array[end]){
            int newstart = end+1;
            end  = Math.min(end+ (end-start+1)*2, array.length-1);
            start = newstart;
        }
        return binarysearch(array,target,start,end);
    }
    static int binarysearch(int[] array,int target,int start,int end){
         while(start<=end){
             int mid = start+(end-start)/2;
             if(target<array[mid]){
                 end = mid-1;
             }else if(target>array[mid]){
                 start = mid+1;
             }else{
                 return mid;

             }
         }
         return -1;
    }
}
