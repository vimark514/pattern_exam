package org.example.exam.components;

import org.example.exam.operations.Visitor;

public class LeafComponent implements Component {
    private String name;

    public LeafComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}