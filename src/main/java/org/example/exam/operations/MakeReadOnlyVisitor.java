package org.example.exam.operations;

import org.example.exam.components.CompositeComponent;
import org.example.exam.components.LeafComponent;

public class MakeReadOnlyVisitor implements Visitor {
    @Override
    public void visit(LeafComponent leaf) {
        System.out.println("Making " + leaf.getName() + " read-only.");
    }

    @Override
    public void visit(CompositeComponent composite) {
        System.out.println("Making composite " + composite.getName() + " read-only.");
    }
}