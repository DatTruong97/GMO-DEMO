package AdapterPattern;

public class Adapter implements StudentIdTarget{
    CheckNumberAdaptee checkNumberAdaptee=new CheckNumberAdaptee();
    @Override
    public boolean checkStudentIdNumber(String id) {
        if(!checkNumberAdaptee.checkNumber(id)){
            return false;
        }
        if(id.length()!=7){
            return false;
        }
        return true;
    }
}
