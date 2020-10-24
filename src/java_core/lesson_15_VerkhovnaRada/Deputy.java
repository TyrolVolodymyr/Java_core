package java_core.lesson_15_VerkhovnaRada;

import java.util.Scanner;

public class Deputy extends Human{

    private String firstName;
    private String lastName;
    private  int age;
    private boolean grafter;
    private int bribeAmount;

    public Deputy() {
    }

    public Deputy(int weight, int height, String firstName, String lastName, int age, boolean grafter) {
        super(weight, height);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grafter = grafter;
    }

    public void giveBribe(){
        if (grafter==false){
            System.out.println("Цей депутат не бере хабарів");
        }else {
            System.out.println("Enter amount of bribe:");
            Scanner scanner = new Scanner(System.in);
            int bribe = scanner.nextInt();
            if (bribe>=5000){
                System.out.println("Поліція увязнить депутата");
            }else
                this.bribeAmount = bribe;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGrafter() {
        return grafter;
    }

    public void setGrafter(boolean grafter) {
        this.grafter = grafter;
    }

    public int getBribeAmount() {
        return bribeAmount;
    }

    public void setBribeAmount(int bribeAmount) {
        this.bribeAmount = bribeAmount;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grafter=" + grafter +
                ", bribeAmount=" + bribeAmount +
                '}';
    }
}
