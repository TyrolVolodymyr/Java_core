package java_core.lesson_12_Monster;

public class MainMonster {
    public void callMonster (Monster [] monsters) {
        for (Monster monster : monsters) {
            monster.destroy();
        }
    }

}
