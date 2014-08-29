package hello;

/**
 * This is the sample greeting class that is used to send response in JSON
 * @author kenny edmond
 *
 */
public class Greeting {

    private final long id;
    private final String content;

    /**
     * This method is the constructor thats sets the classes properties
     * @param id
     * @param content
     */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * This is a get method
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * This is a get method
     * @return content
     */
    public String getContent() {
        return content;
    }

}
