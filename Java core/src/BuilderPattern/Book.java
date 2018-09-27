package BuilderPattern;

public class Book {
    public enum Genre{Horror,Fiction,Adult,Romantic,Mystery,Parody};

    private String title;
    private String author;
    private Genre genre;
    private int rating;

    public static class Builder{
        //Required parameter
        private String title;
        private String author;

        //Optional parameter
        private Genre genre=Genre.Horror;
        private int rating=5;

        public Builder(String title,String author){
            this.title=title;
            this.author=author;
        }

        public Builder genre(Genre genre){
            this.genre=genre;
            return this;
        }

        public Builder rating(int rating){
            this.rating=rating;
            return this;
        }

        public Book buid(){
            return new Book(this);
        }

    }
    public Book(Builder builder){
        title=builder.title;
        author=builder.author;
        genre=builder.genre;
        rating=builder.rating;
    }

    @Override
    public String toString() {
        return "Book info\n+Title: "+title+"\n+Author: "+author+"\n+Genre: "+genre+"\n+Rating: "+rating;
    }
}
