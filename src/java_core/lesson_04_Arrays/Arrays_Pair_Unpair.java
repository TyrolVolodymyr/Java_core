package java_core.lesson_04_Arrays;

public class Arrays_Pair_Unpair {
    public static void main(String[] args) {

    //TODO Створити int масив будь-якої довжини з набором будь-яких чисел.
        System.out.println("масив з набором будь-яких чисел:");
        int[] array = new int[]{5,22,8,13,20};

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("");

    //TODO знайти найбільше парне
        int maxPair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0 && array[i] > maxPair)
                maxPair = array[i];
        }
        System.out.println("найбільше парне в масиві з набором будь-яких чисел:");
        System.out.println(maxPair);

     //TODO знайти найбільше непарне число.
        int maxUnpaired = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2>0 && array[i] > maxUnpaired)
                maxUnpaired = array[i];
        }
        System.out.println("найбільше непарне в масиві з набором будь-яких чисел:");
        System.out.println(maxUnpaired);

     //TODO підрахувати суму всіх парних
        int sumPair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0)
                sumPair += array[i];
        }
        System.out.println("сума всіх парних в масиві з набором будь-яких чисел:");
        System.out.println(sumPair);

     //TODO підрахувати суму непарних чисел
        int sumUnpair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2>0)
                sumUnpair += array[i];
        }
        System.out.println("сума всіх непарних в масиві з набором будь-яких чисел:");
        System.out.println(sumUnpair);
    }
}
