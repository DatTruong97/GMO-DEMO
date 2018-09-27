package PrototypePattern;

import java.util.List;

public class StudentManagement {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student();
        student.addInit();

        Student student1=(Student)student.clone();
        Student student2=(Student)student.clone();

        List<String>list1=student1.getStudentList();
        list1.add("Quoc Thai");
        List<String>list2=student2.getStudentList();
        list2.remove("Van A");
        list2.add("Cao Sang");

        System.out.println("Init student list: "+student.getStudentList());
        System.out.println("Student list 1: "+student1.getStudentList());
        System.out.println("Student list 2: "+student2.getStudentList());


    }
}
