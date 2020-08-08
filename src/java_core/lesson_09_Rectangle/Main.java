package java_core.lesson_09_Rectangle;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Welcome to our area & perimeter of Rectangle Calculator");
//        System.out.println("Add your width :");
//        int width = sc.nextInt();
//        System.out.println("Add your length :");
//        int length = sc.nextInt();

        Rectangle customRectangle = new Rectangle(5,5);
        customRectangle.areaOfRectangle();
        customRectangle.perimeterOfRectangle();
    }
}
