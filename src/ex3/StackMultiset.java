package ex3;

import java.util.Stack;
import java.util.Objects;

public class StackMultiset<T> {
    private Stack<T> elements;

    public StackMultiset() {
        this.elements = new Stack<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(StackMultiset<T> m) {
        return elements.containsAll(m.elements) && m.elements.containsAll(this.elements);
    }

    public void addAll(StackMultiset<T> m) {
        elements.addAll(m.elements);
    }
}
