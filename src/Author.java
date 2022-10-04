import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;

    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String toString() {
        return this.authorName + " " + this.authorSurname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author that = (Author) obj;
        return this.authorName.equals(that.authorName) && this.authorSurname.equals(that.authorSurname);

    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }

}
