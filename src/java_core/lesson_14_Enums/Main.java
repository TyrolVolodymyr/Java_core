package java_core.lesson_14_Enums;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Month[] month = Month.values();
        Season[] seasons = Season.values();
        String monthClient = "";
        boolean work = true;
        boolean menuWork = true;
        String clientChoice;

        while (work) {
            // System.out.println("01 - перевірити чи є такий місяць");
            System.out.println("Enter month name:");
            monthClient = scanner.nextLine();
            for (int i = 0; i < Month.values().length; i++) {
                if (month[i].name().equalsIgnoreCase(monthClient)) {
                    //System.out.println(month[i].toString());
                    monthClient = month[i].name();
                    work = false;
                }
            }
            if (work) {
                System.out.println("Sorry, I can't find what you looking for. Please, try again!");
                System.out.println();
            }
        }

        while (menuWork) {
            System.out.println();
            System.out.println("через ввід з клавіатури виберіть наступні функції:");
            System.out.println("01 - перевірити чи є такий місяць");
            System.out.println("02 - вивести всі місяці з такою ж порою року;");
            System.out.println("03 - вивести всі місяці які мають таку саму кількість днів;");
            System.out.println("04 - вивести всі місяці які мають більшу кількість днів;");
            System.out.println("05 - вивести на екран наступну пору року;");
            System.out.println("06 - вивести на екран попередню пору року;");
            System.out.println("07 - вивести на екран всі місяці які мають парну кількість днів;");
            System.out.println("08 - вивести на екран всі місяці які мають непарну кількість днів;");
            System.out.println("09 - Exit");
            System.out.println("Your Choice:");

            clientChoice = scanner.nextLine();

            switch (clientChoice) {
                case "01": {
                    System.out.println();
                    System.out.println("01 - перевірити чи є такий місяць");
                    System.out.println();
                    System.out.println(Month.valueOf(monthClient).toString());
                    break;
                }
                case "02": {
                    System.out.println();
                    System.out.println("02 - вивести всі місяці з такою ж порою року;");
                    System.out.println();
                    for (int i = 0; i < Month.values().length; i++) {
                        if (month[i].getSeason().equals(Month.valueOf(monthClient.toUpperCase()).getSeason())) {
                            System.out.println(month[i].toString());
                        }
                    }
                    break;
                }
                case "03": {
                    System.out.println();
                    System.out.println("03 - вивести всі місяці які мають таку саму кількість днів;");
                    System.out.println();
                    for (int i = 0; i < Month.values().length; i++) {
                        if (month[i].getDays() == (Month.valueOf(monthClient.toUpperCase()).getDays())) {
                            System.out.println(month[i].toString());
                        }
                    }
                    break;
                }
                case "04": {
                    System.out.println();
                    System.out.println("04 - вивести всі місяці які мають більшу кількість днів;");
                    System.out.println();
                    for (int i = 0; i < Month.values().length; i++) {
                        if (month[i].getDays() > (Month.valueOf(monthClient.toUpperCase()).getDays())) {
                            System.out.println(month[i].toString());
                        }
                    }
                    break;
                }
                case "05": {
                    System.out.println();
                    System.out.println("05 - вивести на екран наступну пору року;");
                    System.out.println();
                    for (int i = 0; i < seasons.length; i++) {
                        if (seasons[i].equals(Month.valueOf(monthClient.toUpperCase()).getSeason())) {
                            System.out.println("This season is : = " + Month.valueOf(monthClient.toUpperCase()).getSeason());
                            if (i == 3) {
                                System.out.println("Next season is : " + seasons[0]);
                            } else {
                                System.out.println("Next season is : " + seasons[i + 1]);
                            }
                        }
                    }
                    break;
                }
                case "06": {
                    System.out.println();
                    System.out.println("06 - вивести на екран попередню пору року;");
                    System.out.println();
                    for (int i = 0; i < seasons.length; i++) {
                        if (seasons[i].equals(Month.valueOf(monthClient.toUpperCase()).getSeason())) {
                            System.out.println("This season is : = " + Month.valueOf(monthClient.toUpperCase()).getSeason());
                            if (i == 0) {
                                System.out.println("Next season is : " + seasons[3]);
                            } else {
                                System.out.println("Previous season is : " + seasons[i - 1]);
                            }
                        }
                    }
                    break;
                }
                case "07": {
                    System.out.println();
                    System.out.println("07 - вивести на екран всі місяці які мають парну кількість днів;");
                    System.out.println();
                    for (int i = 0; i < month.length; i++) {
                        if (month[i].getDays() % 2 == 0) {
                            System.out.println(month[i].toString());
                        }
                    }
                    break;
                }
                case "08": {
                    System.out.println();
                    System.out.println("08 - вивести на екран всі місяці які мають непарну кількість днів;");
                    System.out.println();
                    for (int i = 0; i < month.length; i++) {
                        if (month[i].getDays() % 2 != 0) {
                            System.out.println(month[i].toString());
                        }
                    }
                    break;
                }
                case "09": {
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
