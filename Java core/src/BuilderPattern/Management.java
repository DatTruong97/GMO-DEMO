package BuilderPattern;

public class Management {
    public static void main(String[] args){
        Book book=new Book.Builder("Learn java basic","Peter John")

                .buid();
        System.out.println(book.toString());
    }
}
