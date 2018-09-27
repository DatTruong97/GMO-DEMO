package ObserverPattern;

public class MailManagement {
    public static void main(String[] args){
        MailBox mailBox=new MailBox("District 1");
        MailBox mailBox1=new MailBox("District 2");
        MailBox mailBox2=new MailBox("District 3");
        PostOffice postOffice=new PostOffice();
        postOffice.addObserver(mailBox);
        postOffice.addObserver(mailBox1);
        postOffice.addObserver(mailBox2);
        postOffice.removeObserver(mailBox1);
        postOffice.notifyObservers();
    }

}
