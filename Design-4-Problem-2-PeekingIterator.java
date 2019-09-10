// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    
    Queue<Integer> q = new LinkedList<>();

	public PeekingIterator(Iterator<Integer> iterator) {
        
	    // initialize any member here.
        
        while(iterator.hasNext())q.offer(iterator.next()); 
        
//The difference is that offer() will return false if it fails to insert the element on a size restricted Queue, whereas add() will throw an IllegalStateException.

//You should use offer() when failure to insert an element would be normal, and add() when failure would be an exceptional occurrence (that needs to be handled
	    
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        
        return q.peek();
        
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        
        return q.poll();
            
	    
	}

	@Override
	public boolean hasNext() {
        
        return !q.isEmpty();
	    
	}
}