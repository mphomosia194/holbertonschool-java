import java.util.*;

public class Program {
    public static void main(String[] args) {
        Blog blog1 = new Blog();

        Author author1 = new Author("John", "Bannons");
        Author author2 = new Author("Jane", "Doe");
        Author author3 = new Author("Peter", "Dirkly");

        Post post1 = new Post(author1, 
            "How to Implement Terraform",
            "Implementing IaC with Terraform bla bla bla",
            Categories.DEVOPS);

        Post post2 = new Post(author1, 
            "Working with the Set Interface in Java",
            "The Set interface is implemented...",
            Categories.DEVELOPMENT);            

        Post post3 = new Post(author2, 
            "Publishing GitLab Pipelines",
            "To publish pipelines...",
            Categories.DEVOPS);            

        Post post4 = new Post(author2, 
            "Azure Service Bus Where to Start",
            "First, it's necessary...",
            Categories.DEVOPS);

        Post post5 = new Post(author2, 
            "TDD Made Simple",
            "The TDD process...",
            Categories.DEVELOPMENT);       

        Post post6 = new Post(author3,
            "Hadoop: The Tool That Will Ease Your Data Processing",
            "Hadoop is a tool...",
            Categories.DATA_SCIENCE);

        Post post7 = new Post(author3,
            "Hadoop: The Tool That Will Ease Your Data Processing",
            "Duplicate test",
            Categories.DATA_SCIENCE);

        blog1.addPost(post1);
        blog1.addPost(post2);
        blog1.addPost(post3);
        blog1.addPost(post4);
        blog1.addPost(post5);
        blog1.addPost(post6);

        try {
            blog1.addPost(post7);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(blog1.getAllAuthors());
        System.out.println(blog1.getCountByCategory());
        System.out.println(blog1.getPostsByCategory(Categories.DEVOPS));
        System.out.println(blog1.getPostsByCategory(Categories.DEVELOPMENT));
        System.out.println(blog1.getPostsByCategory(Categories.DATA_SCIENCE));
        System.out.println(blog1.getPostsByAuthor(new Author("Jane", "Doe")));
        System.out.println(blog1.getAllPostsByCategories());
        System.out.println(blog1.getAllPostsByAuthor());
    }
}
