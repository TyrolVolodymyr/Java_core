package java_core.lesson_13_Airplane;

public class Main {
    public static void main(String[] args) {

//        створити об’єкт класу Су -27 тепер імітуємо політ літака:
//        запускаємо двигун літака;
//        проводимо виліт літака;
//        рухаємось вверх, вниз, вправо, вліво;
//        вмикаємо технологію стелс;
//        проводимо ядерний удар;
//        вмикаємо турбо прискорення і тікаємо;
//        проводимо посадку;

        CY_27 cy_27 = new CY_27(100,85,50,400,"White");
        System.out.println(cy_27);
        cy_27.startEngines();
        cy_27.takeoffPlane();
        cy_27.movementUp();
        cy_27.movementDown();
        cy_27.movementForward();
        cy_27.stealthTechnology();
        cy_27.nuclearStrike();
        cy_27.speedPlane();
        cy_27.turboAcceleration();
        cy_27.landingPlane();


    }
}
