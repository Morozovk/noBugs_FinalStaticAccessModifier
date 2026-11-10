package Practice_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    String getBookTitle(){
        return bookTitle;
    }

    void setBookTitle(String newBookTitle){
        this.bookTitle = newBookTitle;
    }

    String getAuthor(){
        return author;
    }

    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    int getYear(){
        return year;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    String getCategory(){
        return category;
    }

    void setCategory(String newCategory){
        this.category = newCategory;
    }
}
