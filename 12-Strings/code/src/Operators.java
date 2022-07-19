import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b');   // 195
        System.out.println("a" + "b");   // ab

        System.out.println('a' + 3);     // 100
        System.out.println((char)('a' + 3));  // d

        System.out.println("a" + 3);   //a1
        // After few steps it is same as the "a" + "1"
        // int is converted to the Integer that will call toString()


        System.out.println("Rohit" + new ArrayList<>());
        System.out.println("Rohit" + new Integer(03));
        String ans = new Integer(3) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
