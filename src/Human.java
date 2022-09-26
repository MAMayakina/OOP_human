import java.time.LocalDate;

public class Human {
    String name;
    private String town;
    private int yearOfBirth;
    String job;

    public Human(String name, String town, int age, String job) {
        this.name = name;
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "default";
        } else {
            this.town = town;
        }
        if (age > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = LocalDate.now().getYear();
        }
        if (job == null || job.isEmpty() || job.isBlank()) {
            this.job = "default";
        } else {
            this.job = job;
        }
    }

    public void hello() {
        System.out.print("Привет! Меня зовут " + this.name + ". ");
        if (this.town == "default") {
            System.out.print("Информация о городе не указана. ");
        } else {
            System.out.print("Я из города " + this.town + ". ");
        }
        if (this.yearOfBirth == 0) {
            System.out.print("Информация о годе рождения не указана. ");
        } else {
            System.out.print("Я родился в " + this.yearOfBirth + " году. ");
        }
        if (this.job == "default") {
            System.out.print("Информация о должности не указана. ");
        } else {
            System.out.print("Я работаю на должности " + job + ". ");
        }
        System.out.println("Будем знакомы!");
    }

    public String getTown() {
        return this.town;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.yearOfBirth;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "default";
        } else {
            this.town = town;
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = LocalDate.now().getYear();
        }
    }
}
