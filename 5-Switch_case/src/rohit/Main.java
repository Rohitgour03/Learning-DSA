package rohit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of the fruits");
            case "apple" -> System.out.println("Round and Red and sweet Fruit");
            case "orange" -> System.out.println("round Fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("Not a valid fruit");
        }
        System.out.println("Hello world!");
    }
}