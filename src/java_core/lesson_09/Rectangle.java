package java_core.lesson_09;

public class Rectangle {
    int width = 0;
    int length = 0;

    public Rectangle() {

    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public void areaOfRectangle() {
        int area = width *length;
        System.out.println("Площа прямокутника = "+ area);
    }

    public void perimeterOfRectangle() {
        int perimeter = 2*(width+length);
        System.out.println("Периметр прямокутника = " + perimeter);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
