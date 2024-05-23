package ex3;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListMultiset<T> {
    private LinkedList<T> elements;

    public LinkedListMultiset() {
        this.elements = new LinkedList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(LinkedListMultiset<T> m) {
        return elements.containsAll(m.elements) && m.elements.containsAll(this.elements);
        // garante que ambos os multiconjuntos têm os mesmos elementos, independentemente da ordem
    }

    public void addAll(LinkedListMultiset<T> m) {
        elements.addAll(m.elements);
    }
}
