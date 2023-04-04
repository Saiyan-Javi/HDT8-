package HDT8;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebaHeap {

    @Test
    public void Heap(){
        HeapUsingIterativeBinaryTree<Integer, String> Heap = new HeapUsingIterativeBinaryTree<Integer, String>(new ComparadorNumeros<Integer>());

        Heap.Insert(1, "queso");
        Heap.Insert(2, "quesorpresa");
        Heap.Insert(3, "quesadilla");

        assertEquals("quesadilla", Heap.remove());
        assertEquals("quesorpresa", Heap.remove());
        assertEquals("queso", Heap.remove());

    }
    
}
