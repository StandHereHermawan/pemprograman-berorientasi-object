package ariefhermawan.pbo.pertemuan.z_6_ketujuh.copas_ppt.overloading_constructor;

public class StudentData {
    private int idStudent;
    private String studentName;
    private int studentAge;

    StudentData() {
        idStudent = 100;
        studentName = "new Student";
        studentAge = 18;
    }

    StudentData(int numl, String str, int num2) {
        idStudent = 100;
        studentName = "new Student";
        studentAge = 18;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void print() {
        System.out.println("ID Student\t: " + idStudent);
        System.out.println("Student Name\t: " + studentName);
        System.out.println("Student Age\t: " + studentAge);
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}

class MainMethod {
    public static void main(String[] args) {
        StudentData studentData1 = new StudentData();
        studentData1.print();

        StudentData studentData2 = new StudentData(123, "Agus", 18);
        studentData2.print();
    }
}