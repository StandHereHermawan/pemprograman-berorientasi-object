package ariefhermawan.pbo.pertemuan.z_6_ketujuh.copas_ppt.method_overloading;

public class StudentRecord2 {
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
        studentCount++;
    }

    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        average = result;
        return result;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public static void setStudentCount(int studentCount) {
        StudentRecord2.studentCount = studentCount;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void print() {
        System.out.println("\n");
        System.out.println("Name\t:" + name);
        System.out.println("Address\t: " + addresss);
        System.out.println("Age\t: " + age);
        System.out.println("Math Grade\t: " + mathGrade);
        System.out.println("Science Grade\t: " + scienceGrade);
        System.out.println("English Grade\t: " + englishGrade);
        System.out.println("Average\t: " + average);
    }
}

class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord2 studentRecord1 = new StudentRecord2();
        StudentRecord2 studentRecord2 = new StudentRecord2();
        StudentRecord2 studentRecord3 = new StudentRecord2();

        studentRecord1.setName("Anna");
        studentRecord1.setAge(15);
        studentRecord1.setEnglishGrade(81.0);
        studentRecord1.setScienceGrade(82.0);
        studentRecord1.setMathGrade(79.0);

        studentRecord2.setName("Beah");
        studentRecord2.setAge(15);
        studentRecord2.setEnglishGrade(81.0);
        studentRecord2.setScienceGrade(82.0);
        studentRecord2.setMathGrade(79.0);

        studentRecord3.setName("Chris");
        studentRecord3.setAge(15);
        studentRecord3.setEnglishGrade(81.0);
        studentRecord3.setScienceGrade(82.0);
        studentRecord3.setMathGrade(79.0);

        studentRecord1.print();
        studentRecord2.print();
        studentRecord3.print();

        System.out.println(studentRecord1.getName());

        System.out.println("Count = " + StudentRecord2.getStudentCount());
    }
}