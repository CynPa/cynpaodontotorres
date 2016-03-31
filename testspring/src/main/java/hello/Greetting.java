package hello;

public class Greetting {

    private final long id;
    private final String content;

    public Greetting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}