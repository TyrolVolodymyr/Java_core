package java_core.lesson_11.Animal;

public class Jaguar extends Wild{
    private int lifespan;

    public Jaguar() {
    }

    public Jaguar(int lifespan) {
        setLifespan(lifespan);
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    @Override
    public String toString() {
        return "Jaguar{" +
                "lifespan=" + lifespan +
                '}';
    }
}
