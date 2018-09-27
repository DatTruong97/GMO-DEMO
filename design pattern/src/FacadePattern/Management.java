package FacadePattern;

public class Management {
    public static void main(String[] args){
        StudentFacade studentFacade=new StudentFacade();
        studentFacade.setInfo();
        studentFacade.display();
    }
}
