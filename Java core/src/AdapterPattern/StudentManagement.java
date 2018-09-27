package AdapterPattern;

public class StudentManagement {
    public static void main(String[] args){
        Adapter adapter=new Adapter();

        String studentId1="1520179";
        String studentId2="1002052";
        String studentId3="1520@11";

        System.out.println("Whether student id1 is in the right format: "+adapter.checkStudentIdNumber(studentId1));
        System.out.println("Whether student id2 is in the right format: "+adapter.checkStudentIdNumber(studentId2));
        System.out.println("Whether student id3 is in the right format: "+adapter.checkStudentIdNumber(studentId3));
    }
}
