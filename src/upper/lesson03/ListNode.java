package upper.lesson03;

public abstract class ListNode<T> {

    boolean isHead;

    private ListNode pointer;

    public void setHead(boolean flag) {
        this.isHead = flag;
    }

    public boolean isTail() {
        // TODO
        return false;
    }

    public void setPointerTo(ListNode node) {
        this.pointer = node;
    }

    abstract public T getValue();
}
