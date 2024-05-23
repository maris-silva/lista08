package ex3;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultisetTest {

    @Test
    public void testArrayListMultiset() {
        ArrayListMultiset<Integer> arrayListMultiset1 = new ArrayListMultiset<>();
        arrayListMultiset1.add(3);
        arrayListMultiset1.add(2);
        arrayListMultiset1.add(1);

        ArrayListMultiset<Integer> arrayListMultiset2 = new ArrayListMultiset<>();
        arrayListMultiset2.add(3);
        arrayListMultiset2.add(2);
        arrayListMultiset1.add(2);
        arrayListMultiset2.add(1);

        assertTrue(arrayListMultiset1.equals(arrayListMultiset2));
    }
    
    

    @Test
    public void testArrayListMultisetFalso() {
        ArrayListMultiset<Integer> arrayListMultiset1 = new ArrayListMultiset<>();
        arrayListMultiset1.add(3);
        arrayListMultiset1.add(2);
        arrayListMultiset1.add(1);

        ArrayListMultiset<Integer> arrayListMultiset2 = new ArrayListMultiset<>();
        arrayListMultiset2.add(3);
        arrayListMultiset2.add(4);
        arrayListMultiset1.add(6);
        arrayListMultiset2.add(1);

        assertFalse(arrayListMultiset1.equals(arrayListMultiset2));
    } 
    
    @Test
    public void testArrayListMultisetAddAll() {
        ArrayListMultiset<Integer> multiset1 = new ArrayListMultiset<>();
        multiset1.add(1);
        multiset1.add(2);

        ArrayListMultiset<Integer> multiset2 = new ArrayListMultiset<>();
        multiset2.add(2);
        multiset2.add(3);

        multiset1.addAll(multiset2);

        assertEquals("[1, 2, 2, 3]", multiset1.toString());
    }
    
    
    @Test
    public void testSetMultiset() {
        SetMultiset<Integer> setMultiset1 = new SetMultiset<>();
        setMultiset1.add(1);
        setMultiset1.add(2);
        setMultiset1.add(2);
        setMultiset1.add(3);

        SetMultiset<Integer> setMultiset2 = new SetMultiset<>();
        setMultiset2.add(3);
        setMultiset2.add(2);
        setMultiset2.add(1);

        assertTrue(setMultiset1.equals(setMultiset2));
    }
    
    @Test
    public void testSetMultisetFalso() {
        SetMultiset<Integer> setMultiset1 = new SetMultiset<>();
        setMultiset1.add(1);
        setMultiset1.add(2);
        setMultiset1.add(2);
        setMultiset1.add(3);

        SetMultiset<Integer> setMultiset2 = new SetMultiset<>();
        setMultiset2.add(4);
        setMultiset2.add(2);
        setMultiset2.add(1);

        assertFalse(setMultiset1.equals(setMultiset2));
    }

    @Test
    public void testLinkedListMultiset() {
        LinkedListMultiset<Integer> linkedListMultiset1 = new LinkedListMultiset<>();
        linkedListMultiset1.add(1);
        linkedListMultiset1.add(2);
        linkedListMultiset1.add(2);
        linkedListMultiset1.add(3);

        LinkedListMultiset<Integer> linkedListMultiset2 = new LinkedListMultiset<>();
        linkedListMultiset2.add(3);
        linkedListMultiset2.add(2);
        linkedListMultiset2.add(1);

        assertTrue(linkedListMultiset1.equals(linkedListMultiset2));
    }
    
    @Test
    public void testLinkedListMultisetFalso() {
        LinkedListMultiset<Integer> linkedListMultiset1 = new LinkedListMultiset<>();
        linkedListMultiset1.add(1);
        linkedListMultiset1.add(2);
        linkedListMultiset1.add(2);
        linkedListMultiset1.add(3);

        LinkedListMultiset<Integer> linkedListMultiset2 = new LinkedListMultiset<>();
        linkedListMultiset2.add(3);
        linkedListMultiset2.add(4);
        linkedListMultiset2.add(1);

        assertFalse(linkedListMultiset1.equals(linkedListMultiset2));
    }

    @Test
    public void testStackMultiset() {
        StackMultiset<Integer> stackMultiset1 = new StackMultiset<>();
        stackMultiset1.add(1);
        stackMultiset1.add(2);
        stackMultiset1.add(2);
        stackMultiset1.add(3);

        StackMultiset<Integer> stackMultiset2 = new StackMultiset<>();
        stackMultiset2.add(3);
        stackMultiset2.add(2);
        stackMultiset2.add(1);

        assertTrue(stackMultiset1.equals(stackMultiset2));
        
    }
    
    @Test
    public void testStackMultisetFalso() {
        StackMultiset<Integer> stackMultiset1 = new StackMultiset<>();
        stackMultiset1.add(1);
        stackMultiset1.add(2);
        stackMultiset1.add(2);
        stackMultiset1.add(3);

        StackMultiset<Integer> stackMultiset2 = new StackMultiset<>();
        stackMultiset2.add(3);
        stackMultiset2.add(4);
        stackMultiset2.add(1);

        assertFalse(stackMultiset1.equals(stackMultiset2));
        
    }
}