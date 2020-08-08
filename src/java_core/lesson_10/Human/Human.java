package java_core.lesson_10.Human;

public class Human {

    private String name;
    private String type;
    private int age;
    private int id;
    private String food;

    public Human() {

    }

    public Human(int id, String name, int type, int age) {
        setId(id);
        setName(name);
        setType(type);
        setAge(age);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        int random = (int) (Math.random() * 10);
        this.food = getName() + " have to eat " + random + " Kg. of " + food.substring(food.indexOf(" ") + 1);
        System.out.println(this.food);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(int type) {
        if (type == 1) {
            this.type = "Picker";
        }
        if (type == 2) {
            this.type = "Hunter";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", type='" + type + '\'' +
                        ", age=" + age +
                        '}';
    }

//        (тільки два типи людини: Picker і Hunter) - вивід типу людини,
//        наступний метод: в залежності від типу людини
//        пропонував би деякі види страв, користувач буде вводити що він хоче з*їсти з перерахованих
//        страв(Scanner), якщо є співпадіння то вивести повідомлення :
//        "ім*я людини + з*їсть (рандомне
//        число) кілограм даної страви".
}
