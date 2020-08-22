package java_core.lesson_13_Airplane;

public class CY_27 extends AirplaneControl implements AirplaneControlInterface {

//    Необхідно реалізувати зв'язок між даними класами таким чином, щоб Су -27 мав можливість працювати з полями і методами інших класів. Тобто наслідування,  композиція,  делегування.
//    Необхідно перевизначити методи інтерфейсу в класі Су -27, щоб метод турбоПрискорення() виводив на екран швидкість літака, яка буде випадково генеруватись і повинна бути  більшою за максимальну швидкість літака Су -27;
//    технологіяСтелс() виводить на екран, що літака не видно протягом випадково згенерованого числа;
//    ядернийУдар() виводить на екран випадкову кількість ядерних боєголовок яку буде скинуто, але не більше 10;
//    описати поля максимальна швидкість, колір, які передати в конструктор з параметрами;

    int speed;
    String color;

    public CY_27(int length, int width, int weight, int speed, String color) {
        super(length, width, weight);
        this.speed = speed;
        this.color = color;
    }

    public void speedPlane (){
        System.out.println("літак летить: " + speed + " кілометрів на год.");
    }

    @Override
    public void turboAcceleration() {
        int turboAcceleration = (int) ((Math.random() * ((speed+500) - speed)) + speed);
        System.out.println("Turbo Acceleration Speed = " + turboAcceleration + " кілометрів на год.");
    }

    @Override
    public void stealthTechnology() {
        int time = (int) ((Math.random() * (60 - 10)) + 10);
        System.out.println("літака не буде видно протягом " + time + " хв.");
    }

    @Override
    public String toString() {
        return "CY_27{" +
                "speed=" + speed +
                ", color='" + color +
                ", Length " + getLength() +
                ", Width "+ getWidth() +
                ", Weight " + getWeight() +
                '}';
    }

    @Override
    public void nuclearStrike() {
        int nuclearNumber = (int) ((Math.random() * (10 - 1)) + 1);
        System.out.println(nuclearNumber + " ядерних боєголовок буде скинуто");


    }




}
