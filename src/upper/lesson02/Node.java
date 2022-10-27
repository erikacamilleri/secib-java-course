package upper.lesson02;

public class Node {
    
    boolean isRoot;

    String value;

    Node parent;

    Node left;

    Node right;

    public Node(String value, boolean isRoot) {
        this.value = value;
        this.isRoot = isRoot;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public void setParent(Node node, boolean isLeft) {
        this.parent = node;
        if (isLeft) {
            node.setLeft(this);
        } else {
            node.setRight(this);
        }
    }

    public Node getParent(Node node) {
        return this.parent;
    }

    public String visit() {
        return this.value;
    }

    public Node getLeftChild() {
        return this.left;
    }

    public Node getRightChild() {
        return this.right;
    }
}
