package entity;

public class Student {
    private int StuNo;
    private String StuName;
    private int StuAge;

    public Student() {
    }

    public Student(int stuNo, String stuName, int stuAge) {
        StuNo = stuNo;
        StuName = stuName;
        StuAge = stuAge;
    }

    public int getStuNo() {
        return StuNo;
    }

    public void setStuNo(int stuNo) {
        StuNo = stuNo;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public int getStuAge() {
        return StuAge;
    }

    public void setStuAge(int stuAge) {
        StuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StuNo=" + StuNo +
                ", StuName='" + StuName + '\'' +
                ", StuAge=" + StuAge +
                '}';
    }

}
