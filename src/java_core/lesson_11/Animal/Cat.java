package java_core.lesson_11.Animal;

public class Cat extends Pets{
    private String voice;

    public Cat() {
    }

    public Cat(String voice) {
        setVoice (voice);
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "voice='" + voice + '\'' +
                '}';
    }
}
