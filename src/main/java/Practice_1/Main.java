package Practice_1;

public class Main {
    public static void main(String[] args) {
       Company petr = new Company(1, "Petr Abramov");
       Company anna = new Company(2, "Anna Ivanova");
       Company andrey = new Company(3, "Andrey Petrov");

       Company.companyName = "Apple";

       petr.printCompanyName();
       anna.printCompanyName();
       andrey.printCompanyName();
    }
}
