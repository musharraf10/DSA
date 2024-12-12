public class BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
        public static Node buildtree(Node root, int val){
          if(root == null){
            root = new Node(val);
            return root;
          }
          if(root.data > val){
            root.left = buildtree(root.left, val);
          }else{
            root.right = buildtree(root.right, val);
          }
          return root;
        }

        public static void printBST(Node root){
            if(root==null){
                return;
            }

            printBST(root.left);
            System.out.print(root.data);
            printBST(root.right);

        }
  
    public static void main(String[] args) {
        int arr[]={5,1,3,4,2,7};
        Node root = null;
        for(int i = 0 ; i < arr.length ; i++){
            root = buildtree(root, arr[i]);
        }
        printBST(root);
    }
}