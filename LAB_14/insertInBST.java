class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class insertInBST {
    Node root;

    public insertInBST() {
        this.root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertNode(root, value);
        }
    }

    private void insertNode(Node currentNode, int value) {
        Node newNode = new Node(value);

        while (true) {
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                }
                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                }
                currentNode = currentNode.right;
            }
        }
    }

    public static void main(String[] args) {
        insertInBST bst = new insertInBST();
        bst.insert(50);
        bst.insert(33);
        bst.insert(75);
        bst.insert(23);
        bst.insert(64);
        bst.insert(65);
        bst.insert(89);

        inOrder(bst.root);
    }

    public static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value+" ");
            inOrder(node.right);
        }
    }

}