package Practice_4;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

   public University (int studentID, String studentName){
       this.studentID = studentID;
       this.studentName = studentName;
   }

    static void changeUniversityName(String newName){
       University.universityName = newName;
    }

    String getStudentName(String studentName){
       return studentName;
    }

    void printStudentInfo(){
        System.out.println("Имя: " + studentName + " , ID_" + studentID + " , название университета: " + universityName);
    }
}
