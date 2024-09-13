package LAB_15;

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

class insertInBST {
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

    public void insertNode(Node currentNode, int value) {
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
    
    public int findMin(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        if (node.left == null) {
            return node.value;
        }
        return findMin(node.left);
    }

    int findMax(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        if (node.right == null) {
            return node.value;
        }
        return findMax(node.right);
    }
}

public class Lab_15_83 {
    public static void main(String[] args) {

        insertInBST bst = new insertInBST();
        bst.insert(50);
        bst.insert(33);
        bst.insert(75);
        bst.insert(23);
        bst.insert(64);
        bst.insert(65);
        bst.insert(89);

        int min = bst.findMin(bst.root);
        int max = bst.findMax(bst.root);

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}
