package ch12_inheritance.books;

// 쉬움
public class EBook extends Book{

    // 필드 변수 선언
    private double fileSize;
    private String format;

    // AllArgsConstructor임
    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크기 : "+getFileSize());
        System.out.println("파일 형식 : "+getFormat());
    }
}
