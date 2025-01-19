package ariefhermawan.pbo.pertemuan.z_6_ketujuh.copas_ppt.membuat_class;

public class StudentRecord {
    private String name;
    private String addresss;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    public String getName() {
        return name;
    }

    public void setName(String temp) {
        name = temp;
    }

    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}

class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord studentRecord1 = new StudentRecord();
        StudentRecord studentRecord2 = new StudentRecord();
        StudentRecord studentRecord3 = new StudentRecord();

        studentRecord1.setName("Anna");
        studentRecord2.setName("Beah");
        studentRecord3.setName("Chris");

        System.out.println(studentRecord1.getName());

        System.out.println("Count = " + StudentRecord.getStudentCount());
    }
}