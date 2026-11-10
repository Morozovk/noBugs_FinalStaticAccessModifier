package Practice_6;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;


    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    String getFirstName(String firstName){
        return firstName;
    }

    void setFirstName(String newFirstName){
        this.firstName= newFirstName;
    }

    String getLastName(String lastName){
        return lastName;
    }

    void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    String getSsn(String ssn){
        return ssn;
    }

    void printPersonInfo(){
        System.out.println("Имя: " + firstName + " Фамилия: " + lastName + " SSN:" + ssn);
    }
}
