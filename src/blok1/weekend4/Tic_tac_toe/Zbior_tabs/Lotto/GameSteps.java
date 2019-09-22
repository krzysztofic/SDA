package blok1.weekend4.Tic_tac_toe.Zbior_tabs.Lotto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameSteps {

    private static Scanner scan = new Scanner(System.in);
    private static Random rand = new Random();

    static void playerchoices(){

        ArrayList playerList = new ArrayList<>();

        System.out.println("Enter your types (6 digits): ");
        for (int i = 0; i <=5 ; i++) {
            int x = scan.nextInt();
            playerList.add(x);
        }
        System.out.print("Your digits is: \n"+playerList+"\n");
    }


    static void lottoMachine() throws InterruptedException {

        ArrayList computerList = new ArrayList<>();
        System.out.print("\n" +
                "The draw machine chamber is empty, the lock is released\n" +
                "And we start drawing six digits: \n\n" +
                "[");

        for (int i = 0; i <=5 ; i++) {
            int x = rand.nextInt(49);
            computerList.add(x);
            Thread.sleep(1000);
            System.out.print(x+ " ");
        }
        System.out.println("]");


    }

}
