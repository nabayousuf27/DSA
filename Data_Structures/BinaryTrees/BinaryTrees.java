package Data_Structures.BinaryTrees;
import java.util.*;
//build tree in pre order sequence
public class BinaryTrees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    } 
    static class BinaryTree{
        static int index= -1;

        // creating binarytree
        public static Node buildTree(int nodes[]){    //will return the Node or root of the tree
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
        //preOrder
        public static void preOrder(Node root){ //0(n)
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //InOrder
        public static void inOrder(Node root){ //0(n)
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        //PostOrder
        public static void postOrder(Node root){ //0(n)
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        //LevelOrder
        public static void levelOrder(Node root){ 
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left!= null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
                
            }
        }

        //height of binary tree
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        //Count of Nodes  
        public static int count(Node root){
            if(root == null){
                return 0;
            }
            int lc = count(root.left);
            int rc = count(root.right);
            return lc + rc + 1 ;
        }
        //sum of Nodes  
        public static int sum(Node root){
            if(root == null){
                return 0;
            }
            int ls = sum(root.left);
            int rs = sum(root.right);
            
            int sum = ls + rs + root.data;
            return sum;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        // traversals
        System.out.print("Pre Order : ");
        tree.preOrder(root);

        System.out.print("\nIn Order  : ");
        tree.inOrder(root);

        System.out.print("\nPost Order: ");
        tree.postOrder(root);

        System.out.println("\nLevel Order : ");
        tree.levelOrder(root);

        System.err.println("height of tree : "+ tree.height(root));
        System.err.println("count of tree : "+ tree.count(root));
        System.err.println("sum of tree : "+ tree.sum(root));

    }
    
}
