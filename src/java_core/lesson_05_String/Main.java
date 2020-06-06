package java_core.lesson_05_String;

public class Main {
    public static void main(String[] args) {
        String text = "       I l__^^^^^e_ar)n j=====a-V*a";
        text = text.trim();

        String[] action = {"_","^",")","=","-","*" };
        for (int i = 0; i <action.length ; i++) {
            text = text.replace(action[i],"");
        }
        System.out.println(text.toUpperCase()+" !");
    }
}
