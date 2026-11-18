package Practice_4;

import static Practice_4.University.changeUniversityName;
import static Practice_4.University.setUniversityName;

public class Main {
    public static void main(String[] args) {
        University stud1 = new University(1, "Petr");
        University stud2 = new University(2, "Anna");
        University stud3 = new University(3, "Fedor");

        setUniversityName("test");
        changeUniversityName("Harvard");

        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();
    }
}
