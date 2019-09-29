package blok2.weekend6.Factorial;

public class Factorial_Recursive {


    public int factorialRecursive(int n){
        int result = 1;
        if (n < 2){
            return result;
        }

        if (n >= 2){
            return n * factorialRecursive(n-1);
        }
        return result;
    }
}
