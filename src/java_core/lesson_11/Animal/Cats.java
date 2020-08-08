package java_core.lesson_11.Animal;

public class Cats extends Animal {
    private String breed;

    public Cats() {
    }

    public Cats(String breed) {
        setBreed(breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
