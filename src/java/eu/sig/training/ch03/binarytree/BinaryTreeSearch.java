package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        }
        return handleNode(getChildNode(node, nodeValue), nodeValue);
    }

    private static BinaryTreeNode<Integer> getChildNode(BinaryTreeNode<Integer> node, int nodeValue) {
    	return nodeValue < node.getValue() ? node.getLeft() : node.getRight();
    }

	private static int handleNode(BinaryTreeNode<Integer> node, int nodeValue) {
		if (node == null) {
			throw new TreeException("Value not found in tree!");
		} else {
			return 1 + calculateDepth(node, nodeValue);
		}
	}
}