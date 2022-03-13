package upper.lesson05.entity.trait;

public class DeletableRecord {
    
    private boolean isDeleted = false;

    public void delete() {
        this.isDeleted = true;
    }

    public void restore() {
        this.isDeleted = false;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }
}
