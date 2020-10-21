package com.lockexample.LeetCode.luban04;


class NodeTest{

    private char data;
    private NodeTest leftNode;
    private NodeTest rightNode;

    public NodeTest(char data, NodeTest leftNode, NodeTest rightNode) {
        super();
        this.setData(data);
        this.setLeftNode(leftNode);
        this.setRightNode(rightNode);
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public NodeTest getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(NodeTest leftNode) {
        this.leftNode = leftNode;
    }

    public NodeTest getRightNode() {
        return rightNode;
    }

    public void setRightNode(NodeTest rightNode) {
        this.rightNode = rightNode;
    }

}
public class BinaryTreeTest {

    public static void main(String[] args) {

    }

    public void print(NodeTest node) {
        System.out.println(node.getData());
    }

    public int minLength(NodeTest node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeftNode() == null || node.getRightNode() == null) {
            return 1;
        }
        int length = Integer.MIN_VALUE;
        if (node.getLeftNode() != null) {
            return Math.min(minLength(node.getLeftNode()), length);
        }
        if (node.getRightNode() != null) {
            return Math.min(minLength(node.getRightNode()), length);
        }
        return length + 1;
    }

}

