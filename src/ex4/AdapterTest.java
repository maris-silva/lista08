package ex4;

import static org.junit.Assert.*;
import org.junit.Test;

import ex3.ArrayListMultiset;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AdapterTest {

    @Test
    public void testAdapter() {
        ArrayListMultiset<Integer> multiset = new ArrayListMultiset<>();
        multiset.add(1);
        multiset.add(1);
        multiset.add(1);
        multiset.add(2);
        multiset.add(3);
        multiset.add(3);

        ArrayListMultisetAdapter<Integer> adapter = new ArrayListMultisetAdapter<>(multiset);

        Set<Integer> expectedSet = new HashSet<>();
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3); // os dois devem ser iguais pois tem elementos iguais, nao importa se sao repetidos ou nao 

        Iterator<Integer> iterator = adapter.iterator();
        Set<Integer> resultSet = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultSet.add(iterator.next());
        }
        
        assertEquals(expectedSet, resultSet);
    }
}