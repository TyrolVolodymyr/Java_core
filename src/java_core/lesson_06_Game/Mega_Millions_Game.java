package java_core.lesson_06_Game;

import java.util.Scanner;

public class Mega_Millions_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = 0;
        int [] randomArray = new int[5];
        for (int i = 0; i <randomArray.length ; i++) {
            randomArray[i]= random = (int)(Math.random()*100);
        }

        System.out.println("Welcome to our Game");
        System.out.println("Rules of the game:");
        System.out.println("Draw your numbers and wait result:)");
        System.out.println("Example:");
        for (int i = 0; i <randomArray.length ; i++) {
            System.out.print(randomArray[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        System.out.print("DRAW YOUR NUMBERS:");
        System.out.println("");
        int [] userArray = new int[5];
        for (int i = 0; i <userArray.length ; i++) {
            userArray[i]= sc.nextInt();
        }
        System.out.println("WINNING NUMBERS:");
        for (int i = 0; i <randomArray.length ; i++) {
            System.out.print(randomArray[i]+" ");
        }
        System.out.println("");
        System.out.println("Let's compare with your numbers:");
        for (int i = 0; i <userArray.length ; i++) {
            System.out.print(userArray[i] + " ");
        }
        System.out.println("");
        int point = 0;
        for (int i = 0; i <randomArray.length ; i++) {
                if (randomArray[i]==userArray[i]) {
                 point++;
                 }
        }
            if (point==5){
                System.out.println("");
                System.out.println("Congratulations You Win Jackpot!!!");
            }
            else if (point==4){
                System.out.println("");
                System.out.println("Congratulations You Win $1,000,000!!!");
            }
            else if (point==3){
                System.out.println("");
                System.out.println("Congratulations You Win $500!!!");
            }
            else if (point==2){
                System.out.println("");
                System.out.println("Congratulations You Win $10!!!");
            }
            else if (point==1&&userArray[4]==randomArray[4]){
                System.out.println("");
                System.out.println("Congratulations You Win $2!!!");
        }else {
                System.out.println("");
                System.out.println("Maybe You will win next time");
            }


        }


    }

