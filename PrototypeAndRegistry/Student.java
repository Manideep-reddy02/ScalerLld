package PrototypeAndRegistry;

public class Student implements Protypes<Student> {
    private String name;
    private int psp;
    private int age;

    private String batchName;
    private double batchPsp;

    public void setName(String name) {
        this.name = name;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setBatchPsp(double batchPsp) {
        this.batchPsp = batchPsp;
    }
    Student(){

    }
    Student(Student other){
        this.name = other.name;
        this.psp = other.psp;
        this.age= other.age;
        this.batchName = other.batchName;
        this.batchPsp = other.batchPsp;

    }


    @Override
    public Student clone() {
        Student st = new Student(this);
        return st;
    }
}
