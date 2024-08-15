package Tree;

public class AVLTree {

    public class Node {
        int key, height;
        Node left, right;

        Node(int d) {
            key = d;
            height = 1;
        }
    }

    public Node root;

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    public Node balanceNode(Node currentNode) {
        int balance = getBalance(currentNode);

        if (balance > 1 && getBalance(currentNode.left) >= 0) {
            return rightRotate(currentNode);
        }

        if (balance > 1 && getBalance(currentNode.left) < 0) {
            currentNode.left = leftRotate(currentNode.left);
            return rightRotate(currentNode);
        }

        if (balance < -1 && getBalance(currentNode.right) <= 0) {
            return leftRotate(currentNode);
        }

        if (balance < -1 && getBalance(currentNode.right) > 0) {
            currentNode.right = rightRotate(currentNode.right);
            return leftRotate(currentNode);
        }

        return currentNode;
    }

    public Node insert(Node currentNode, int key) {
        if (currentNode == null) {
            return (new Node(key));
        }

        if (key < currentNode.key) {
            currentNode.left = insert(currentNode.left, key);
        } else if (key > currentNode.key) {
            currentNode.right = insert(currentNode.right, key);
        } else {
            return currentNode;
        }

        currentNode.height = 1 + max(height(currentNode.left), height(currentNode.right));

        return balanceNode(currentNode);
    }

    public Node deleteNode(Node currentNode, int key) {
        if (currentNode == null) {
            return currentNode;
        }

        if (key < currentNode.key) {
            currentNode.left = deleteNode(currentNode.left, key);
        } else if (key > currentNode.key) {
            currentNode.right = deleteNode(currentNode.right, key);
        } else {
            // trường hợp có 1 con hoặc không có con nào
            if (currentNode.left == null || currentNode.right == null) {
                currentNode = (currentNode.left != null) ? currentNode.left : currentNode.right;
            } else {
                // trường hợp có 2 con
                Node temp = minValueNode(currentNode.right);
                currentNode.key = temp.key;
                currentNode.right = deleteNode(currentNode.right, temp.key);
            }
        }

        if (currentNode == null) {
            return currentNode;
        }

        currentNode.height = max(height(currentNode.left), height(currentNode.right)) + 1;

        return balanceNode(currentNode);
    }

    public Node minValueNode(Node node) {
        Node current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    public void printTree() {
        printInorder(root);
    }

    private void printInorder(Node node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.key + "\n");
            printInorder(node.right);
        }
    }

    public Node search(Node currentNode, int key) {
        if (currentNode == null || currentNode.key == key) {
            return currentNode;
        }
        if (currentNode.key < key) {
            return search(currentNode.right, key);
        }
        return search(currentNode.left, key);
    }
    
}
