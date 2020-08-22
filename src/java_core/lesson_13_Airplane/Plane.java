package java_core.lesson_13_Airplane;

public abstract class Plane {
//    Створити Абстрактний клас Літак який матиме такі методи:
//    startEngines(), який буде виводити на екран скільки часу залишилось до готовності вилетіти, де час генерується випадково в межах від [20,88];
//    takeoffPlane(), який скільки пролетить літак кілометрів на повному баку палива. Генеруємо випадкове число від 0 до 1000;
//    landingPlane(), який виводить на екран що літак іде на посадку;
public void startEngines (){
    int startEnginTime = (int) ((Math.random() * (88 - 20)) + 20);
    System.out.println(startEnginTime + " хв. залишилось до готовності вилетіти");
}
public void takeoffPlane (){
    int takeoffPlaneDistance = (int) ((Math.random() * (1000 - 0)) + 0);
    System.out.println("літак пролетить: " + takeoffPlaneDistance + " кілометрів на повному баку палива.");
}
public void landingPlane (){
    System.out.println("літак іде на посадку");
}

}
