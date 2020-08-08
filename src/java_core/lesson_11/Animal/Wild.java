package java_core.lesson_11.Animal;

public class Wild extends Cats{
    private int speed;

    public Wild() {
    }
    public Wild(int speed) {
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wild{" +
                "speed=" + speed +
                '}';
    }
}
