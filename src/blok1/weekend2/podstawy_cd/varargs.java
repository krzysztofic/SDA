package blok1.weekend2.podstawy_cd;

import java.io.FileNotFoundException;

public class varargs {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(sum(2,3,4,5));
    }

    static int sum(int...args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return  result;
    }
}
