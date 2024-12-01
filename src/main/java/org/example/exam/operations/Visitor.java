package org.example.exam.operations;

import org.example.exam.components.CompositeComponent;
import org.example.exam.components.LeafComponent;

public interface Visitor {
    void visit(LeafComponent leaf);
    void visit(CompositeComponent composite);
}
