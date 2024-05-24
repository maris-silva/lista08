package ex4;

import static org.junit.Assert.*;
import org.junit.Test;

import ex3.ArrayListMultiset;
import ex3.LinkedListMultiset;
import ex3.SetMultiset;
import ex3.StackMultiset;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AdapterTest {

    @Test
    public void ArrayListAdapter() {
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
        expectedSet.add(3); 
        // os dois devem ser iguais pois tem elementos iguais, nao importa se sao repetidos ou nao 

        
        // teste iterator
        Iterator<Integer> iterator = adapter.iterator();
        Set<Integer> resultSet = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultSet.add(iterator.next());
        }
        assertEquals(expectedSet, resultSet);

        // teste getElements
        assertEquals(expectedSet, adapter.getElements());
    }
    
    @Test
    public void LinkedListAdapter() {
        LinkedListMultiset<Integer> multiset = new LinkedListMultiset<>();
        multiset.add(1);
        multiset.add(1);
        multiset.add(1);
        multiset.add(2);
        multiset.add(3);
        multiset.add(3);

        LinkedListMultisetAdapter<Integer> adapter = new LinkedListMultisetAdapter<>(multiset);

        Set<Integer> expectedSet = new HashSet<>();
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3); 

        Iterator<Integer> iterator = adapter.iterator();
        Set<Integer> resultSet = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultSet.add(iterator.next());
        }
        
        assertEquals(expectedSet, resultSet);
    }
    
    @Test
    public void SetAdapter() {
        SetMultiset<Integer> multiset = new SetMultiset<>();
        multiset.add(1);
        multiset.add(1);
        multiset.add(1);
        multiset.add(2);
        multiset.add(3);
        multiset.add(3);

        SetMultisetAdapter<Integer> adapter = new SetMultisetAdapter<>(multiset);

        Set<Integer> expectedSet = new HashSet<>();
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3); 

        Iterator<Integer> iterator = adapter.iterator();
        Set<Integer> resultSet = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultSet.add(iterator.next());
        }
        
        assertEquals(expectedSet, resultSet);
    }
    
    @Test
    public void StackAdapter() {
    	StackMultiset<Integer> multiset = new StackMultiset<>();
        multiset.add(1);
        multiset.add(1);
        multiset.add(1);
        multiset.add(2);
        multiset.add(3);
        multiset.add(3);

        StackMultisetAdapter<Integer> adapter = new StackMultisetAdapter<>(multiset);

        Set<Integer> expectedSet = new HashSet<>();
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3); 

        Iterator<Integer> iterator = adapter.iterator();
        Set<Integer> resultSet = new HashSet<>();
        
        while (iterator.hasNext()) {
            resultSet.add(iterator.next());
        }
        
        assertEquals(expectedSet, resultSet);
    }
        
}