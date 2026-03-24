import java.util.Objects;

public class Post implements Comparable<Post> {
    private Author author;
    private String title;
    private String body;
    private Categories category;

    public Post(Author author, String title, String body, Categories category) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Categories getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Post other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post)) return false;
        Post post = (Post) o;
        return author.equals(post.author) && title.equals(post.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}
