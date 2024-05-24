package ex4;

import java.util.Iterator;
import java.util.Set;

public interface MultisetAdapter<T> extends Iterable<T>{
    boolean equals(MultisetAdapter<T> m);
    Iterator<T> iterator(); // permite o uso de iterador 
    Set<T> getElements();
}

// métodos como add, remove e addAll foram mantidos os antigos por meio do acesso 
// direto aos multisets
