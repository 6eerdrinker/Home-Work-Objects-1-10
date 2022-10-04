import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publicationYear;

    public Book (String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Название книги - " + this.bookName + ", Автор книги - " + this.author +
                ", Первое книжное издание - " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPublicationYear() == book.getPublicationYear() && Objects.equals(getBookName(),
                book.getBookName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthor(), getPublicationYear());
    }

}
