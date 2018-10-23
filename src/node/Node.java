package node;

public class Node {

    private Node left;
    private Node right;
    private Object content;

    public Node(Object content, Node left, Node right){
        super();
        this.content = content;
        this.left = left;
        this.right = right;
    }

    public Node(Object content, Node left){
        this(content,left,null);
    }

    public Node(Object content){
        this(content, null );
    }

    public boolean isLeaf(){
        return (left==null && right==null);
    }

    public void setLeft(Node left) {
        if (this.left == null){
            this.left=left;
        } else {
            this.left.setLeft(left);
        }
    }

    public void setRight(Node right) {
        if((this.right == null)){
            this.right=right;
        } else {
            this.right.setRight(right);
        }
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public boolean contains(Object content) {
        if (this.content == content) {
            return true;
        } else if (this.left != null && this.left.contains(content)) {
            return true;
        } else if (this.right != null && this.right.contains(content)) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        if (this.isLeaf()) return "N-" + content;
        String valueLeft = (left != null) ? "[" + left:"[_";
        String valueRight = (right != null)?"," + right + "]":",_]";
        return "N-" + content + valueLeft + valueRight;
    }
}
