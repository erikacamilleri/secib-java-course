package upper.lesson02;

public class Node {
    
    boolean isVisited;

    boolean isRoot;

    String value;

    Node parent;

    Node left;

    Node right;

    public Node(String value, boolean isRoot) {
        this.value = value;
        this.isRoot = isRoot;
        this.isVisited = false;
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

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
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

    /**
     * Tree Node Traversals
     */
    public void printInorder()
    {
        if (this.isVisited) {
            return;
        }

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.printInorder();
        }
        
        /* Print */
        this.isVisited = true;
        System.out.print(this.visit() + ", ");
 
        /* Recur on the right */
        if (this.right != null) {
            this.right.printInorder();
        }
    }

    public void printPreOrder() {

        if (this.isVisited) {
            return;
        }

        /* First print the value of the node */
        this.isVisited = true;
        System.out.print(this.visit() + ", ");

        /* Recur on the left */
        if(this.left != null) {
            this.left.printPreOrder();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.printPreOrder();
        }
    }

    /**
     * Visit/print values nodes in post order
     */
    public void printPostOrder() {

        // If the node is already visited then return
        if (this.isVisited) {
            return;
        }

        /* Recur on the left */
        if(this.left != null) {
            this.left.printPostOrder();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.printPostOrder();
        }

        /* Visit and print node value */
        this.isVisited = true;
        System.out.print(this.visit() + ", ");         
    }

    /**
     * Unvisit nodes in post order
     */
    public void reset() {
        if (!this.isVisited) {
            return;
        }

        /* Recur on the left */
        if(this.left != null) {
            this.left.reset();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.reset();
        }

        /* Reset node */
        this.isVisited = false;  
    }
}
