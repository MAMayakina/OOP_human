public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Максим", "Минск", 35, "бренд-менеджер");
        Human human2 = new Human("Аня", "Москва", -29, "методист образовательных программ");
        Human human3 = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human human4 = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");
        Human human5 = new Human("Владимир", "Казань", 21, null);


        human1.hello();
        human2.hello();
        human3.hello();
        human4.hello();
        human5.hello();

        //Проверка
        System.out.println(human5.name + ", " + human5.getAge() + ", " + human5.getTown());
        human5.setAge(-2);
        human5.setTown("   ");
        System.out.println(human5.name + ", " + human5.getAge() + ", " + human5.getTown());

    }
}