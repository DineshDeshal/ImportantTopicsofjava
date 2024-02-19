//public class howtocreateaOBJECT {
//    int age = 18;
//    String name = "Dinesh";
//    public static void main(String[] args) {
//        howtocreateaOBJECT person = new howtocreateaOBJECT();
//        System.out.println(person.age);
//        System.out.println(person.name);
//
//    }
//}
// now create A another class and access the value;


class Student{
    String name= "Dinesh";
    int age = 18;

}

public class howtocreateaOBJECT {
    public static void main(String[] args) {
        Student persone = new Student();
        System.out.println(persone.name);
        persone.name = "kanhaiya";
        Student sc = new Student();
        System.out.println(persone.name);
        System.out.println(sc.name);
    }
}
