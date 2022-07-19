public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    static int fibonacci(int n){

        // Base conditions
        if(n<2){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
