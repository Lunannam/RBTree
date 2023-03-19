package Rbtree;
import java.awt.Color;

public class Rbtree{

private Node root;
public boolean add(int value){
    if(root != null) {
        boolean result = addNode(root, value);
        root = rebalance(root);
        root.color = Color.BLACK;
        return result;
    } else {
        root = new Node();
        root.color = Color.BLACK;
        root.value = value;
        return true;
    }

}

private boolean addNode(Node node, int value){
if(node.value == value){
    return false;
} else {
    if(node.value > value) {
        if(node.leftChild != null) {
            boolean result addNode(node.leftChild, value);
            node.leftChild = rebalance(node.leftChild);
            return result;
        } else {
            node.leftChild = new Node();
            node.leftChild.color = Color.RED;
            node.leftChild.value = value;
            return true;
        }
    } else {
        if(node.righrChild != null){
            boolean result = addNode(node.rightChild, value);
            node.rightChild = rebalance(node.righrChild);
            return result;
        } else {
            node.rightChild = new Node();
            node.rightChild.color = Color.RED;
            node.rightChild.value = value;
            return true;
        }
    }
}
}

private Object rebalance(Object righrChild)
{
    return righrChild;

}

private Node rightSwap(Node node){
    Node rightChild = node.rightChild;
    Node betweenChild = (Node) rightChild.leftChild;
    rightChild.leftChild = node;
    node.rightChild = betweenChild;
    rightChild.color = node.color;
    node.color = Color.RED;
    return rightChild;

}
private Node leftSwap(Node node){
    Node leftChild = node.leftChild;
    Node betweenChild = leftChild.rightChild;
    leftChild.rightChild = node;
    node.leftChild = betweenChild;
    leftChild.color = node.color;
    node.color = Color.RED;
    return leftChild;

}
/**
 * @param node
 */
private void colorSwap(Node node){
    node.rightChild.color = Color.BLACK;
    node.leftChild.color = Color.BLACK;
    node.color = Color.RED;
}

private class Node{
    public Object righrChild;
    public Node rightChild;
    public Node leftChild;
    public Color color;
    private int value;
    
}
}