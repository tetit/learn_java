package com.itbulls.learnit.javacore.jcf.collections.list.hwmy;

import java.util.Iterator;

public interface MyList {
	
    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * @param e element to be appended to this list
     */
	 void add(Object e);
	 
	/**
	 * Removes all of the elements from this list.
	 * The list will be empty after this call returns.
	 */
	 void clear();
	 
	 
	/**
	 * Removes the first occurrence of the specified element from this list,
	 * if it is present.  If this list does not contain
	 * the element, it is unchanged. 
	 *
	 * @param o element to be removed from this list, if present
	 * @return true if this list contained the specified element
	 * @throws NullPointerException if the specified element is null and this
	 *         list does not permit null elements
	 */
	 boolean remove(Object o); 
	
	 
	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element).
	 * 
	 * This method acts as bridge between array-based and collection-based
	 * APIs.
	 *
	 * @return an array containing all of the elements in this list in proper
	 *         sequence
	 */
	 
	 Object[] toArray(); 
	
	 
	/**
	 * Returns the number of elements in this list.  If this list contains
	 * more than Integer.MAX_VALUE elements, returns
	 * Integer.MAX_VALUE.
	 *
	 * @return the number of elements in this list
	 */
	 int size();
	 
	/**
	 * Returns true if this list contains the specified element.
	 * More formally, returns true if and only if this list contains
	 * at least one element e such that.
	 *
	 * @param o element whose presence in this list is to be tested
	 * @return true if this list contains the specified element
	 * @throws NullPointerException if the specified element is null and this
	 *         list does not permit null elements
	 */
	 boolean contains(Object o); // returns true if this list contains the specified element.
	
	/**
	 * Returns true if this list contains all of the elements of the
	 * specified collection.
	 *
	 * @param  c object that implements MyList to be checked for containment in this list
	 * @return true if this list contains all of the elements of the
	 *         specified collection
	 * @throws NullPointerException if the specified collection contains one
	 *         or more null elements and this list does not permit null
	 *         elements
	 */
	 
	 boolean containsAll(MyList c); // returns true if this list contains all of the elements of the specified list
	 
	 public interface ListIterator extends Iterator<Object> { 
			
			/**
		     * Returns true if this list iterator has more elements when
		     * traversing the list in the reverse direction.  (In other words,
		     * returns true if previous would return an element
		     * rather than throwing an exception.)
		     *
		     * @return true if the list iterator has more elements when
		     *         traversing the list in the reverse direction
		     */
			boolean hasPrevious(); 
			
			
			/**
		     * Returns the previous element in the list and moves the cursor
		     * position backwards.  This method may be called repeatedly to
		     * iterate through the list backwards, or intermixed with calls to
		     * next() to go back and forth.  (Note that alternating calls
		     * to next() and previous() will return the same
		     * element repeatedly.)
		     *
		     * @return the previous element in the list
		     * @throws NoSuchElementException if the iteration has no previous
		     *         element
		     */
			
			Object previous();
			
			 /**
		     * Replaces the last element returned by next() or
		     * previous() with the specified element.
		     *
		     * @param e the element with which to replace the last element returned by
		     *          next(} or previous()
		     * @throws IllegalStateException if neither {@code next} nor
		     *         {@code previous} have been called, or {@code remove} or
		     *         {@code add} have been called after the last call to
		     *         {@code next} or {@code previous}
		     */
			void set(Object e); 
			
			
			 /**
		     * Removes from the list the last element that was returned by link
		     * next() or previous().  This call can
		     * only be made once per call to next() or previous().
		     * @throws IllegalStateException if neither next() nor
		     *        previous() have been called, or remove() has been 
		     *        called after the last call to next() or previous().
		     */
			
			@Override
			void remove();
		}

	/**
	 * Returns object of ListIterator.
	 * 
	 * @return object of ListIterator
	 */
	ListIterator listIterator();
	}
