package Practice_1;

public class Company {
    private static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID,String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName(){
        System.out.println(" Компания: " + companyName);
    }

    String getEmployeeName(){
        return employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    static void setCompanyName(String newCompanyName){
        Company.companyName = newCompanyName;
    }
}
