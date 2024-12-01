package org.example.exam.operations;

import org.example.exam.components.CompositeComponent;
import org.example.exam.components.LeafComponent;

public class PrintVisitor implements Visitor {
    @Override
    public void visit(LeafComponent leaf) {
        System.out.println("Leaf: " + leaf.getName());
    }

    @Override
    public void visit(CompositeComponent composite) {
        System.out.println("Composite: " + composite.getName());
    }
}
