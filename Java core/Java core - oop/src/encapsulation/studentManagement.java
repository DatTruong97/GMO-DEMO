package encapsulation;

public class studentManagement {
    public static void main(String[] args){
        Student student=new Student();
        student.setName("Nguyen Van A");
        student.setStudentID("15200012");
        student.setAge(20);
        System.out.println("Name: "+student.getName()+", student id: "+student.getStudentID()+", student age: "+student.getAge());
    }
}
