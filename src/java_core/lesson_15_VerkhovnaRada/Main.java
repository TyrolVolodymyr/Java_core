package java_core.lesson_15_VerkhovnaRada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
        boolean menuWork = true;
        String clientChoice;

        while (menuWork) {
            System.out.println();
            System.out.println("через ввід з клавіатури виберіть наступні функції:");
            System.out.println("01 - щоб додати фракцію;");
            System.out.println("02 - щоб видалити фракцію;");
            System.out.println("03 - щоб очистити фракцію;");
            System.out.println("04 - щоб вивести фракції;");
            System.out.println("05 - щоб вивести фракцію;");
            System.out.println("06 - щоб додати депутата в фракцію;");
            System.out.println("07 - щоб видалити депутата з фракції;");
            System.out.println("08 - щоб вивести список хабарників;");
            System.out.println("09 - щоб вивести найбільшого хабарника;");
            System.out.println("10 - Exit");
            System.out.println("Your Choice:");

            clientChoice = scanner.nextLine();

            switch (clientChoice) {
                case "01": {
                    System.out.println();
                    System.out.println("01 - додати фракцію;");
                    System.out.println();
                    verkhovnaRada.addFaction();
                    break;
                }
                case "02": {
                    System.out.println();
                    System.out.println("02 - видалити фракцію;");
                    System.out.println();
                    verkhovnaRada.removeFraction();
                    break;
                }
                case "03": {
                    System.out.println();
                    System.out.println("03 - очистити фракцію;");
                    System.out.println();
                    verkhovnaRada.clearFraction();
                    break;
                }
                case "04": {
                    System.out.println();
                    System.out.println("04 - вивести фракції;");
                    System.out.println();
                    verkhovnaRada.showFactions();
                    break;
                }
                case "05": {
                    System.out.println();
                    System.out.println("05 - вивести фракцію;");
                    System.out.println();
                    verkhovnaRada.showFaction();
                    break;
                }
                case "06": {
                    System.out.println();
                    System.out.println("06 - додати депутата в фракцію;");
                    System.out.println();
                    verkhovnaRada.addDeputyToFraction();
                    break;
                }
                case "07": {
                    System.out.println();
                    System.out.println("07 - видалити депутата з фракції;");
                    System.out.println();
                    verkhovnaRada.removeDeputyInFaction();
                    break;
                }
                case "08": {
                    System.out.println();
                    System.out.println("08 - вивести список хабарників з фракції;");
                    System.out.println();
                    verkhovnaRada.showAllGraftersInFaction();
                    break;
                }
                case "09": {
                    System.out.println();
                    System.out.println("09 - вивести найбільшого хабарника з фракції;");
                    System.out.println();
                    verkhovnaRada.showBiggerGrafterInFaction();
                    break;
                }
                case "10": {
                    System.out.println();
                    System.out.println("Have a Nice Day! Bye");
                    menuWork = false;
                    break;
                }
            }
        }
        scanner.close();
    }
}
