package ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ex3.ArrayListMultiset;

public class ArrayListMultisetAdapter<T> implements Iterable<T> {
    private ArrayListMultiset<T> multiset;

    public ArrayListMultisetAdapter(ArrayListMultiset<T> multiset) {
        this.multiset = multiset;
    }

    @Override
    public Iterator<T> iterator() { // uso do iterador
        Set<T> uniqueElements = new HashSet<>(multiset.elements);
        return uniqueElements.iterator();
    }
}
