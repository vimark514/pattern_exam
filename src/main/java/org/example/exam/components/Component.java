package org.example.exam.components;

import org.example.exam.operations.Visitor;

public interface Component {
    void accept(Visitor visitor);
}