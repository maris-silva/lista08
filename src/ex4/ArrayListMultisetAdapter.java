package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex3.ArrayListMultiset;

public class ArrayListMultisetAdapter<T> implements MultisetAdapter<T> {
    private ArrayListMultiset<T> multiset;
    private Set<T> elements;
    
    public ArrayListMultisetAdapter(ArrayListMultiset<T> multiset) {
        this.multiset = multiset;
    }

    @Override
    public Iterator<T> iterator() { // uso do iterador
        elements = new HashSet<>(multiset.getElements());
        return elements.iterator();
    }


    @Override
    public boolean equals(MultisetAdapter<T> m) {
      // comparação que não leva em conta elementos repetidos
      elements = new HashSet<>(multiset.getElements());
      return elements.equals(m.getElements());
    }

    public Set<T> getElements() {
      return elements;
    }

    public ArrayListMultiset<T> getMultiset() { 
      // permite acesso aos métodos antigos (add, remove e addAll) dos multisets
      return multiset;
    }
}
