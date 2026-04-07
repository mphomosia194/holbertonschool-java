package entities;

import javax.persistence.*;

@Entity
public class CourseMaterial {

    @Id
    @GeneratedValue
    private Long id;

    private String url;

    @OneToOne(mappedBy = "material")
    private Course course;

    public Long getId() { return id; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}
