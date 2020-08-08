package java_core.lesson_11.Animal;

public class Animal {
    private int age;
    private int weight;
    private String sex;
    private String color;

    public Animal() {
    }

    public Animal(int age, int weight, String sex, String color) {
        setAge (age);
        setWeight(weight);
        setSex(sex);
        setColor(color);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
