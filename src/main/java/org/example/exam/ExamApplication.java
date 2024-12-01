package org.example.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.example.exam.components.CompositeComponent;
import org.example.exam.components.LeafComponent;
import org.example.exam.operations.MakeReadOnlyVisitor;
import org.example.exam.operations.PrintVisitor;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

    @Override
    public void run(String... args) {
        CompositeComponent root = new CompositeComponent("Root");
        LeafComponent leaf1 = new LeafComponent("Leaf1");
        LeafComponent leaf2 = new LeafComponent("Leaf2");
        CompositeComponent subComposite = new CompositeComponent("SubComposite");

        subComposite.addChild(new LeafComponent("SubLeaf1"));
        subComposite.addChild(new LeafComponent("SubLeaf2"));
        root.addChild(leaf1);
        root.addChild(leaf2);
        root.addChild(subComposite);

        System.out.println("Printing structure:");
        root.accept(new PrintVisitor());

        System.out.println("\nMaking all components read-only:");
        root.accept(new MakeReadOnlyVisitor());
    }
}

