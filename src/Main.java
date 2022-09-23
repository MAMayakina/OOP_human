public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Максим", "Минск", 35, "бренд-менеджер");
        Human human2 = new Human("Аня", "Москва", -29, "методист образовательных программ");
        Human human3 = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human human4 = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");
        Human human5 = new Human("Олег", "Москва", 24);
        Human human6 = new Human("Дмитрий", 50,"инженер");
        Human human7 = new Human("Галина", "Санкт-Петербург","учитель физики");

        human1.hello();
        human2.hello();
        human3.hello();
        human4.hello();
        human5.hello();
        human6.hello();
        human7.hello();
    }
}