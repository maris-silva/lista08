package ex3;

import java.util.LinkedList;

public class LinkedListMultiset<T> {
    private LinkedList<T> elements;

    public LinkedListMultiset() {
        this.elements = new LinkedList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(LinkedListMultiset<T> m) {
        return elements.containsAll(m.getElements()) && m.getElements().containsAll(this.getElements());
        // garante que ambos os multiconjuntos têm os mesmos elementos, independentemente da ordem
    }

    public void addAll(LinkedListMultiset<T> m) {
        elements.addAll(m.elements);
    }

    public LinkedList<T> getElements() {
      return elements;
    }
}
