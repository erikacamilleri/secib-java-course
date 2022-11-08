package upper.lesson02;

public class DemoBinaryTree {
    public static void main(String[] args) {
        /**
         * We are creating a Binary Tree of the Year 13s (2023)
         * Each member of the class is a node...
         */
        Node finn = new Node("Finn", true);
        Node erika = new Node("Erika", false);
        Node mike = new Node("Mike", false);
        Node anirudh = new Node("Anirudh", false);
        Node daniil = new Node("Daniil", false);
        Node bill = new Node("Bill", false);

        // Next, we configure parents and children so that
        // nodes collectively become a tree
        daniil.setParent(finn, true);
        mike.setParent(finn, false);
        erika.setParent(daniil, false);
        bill.setParent(daniil, true);
        anirudh.setParent(bill, true);

        // Finally, we can invoke a traversing algorithm to visit nodes
        System.out.print("In Order: ");
        finn.printInorder();

        // TODO: The following does not work because we have to clean visited nodes first
        // First implement post order... then use the same logic to implement clean
        finn.cleanPostOrder();
        System.out.print("\nPre Order: ");
        finn.printPreOrder();
    }
}
