package ch12_inheritance.books;

// 쉬움
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void showInfo(){
        System.out.println("제목 : " + getTitle());
        System.out.println("저자 : " + getAuthor());
    }
}

