package FacadePattern;

public class StudentDepartment {
    private String department;
    private String major;
    private String classCode;

    public StudentDepartment(String department,String major,String classCode){
        this.department=department;
        this.major=major;
        this.classCode=classCode;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassCode() {
        return classCode;
    }

    @Override
    public String toString() {
        return "Student department info:\n+Department: "+department+"\n+Major: "+major+"\n+Class code: "+classCode;
    }
}
