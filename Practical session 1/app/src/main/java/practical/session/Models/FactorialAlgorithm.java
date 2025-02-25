package practical.session.Models;

public class FactorialAlgorithm {

    /*A recursive algorithm will call it self until a base case 
     * is met, which in this case will be when n == 0.
     */
    public static int factorialRecursive(int n) {
        if (n == 0) return 1;

        else return n * factorialRecursive(n-1);
    } 
    

    /*A iterative algorithm will loop through a code until a value is met.
     * 
     */
    public static int factorialIterative(int n) {

        for(int i = n-1; i > 0; --i) {

            n *= i;

        }

        return n; 
    }
}
