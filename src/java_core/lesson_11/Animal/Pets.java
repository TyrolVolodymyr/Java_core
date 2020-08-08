package java_core.lesson_11.Animal;

public class Pets extends Cats{
    private String name;

    public Pets() {

    }
    public Pets(String name) {
        setName (name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                '}';
    }
}
