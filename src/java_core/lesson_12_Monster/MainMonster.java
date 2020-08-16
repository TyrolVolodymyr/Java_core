package java_core.lesson_12_Monster;

public class MainMonster {
    public void performance(Monster [] monsters) {
        for (Monster monster : monsters) {
            monster.destroy();
        }
    }

}
