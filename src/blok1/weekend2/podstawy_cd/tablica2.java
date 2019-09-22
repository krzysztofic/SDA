package blok1.weekend2.podstawy_cd;

public class tablica2 {

    public static void main(String[] args) {
        int[][] table = new int[5][5];
        for (int i = 0; i < table[0].length; i++) {
            table[2][i] = 1;
        }

        printArray(table);
    }

    static void printArray(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[0].length; y++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }
}
