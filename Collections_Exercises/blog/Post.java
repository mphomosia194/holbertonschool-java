public class Post {
    private String author;
    private String title;
    private String body;
    private String category;

    public Post(String author, String title, String body, String category) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }
}
