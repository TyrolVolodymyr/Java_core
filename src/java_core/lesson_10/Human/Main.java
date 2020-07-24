package java_core.lesson_10.Human;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Humans you would like create?");
        int maxHuman = scanner.nextInt();

        String[] name = new String[maxHuman];
        int[] type = new int[maxHuman];
        int[] age = new int[maxHuman];

        for (int i = 0; i < maxHuman; i++) {
            System.out.println("put Name for Human id# " + i);
            name[i] = scanner.next();
            System.out.println("put: '1' for Type'Picker' or put '2' for Type'Hunter'");
            type[i] = scanner.nextInt();
            System.out.println("put Age");
            age[i] = scanner.nextInt();
        }

        for (int i = 0; i < maxHuman; i++) {
            Human humanList = new Human(i, name[i], type[i], age[i]);
            System.out.println(humanList);
        }

        String[] pickerMenu = new String[]{"0. potato", "1. carrot", "2. beans"};
        String[] hunterMenu = new String[]{"0. fish", "1. meat", "2. chicken"};

        System.out.println("Choice one person by id:");
        int id = scanner.nextInt();
        Human human = new Human(id, name[id], type[id], age[id]);
        System.out.println("Your Choice:" + human);
        System.out.println("and this person like next foods:");

        if (human.getType().equals("Picker")) {
            for (int i = 0; i < pickerMenu.length; i++) {
                System.out.println(pickerMenu[i]);
            }
            System.out.println("Choice one food by id:");
            id = scanner.nextInt();
            human.setFood(pickerMenu[id]);
            human.getFood();
        }
        if (human.getType().equals("Hunter")) {
            for (int i = 0; i < hunterMenu.length; i++) {
                System.out.println(hunterMenu[i]);
            }
            System.out.println("Choice one food by id:");
            id = scanner.nextInt();
            human.setFood(hunterMenu[id]);
            human.getFood();
        }

    }
}
