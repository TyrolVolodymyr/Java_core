package java_core.lesson_02_ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //TODO Переписати собі приклад банкомату, який я створював на лекції і дописати функціонал якого там не вистачає, а саме,
        // внести гроші на рахунок,
        // не дозволити зняти гроші якщо на балансі менше грошей ніж запросив юзер
        // власні ідеї які хотіли б додати

        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        boolean work = true;
        int transactionIndex = 0;
        String[] transaction1 = new String[20];
        int[] transaction2 = new int[20];
        int[] transaction3 = new int[20];
        System.out.println("Welcome to ATM");
        while (work) {
            System.out.println("Press 1 to see your balance");
            System.out.println("Press 2 to add money");
            System.out.println("Press 3 to get cash");
            System.out.println("Press 4 to see your transaction");
            System.out.println("Press 5 to Exit");

            String operation = sc.next();
            switch (operation) {
                case "1": {
                    System.out.println("Your balance is: "+balance+"\n");
                    break;
                }
                case "2": {
                    System.out.print("How match you would like add? ");
                    int addMoney = sc.nextInt();
                    balance +=addMoney;
                    if (transactionIndex < transaction2.length){
                    transaction1[transactionIndex] = "add Money";
                    transaction2[transactionIndex] = addMoney;
                    transaction3[transactionIndex] = balance;
                    transactionIndex++;}
                    System.out.println("Transaction is successful");
                    System.out.println("Your balance is: "+balance+"\n");
                    break;
                }
                case "3": {
                    System.out.println("Your balance is: "+balance);
                    System.out.print("How match you would like get? ");
                    int withdraw = sc.nextInt();
                    if (withdraw<=balance){
                    balance -= withdraw;
                        if (transactionIndex < transaction2.length){
                            transaction1[transactionIndex] = "withdraw";
                            transaction2[transactionIndex] -= withdraw;
                            transaction3[transactionIndex] = balance;
                            transactionIndex++;}
                    System.out.println("Transaction is successful");
                    System.out.println("Your balance is: "+balance+"\n");
                    }else
                    System.out.println("You have not enough money for withdraw: "+ withdraw +" Because of your balance is: "+balance+"\n");
                    break;
                }
                case "4": {
                    System.out.println("You have: "+ transactionIndex +" transaction for this session.");
                    System.out.println("Transaction history:");
                    System.out.println("Actions | Amount | Balance");
                    for (int i = 0; i < transactionIndex; i++) {
                        System.out.println(transaction1[i]+" | "+transaction2[i]+" | "+transaction3[i]+"; ");
                    }
                    System.out.println("\n");
                    break;
                }
                case "5": {
                    System.out.println("Have a nice Day!");
                    work = false;
                    break;
                }
                default: {
                    System.out.println("You did wrong input. Try again");
                }
            }
        }
        sc.close();
    }

}
