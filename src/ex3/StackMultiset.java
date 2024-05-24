package ex3;

import java.util.Stack;

public class StackMultiset<T> {
    private Stack<T> elements;

    public StackMultiset() {
        this.elements = new Stack<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(StackMultiset<T> m) {
        return elements.containsAll(m.getElements()) && m.getElements().containsAll(this.elements);
    }

    public void addAll(StackMultiset<T> m) {
        elements.addAll(m.elements);
    }

    public Stack<T> getElements() {
      return elements;
    }
}
