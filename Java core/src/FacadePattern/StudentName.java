package FacadePattern;

public class StudentName {
    private String firstName;
    private String lastName;
    private String middleName;

    public StudentName(String firstName,String middleName,String lastName){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student name info:\n+First name: "+firstName+"\n+Middle name: "+middleName+"\n+Last name: "+lastName;
    }
}
