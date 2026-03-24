import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    // Add a post
    public void addPost(Post post) {
        posts.add(post);
    }

    // Get all authors sorted
    public Set<String> getAllAuthors() {
        Set<String> authors = new TreeSet<>();
        for (Post post : posts) {
            authors.add(post.getAuthor());
        }
        return authors;
    }

    // Count posts by category sorted
    public Map<String, Integer> getCountByCategory() {
        Map<String, Integer> categoryCount = new TreeMap<>();

        for (Post post : posts) {
            String category = post.getCategory();
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
        }

        return categoryCount;
    }
}
