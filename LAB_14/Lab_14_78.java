import java.util.Scanner;

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

public class Lab_14_78 {
    Node root;

    public Lab_14_78() {
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
        if (value < currentNode.value) {
            if (currentNode.left == null) {
                currentNode.left = new Node(value);
            } else {
                insertNode(currentNode.left, value);
            }
        } else if (value > currentNode.value) {
            if (currentNode.right == null) {
                currentNode.right = new Node(value);
            } else {
                insertNode(currentNode.right, value);
            }
        }
    }

    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        Lab_14_78 bst = new Lab_14_78();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nBinary Search Tree Menu:");
            System.out.println("1. Insert Node");
            System.out.println("2. Preorder Traversal");
            System.out.println("3. Postorder Traversal");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter node value: ");
                    int value = sc.nextInt();
                    bst.insert(value);
                    break;
                case 2:
                    System.out.println("Preorder Traversal: ");
                    bst.preorderTraversal(bst.root);
                    break;
                case 3:
                    System.out.println("Postorder Traversal: ");
                    bst.postorderTraversal(bst.root);
                    break;
                case 4:
                    System.out.println("Inorder Traversal: ");
                    bst.inorderTraversal(bst.root);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}