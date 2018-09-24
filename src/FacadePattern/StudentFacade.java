package FacadePattern;

import java.util.Scanner;

public class StudentFacade {
    StudentName studentName;
    StudentDepartment studentDepartment;
    StudentPhoneNumber studentPhoneNumber;

    public StudentFacade(){};

    public StudentFacade(StudentName studentName,StudentDepartment studentDepartment,StudentPhoneNumber studentPhoneNumber){
        this.studentName=studentName;
        this.studentDepartment=studentDepartment;
        this.studentPhoneNumber=studentPhoneNumber;
    }

    public void setStudentName(StudentName studentName) {
        this.studentName = studentName;
    }

    public StudentName getStudentName() {
        return studentName;
    }

    public void setStudentDepartment(StudentDepartment studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public StudentDepartment getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentPhoneNumber(StudentPhoneNumber studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public StudentPhoneNumber getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void display(){
        System.out.println(studentName.toString());
        System.out.println(studentDepartment.toString());
        System.out.println(studentPhoneNumber.toString());
        System.out.println("--------------------------------");
    }

    public void setInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Type first name: ");
        String firstName=scanner.nextLine();
        System.out.print("Type middle name: ");
        String middleName=scanner.nextLine();
        System.out.print("Type last name: ");
        String lastName=scanner.nextLine();
        System.out.print("Type department: ");
        String department=scanner.nextLine();
        System.out.print("Type major: ");
        String major=scanner.nextLine();
        System.out.print("Type class code: ");
        String classCode=scanner.nextLine();
        System.out.print("Type phone number: ");
        String phoneNumber=scanner.nextLine();
        scanner.close();

        this.studentName=new StudentName(firstName,middleName,lastName);
        this.studentDepartment=new StudentDepartment(department,major,classCode);
        this.studentPhoneNumber=new StudentPhoneNumber(phoneNumber);


    }
}
