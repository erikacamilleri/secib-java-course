package upper.lesson02;

public class DemoBinaryTree {
    public static void main(String[] args) {
        
        Node finn = new Node("Finn", true);
        Node erika = new Node("Erika", false);
        Node mike = new Node("Mike", false);
        Node anirudh = new Node("Anirudh", false);

        erika.setParent(finn, true);
        mike.setParent(finn, false);
        anirudh.setParent(erika, true);

        System.out.println(erika.getLeftChild().visit()); 
    }
}
