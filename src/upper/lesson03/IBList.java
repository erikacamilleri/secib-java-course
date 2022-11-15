package upper.lesson03;

/**
 * Defining an Abstract Data Structure
 */
public interface IBList<T> {
    
    // it returns whether the list has nodes
    public boolean isEmpty();

    // if the number of nodes is equal to the maximum size
    public boolean isFull(int maxSize);

    // gets the number of nodes in the list
    public int size();

    // adds the node to the end
    public void add(T item);

    // find the node, delete it, and rearrage the pointers
    public void remove(T item);

    // insert the node in the correct position
    public void insert(T item);

    // display the value of all nodes
    public void list();
}
