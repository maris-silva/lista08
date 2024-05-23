package ex3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetMultiset<T> {
    private Set<T> elements;

    public SetMultiset() {
        this.elements = new HashSet<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(SetMultiset<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(SetMultiset<T> m) {
        elements.addAll(m.elements);
    }
}