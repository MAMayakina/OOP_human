public class Human {
    String name;
    String town;
    int yearOfBirth;
    String job;


    public Human(String name, String town, int age, String job) {
        this.name = name;
        this.town = town;
        if (age > 0) {
            this.yearOfBirth = 2022 - age;
        } else {
            this.yearOfBirth = 2022 + age;
        }
        this.job = job;
    }
    public Human(String name, int age, String job) {
        this.name = name;
        this.town = null;
        if (age > 0) {
            this.yearOfBirth = 2022 - age;
        } else {
            this.yearOfBirth = 2022 + age;
        }
        this.job = job;
    }
    public Human(String name, String town, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = 0;
        this.job = job;
    }
    public Human(String name, String town, int age) {
        this.name = name;
        this.town = town;
        if (age > 0) {
            this.yearOfBirth = 2022 - age;
        } else {
            this.yearOfBirth = 2022 + age;
        }
        this.job = null;
    }

    public void hello() {
        System.out.print("Привет! Меня зовут " + this.name + ". ");
        if (this.town == null) {
            System.out.print("Информация о городе не указана. ");
        } else {
            System.out.print("Я из города " + this.town + ". ");
        }
        if (this.yearOfBirth == 0) {
            System.out.print("Информация о годе рождения не указана. ");
        } else {
            System.out.print("Я родился в " + this.yearOfBirth + " году. ");
        }
        if (this.job == null) {
            System.out.print("Информация о должности не указана. ");
        } else {
            System.out.print("Я работаю на должности " + job + ". ");
        }
        System.out.println("Будем знакомы!");
    }
}
