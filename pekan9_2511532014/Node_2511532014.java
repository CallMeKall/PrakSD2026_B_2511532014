package pekan9_2511532014;

public class Node_2511532014 {
    int data_2014;
    Node_2511532014 left_2014;
    Node_2511532014 right_2014;

    public Node_2511532014(int data_2014) {
        this.data_2014 = data_2014;
        left_2014 = null;
        right_2014 = null;
    }

    public void setLeft_2014(Node_2511532014 node) {
        if (left_2014 == null)
            left_2014 = node;
    }

    public void setRight_2014(Node_2511532014 node) {
        if (right_2014 == null)
            right_2014 = node;
    }

    public Node_2511532014 getLeft_2014() {
        return left_2014;
    }

    public Node_2511532014 getRight_2014() {
        return right_2014;
    }

    public int getData_2014() {
        return data_2014;
    }

    public void setData_2014(int data_2014) {
        this.data_2014 = data_2014;
    }

    // Traversal Methods
    void printPreorder_2014(Node_2511532014 node_2014) {
        if (node_2014 == null)
            return;
        System.out.print(node_2014.data_2014 + " ");
        printPreorder_2014(node_2014.left_2014);
        printPreorder_2014(node_2014.right_2014);
    }

    void printPostorder_2014(Node_2511532014 node_2014) {
        if (node_2014 == null)
            return;
        printPostorder_2014(node_2014.left_2014);
        printPostorder_2014(node_2014.right_2014);
        System.out.print(node_2014.data_2014 + " ");
    }

    void printInorder_2014(Node_2511532014 node_2014) {
        if (node_2014 == null)
            return;
        printInorder_2014(node_2014.left_2014);
        System.out.print(node_2014.data_2014 + " ");
        printInorder_2014(node_2014.right_2014);
    }

    public String print_2014() {
        return this.print_2014("", true, "");
    }

    public String print_2014(String prefix_2014, boolean isTail_2014, String sb_2014) {
        if (right_2014 != null) {
            right_2014.print_2014(prefix_2014 + (isTail_2014 ? "|   " : "   "), false, sb_2014);
        }
        System.out.println(prefix_2014 + (isTail_2014 ? "\\--" : "/--") + data_2014);
        if (left_2014 != null) {
            left_2014.print_2014(prefix_2014 + (isTail_2014 ? "   " : "|   "), true, sb_2014);
        }
        return sb_2014;
    }
}