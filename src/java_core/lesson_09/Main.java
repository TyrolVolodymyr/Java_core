package java_core.lesson_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our area & perimeter of Rectangle Calculator");
        System.out.println("Add your width :");
        int width = sc.nextInt();
        System.out.println("Add your length :");
        int length = sc.nextInt();
        Rectangle customRectangle = new Rectangle(width,length);
        System.out.println("width = "+customRectangle.width);
        System.out.println("length = "+ customRectangle.length);
        customRectangle.areaOfRectangle();
        customRectangle.perimeterOfRectangle();
    }
}
