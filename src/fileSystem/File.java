package fileSystem;

public class File extends Entry {
    protected String content;
    protected int size;

    public File(String name, Directory dir, int size) {
        super(name, dir);
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    /* Getter and Setter*/
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
