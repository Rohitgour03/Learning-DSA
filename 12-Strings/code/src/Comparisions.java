public class Comparisions {
    public static void main(String[] args) {

        /*
            String Pool :
            It is separate memory section in the heap memory where the same valued String object is never re-created
            , and it is an optimisation done by java for performance.
        */


        /*
        *  "==" ---> Comparator operator which cdhecks if reference variables pointing to the same object
        *  ".equals()" ---> String method that checks only the values not the reference.
        * */

        // Both name1 and name2 have same referenced to the "Rohit" object present inside the pool memory
        String name1 = "Rohit";
        String name2 = "Rohit";
//        System.out.println(name1 == name2);
//        System.out.println(name1.equals(name2));


        // Creating new "Rohit" objects for a and b, which will be present inside the heap memory but not in the pool.
        String a = new String("Rohit");
        String b = new String("Rohit");
        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // True
    }
}
