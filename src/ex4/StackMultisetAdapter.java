package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex3.StackMultiset;

public class StackMultisetAdapter<T> implements MultisetAdapter<T> {
    private StackMultiset<T> multiset;
    private Set<T> elements;

    public StackMultisetAdapter(StackMultiset<T> multiset) {
        this.multiset = multiset;
    }

    @Override
    public Iterator<T> iterator() { // uso do iterador
        Set<T> uniqueElements = new HashSet<>(multiset.getElements());
        return uniqueElements.iterator();
    }

    public StackMultiset<T> getMultiset() {
      // permite acesso aos métodos antigos (add, remove e addAll) dos multisets
      return multiset;
    }

    @Override
    public boolean equals(MultisetAdapter<T> m) {
      // comparação que não leva em conta elementos repetidos
      elements = new HashSet<>(multiset.getElements());
      return elements.equals(m.getElements());
    }

    @Override
    public Set<T> getElements() {
      return elements;
    }
}