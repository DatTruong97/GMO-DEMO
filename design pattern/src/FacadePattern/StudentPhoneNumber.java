package FacadePattern;

public class StudentPhoneNumber {
    private String phoneNumber;

    public StudentPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Student phone info:\n+Phone number: "+phoneNumber;
    }
}
