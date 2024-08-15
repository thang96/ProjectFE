package Tree;

public class BaiTapTaoCay {
    public static void main(String[] args) {

        AVLTree tree = new AVLTree();
    
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 9);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 17);
        tree.root = tree.insert(tree.root, 21);
        tree.root = tree.insert(tree.root, 23);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 27);
    
        System.out.println("Phần tử thêm vào cây: ");
        tree.printTree();

    }
     
}