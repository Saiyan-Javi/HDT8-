package HDT8;

/**
 * @author moises.alonso
 *
 */
public interface IHeap<P, V> {

	void Insert(P priority, V value);
	
	V get();
	
	V remove();
	
	int count();
	
	boolean isEmpty();
	
}

//Moises nos comento que podiamos usar su codigo para la primera version del programa