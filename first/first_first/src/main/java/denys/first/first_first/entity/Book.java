package denys.first.first_first.entity;

import java.util.List;

public class Book implements Persistent{
    private Long            id;
    private String          title;
    private List<Persistent>    authors;

    public Book() {
    }

    public Book(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Persistent> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Persistent> authors) {
        this.authors = authors;
    }
}
