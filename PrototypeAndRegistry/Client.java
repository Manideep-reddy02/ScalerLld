package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        StudenRegistry studenRegistry = new StudenRegistry();
        fillStudentRegistry(studenRegistry);

        Student st = studenRegistry.get("April21Student").clone();
        st.setAge(26);
        st.setPsp(89);
        st.setName("manideep");
        System.out.println("debug");

    }

    public static void fillStudentRegistry(StudenRegistry studenRegistry){

        Student aprstudent = new Student();
        aprstudent.setBatchName("april21");
        aprstudent.setBatchPsp(68.9);
        studenRegistry.register("April21Student",aprstudent);


    }
}
