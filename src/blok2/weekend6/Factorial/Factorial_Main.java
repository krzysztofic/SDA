package blok2.weekend6.Factorial;

public class Factorial_Main {

    public static void main(String[] args) {

        Factorial_Recursive f = new Factorial_Recursive();

        int recursion = 0;
        recursion = f.factorialRecursive(4);

        System.out.println("Recursion "+ recursion);
    }
}
