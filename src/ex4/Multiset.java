package ex4;

import java.util.Iterator;

public interface Multiset<T> {
    void add(T element); // adiciona um elemento no multiconjunto
    boolean equals(Multiset<T> m); // sao iguais se eles possuem os mesmos elementos independentemente da ordem 
    void addAll(Multiset<T> m);
    
    Iterator<T> iterator();     // permite o uso de iterador 

}