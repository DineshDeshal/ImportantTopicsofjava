import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Boolean> list2 = new ArrayList<>();
        // how to add

        list.add(0);
        list.add(1);
        list.add(5);
//        System.out.println(list);
        // how to get ..

       int element = list.get(2);
        System.out.println(element);
    }
}
