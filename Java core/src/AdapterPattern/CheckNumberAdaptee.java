package AdapterPattern;

public class CheckNumberAdaptee {
    public boolean checkNumber(String data){
        String regex="[0-9]+";
        return data.matches(regex);
    }
}
