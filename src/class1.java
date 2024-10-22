import java.util.*;
import java.util.stream.Collectors;

/*
   		5
  6      7
       9   8
*/
public class class1 {
    public static void main(String args[]) {
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(7);
        Node n4 = new Node(9);
        Node n5 = new Node(8);

        n3.left = n4;n3.right=n5;
        n1.left = n2;n1.right=n3;

        printLeftView(n1);

    }

    public static void printLeftView(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                if (i == 0) System.out.println(node.data + " ");

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);

            }
        }
    }


}

class Node {
    int data;
    Node left;
    Node right;
    Node(int x) {
        this.data = x;
    }
}
