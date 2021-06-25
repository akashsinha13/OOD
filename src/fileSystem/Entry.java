package fileSystem;

public abstract class Entry {
    protected String name;

    protected Directory root;
    protected long created;
    protected long lastUpdated;
    protected long lastAccessed;

    public Entry(String name, Directory dir) {
        this.name = name;
        this.root = dir;

        this.created = System.currentTimeMillis();
        this.lastUpdated = System.currentTimeMillis();
        this.lastAccessed = System.currentTimeMillis();
    }

    public abstract int size();

    public boolean delete() {
        if (root == null) {
            return false;
        }
        return root.deleteEntry(this);
    }

    public String getFullPath() {
        if (root == null) {
            return "/" + name;
        }
        return root.getFullPath() + "/" + name;
    }

    /* Getters and Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getRoot() {
        return root;
    }

    public void setRoot(Directory root) {
        this.root = root;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public long getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(long lastAccessed) {
        this.lastAccessed = lastAccessed;
    }
}
