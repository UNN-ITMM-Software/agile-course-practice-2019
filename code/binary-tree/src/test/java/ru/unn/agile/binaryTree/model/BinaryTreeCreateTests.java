package ru.unn.agile.binarytree.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeCreateTests {
    private BinaryTree binaryTree;

    private int     simpleKey  = 42;

    @Before
    public void setUp() {
        binaryTree = new BinaryTree();
    }

    @Test
    public void canCreate() {
        assertNotNull(binaryTree);
    }

    @Test
    public void canAddElement() {
        String simpleData = "SimpleText";
        binaryTree.add(simpleKey, simpleData);
    }

    @Test
    public void noErrorOnEmptyTreeFind() {
        final String result = binaryTree.find(simpleKey);

        assertNull(result);
    }

    @Test
    public void noErrorOnEmptyTreeRemove() {
        assertFalse(binaryTree.remove(simpleKey));
    }
}