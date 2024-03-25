public class RecursionThatHalts {
    public static void main(String [] args) {
        System.out.println("main method called");
        fibonacci(1);
        System.out.println("main method ended");
    }

    public static void recursiveMethod(int n) {
        System.out.println("recursive called, n = " + n);
        if (n < 6) {
            recursiveMethod(n + 2);
        }
        System.out.println("recursive ended, n = " + n);
    }
    public static void simpleRecursion(int n) {
        System.out.println("recursive call, n = " + n);
        if (n > 2) {
            simpleRecursion(n - 1);
        }
        System.out.println("recursive end, n = " + n);
    }
    public static void fibonacci(int n){
        int i = 0;
        n += i;

        System.out.println(n);
        if (n < 1836311903){
            n++;
            fibonacci(n+1);
        }
    }

}
