package org.example.exam.components;

import org.example.exam.operations.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public CompositeComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addChild(Component child) {
        children.add(child);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Component child : children) {
            child.accept(visitor);
        }
    }
}