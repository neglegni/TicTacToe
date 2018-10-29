package node;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NodeTest {


    private Node root, node1, node2, node3, node4, node5, node6;

    @Before
    public void irgendwas() {
        this.node3 = new Node(3);
        this.node4 = new Node(4);
        this.node1 = new Node(1, node3, node4);
        this.node2 = new Node(2);
        this.root = new Node(0, node1, node2);
        // System.out.println(root);
        this.node5 = new Node(5);
        this.node6 = new Node(6);
    }

    @Test
    public void test_pos_isLeaf(){
        assertTrue(this.node2.isLeaf());
        assertTrue(this.node3.isLeaf());
    }

    @Test
    public void test_neg_isLeaf(){
        assertTrue(!this.root.isLeaf());
        assertTrue(!this.node1.isLeaf());
    }

    @Test
    public void test_pos_setRight(){
        this.node2.setRight(node6);
        assertEquals(node6,node2.getRight());
    }

    @Test
    public void test_grenze_setRight(){
        this.root.setRight(node6);
        assertEquals(node2, root.getRight());
        assertEquals(node6, node2.getRight());
        node1.getRight().setRight(node5);
        assertEquals(node4, node1.getRight());
        assertEquals(node5, node4.getRight());
    }

    @Test
    public void test_pos_setLeft(){
        node3.setLeft(node6);
        assertEquals(node6, node3.getLeft());
        node4.setLeft(node5);
        assertEquals(node5, node4.getLeft());
    }

    @Test
    public void test_grenze_setLeft(){
        root.setLeft(node6);
        assertEquals(node1, root.getLeft());
        assertEquals(node3, node1.getLeft());
        assertEquals(node6, node3.getLeft());
    }

    @Test
    public void test_pos_contains(){
        assertTrue(root.contains(0));
        assertTrue(root.contains(1));
        assertTrue(root.contains(4));
    }

    @Test
    public void test_neg_contains(){
        assertTrue(!root.contains(-15));
    }

    @Test
    public void test_toString(){
        assertEquals("N-6", node6.toString());
        assertEquals("N-4", node4.toString());
        assertEquals("N-1[N-3,N-4]", node1.toString());
        assertEquals("N-0[N-1[N-3,N-4],N-2]", root.toString());
        node2.setRight(node6);
        assertEquals("N-2[_,N-6]", node2.toString());
        node4.setLeft(node5);
        assertEquals("N-4[N-5,_]", node4.toString());
    }
}