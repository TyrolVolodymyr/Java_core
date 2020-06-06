package java_core.lesson_06_Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random()*10);
        //System.out.println("random = " + random);

        System.out.println("Welcome to our Game");
        System.out.println("Rules of the game:");
        System.out.println("Computer generate random a number from 0 to 10.");
        System.out.println("You have to guess it in 5 attempt.");
        System.out.println("Good luck!!!");


        for (int attempt = 1; attempt <=5; attempt++) {
            System.out.print("Put your attempt #"+attempt+":");
            int userAnswer = sc.nextInt();
            if (userAnswer==random) {
                System.out.println("");
                System.out.println("Congratulations You Win!!! in attempt: "+attempt+" of 5 attempt");
                break;
            }if (userAnswer>random){
                System.out.println("My number smaller than yours");
            }if (attempt<=10&&userAnswer<random){
                System.out.println("My number bigger than yours");
            }if (attempt==5&&userAnswer!=random){
                System.out.println("Game Over, my number was:" + random);
            }

        }





    }
}
