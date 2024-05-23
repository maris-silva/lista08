package ex3;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Objects;

public class ArrayListMultiset<T> {
    public ArrayList<T> elements;

    public ArrayListMultiset() {
        this.elements = new ArrayList<>(); // uso da biblioteca ja existente ArrayList de elementos comparaveis
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(ArrayListMultiset<T> m) {
    	// m e um subconjunto do multielemento atual 
        return elements.containsAll(m.elements) && m.elements.containsAll(this.elements);
    }

    public void addAll(ArrayListMultiset<T> m) {
        elements.addAll(m.elements);
    }
    

    @Override
    public String toString() {
        return elements.toString();
    }
}