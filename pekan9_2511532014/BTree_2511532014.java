package pekan9_2511532014;

public class BTree_2511532014 {
	private Node_2511532014 root_2014;
    private Node_2511532014 currentNode_2014;

    public BTree_2511532014() {
    	root_2014 = null;
    }

    public boolean search_2014(int data_2014) {
    	return search_2014(root_2014, data_2014);
    }

    private boolean search_2014(Node_2511532014 node_2014, int data_2014) {
    	if (node_2014 == null)
    		return false;
    	if (node_2014.getData_2014() == data_2014)
    		return true;
    	if (node_2014.getLeft_2014() != null)
    		if (search_2014(node_2014.getLeft_2014(), data_2014))
    			return true;
    	if (node_2014.getRight_2014() != null)
    		if (search_2014(node_2014.getRight_2014(), data_2014))
    			return true;
    	return false;
    }

    public void printInorder_2014() {
    	root_2014.printInorder_2014(root_2014);
    }

    public void printPreOrder_2014() {
    	root_2014.printPreorder_2014(root_2014);
    }

    public void printPostOrder_2014() {
    	root_2014.printPostorder_2014(root_2014);
    }

    public Node_2511532014 getRoot_2014() {
    	return root_2014;
    }

    public boolean isEmpty_2014() {
    	return root_2014 == null;
    }
    
    public int countNodes_2014() {
    	return countNodes_2014(root_2014);
    }

    private int countNodes_2014(Node_2511532014 node_2014) {
    	int count_2014 = 1;
    	if (node_2014 == null) {
    		return 0;
    	} else {
    		count_2014 += countNodes_2014(node_2014.getLeft_2014());
    		count_2014 += countNodes_2014(node_2014.getRight_2014());
    		return count_2014;
    	}
    }

    public void print_2014() {
    	root_2014.print_2014();
    }

    public Node_2511532014 getCurrent_2014() {
    	return currentNode_2014;
    }

    public void setCurrent_2014(Node_2511532014 node_2014) {
    	this.currentNode_2014 = node_2014;
    }

    public void setRoot_2014(Node_2511532014 root_2014) {
    	this.root_2014 = root_2014;
    }
}