package java_core.lesson_08_Test;

public class Main {
    public static void main(String[] args) {
/*
          1) Чи можна при оголошенні класу використовувати модифікатор abstract i fіnal одночасно?
                - ні;        */
/*        2)Що буде виведено на консоль:
        int i =0;
        i++;
        System.out.print(i);
        i = i++;
        System.out.print(i);    */
//        - 11;

/*        3) Що буде виведено на консоль:

        public class Main {

            {
                System.out.print("1");
            }
            Main(){
                System.out.print("2");
            }
            public static void main(String[] args) {
                System.out.print("3");
                Main m =new Main();
                System.out.print("4");
            }
            static{
                System.out.print("5");
            }

        }*/
 //       - 53124;
/*      4) Що буде виведено на консоль:
    public class Autoboxing {

	public static void main(String[] args) {
		Integer oInt1 = null;
		Integer oInt2 = 0;
		final int int1 = oInt1;
		final int int2 = oInt2;
		System.out.println(int1 == int2);
	}
}*/
        // - Помилка компіляції;

/*  5) Що буде виведено на консоль:
	public class Test {

	static{
		i =5;
	}
	static int i = 6;
	public static void main(String[] args) {
		 System.out.println(i);

	}

}*/
//  - 6;
/*6)Що буде виведено на консоль:
	public class Test {

	public static void main(String[] args) {

		byte b = 12;
		byte k = b + 1;
		System.out.println(k);
	}
}*/
        //Код не скомпілюється;
/*7)Що буде виведено на консоль:
	public class Test {

	public static void main(String[] args) {
		System.out.println(0.1d);
	}
}
*/
        // - 0.1;

    }

}
