public class RecursionThatHalts {
    public static void main(String [] args) {
        System.out.println("main method called");
        fibonacci(0,1);
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
    public static void fibonacci(int j, int i){
        int sum = i + j;
        System.out.println(sum);
        if (sum < 1836311903){
            j = i;
            i = sum;
            fibonacci(j,i);
        }
    }

}
