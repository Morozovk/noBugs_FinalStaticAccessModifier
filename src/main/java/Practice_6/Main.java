package Practice_6;

public class Main {
    public static void main(String[] args) {
        Person anna = new Person("Анна23", "Петрова", "123-45-6789");
        Person petr = new Person("Петр", "Федоров", "234-76-7890");
        Person Lev = new Person("Лев", "Андреев", "654-23-6738");

        anna.setFirstName("Анна");

        anna.printPersonInfo();
        petr.printPersonInfo();
        Lev.printPersonInfo();
    }
}
