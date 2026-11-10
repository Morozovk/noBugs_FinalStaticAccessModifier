package Practice_1;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID,String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    void printCompanyName(){
        System.out.println(getEmployeeName() + " Компания: " + companyName);
    }

    String getEmployeeName(){
        return employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }
}
