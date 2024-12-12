public class BinaryTreeTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        static int index;

        public static Node buildTree(int nodes[]) {
            if (index >= nodes.length || nodes[index] == -1) {
                index++;
                return null;
            }

            Node newNode = new Node(nodes[index]);
            index++;
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorderTraversal(Node root) {
            if (root == null) return;

            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public static void inorderTraversal(Node root) {
            if (root == null) return;

            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTrees.index = 0;
        Node root = BinaryTrees.buildTree(nodes);

        System.out.print("Preorder Traversal: ");
        BinaryTrees.preorderTraversal(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        BinaryTrees.inorderTraversal(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        BinaryTrees.postorder(root);
    }
}