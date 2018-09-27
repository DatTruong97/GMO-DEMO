package DecoratorPattern;

public class PhoneManagement {
    public static void main(String[] args){
        Phone fingerprintSensorPhone=new FingerprintSensor(new AndroidPhone());
        fingerprintSensorPhone.assemble();
        System.out.println("------------------------------");
        Phone faceSensorPhone=new FaceSensor(new AndroidPhone());
        faceSensorPhone.assemble();
        System.out.println("------------------------------");
        Phone faceAndFingerprintSensorPhone=new FaceSensor(new FingerprintSensor(new AndroidPhone()));
        faceAndFingerprintSensorPhone.assemble();
    }
}
