package myProject.practicle.parameterized;

/**
 * Implementing this interface allows an object to returns
 * object of ListIterator.
 * 
 * @author Andrii Piatakha
 *
 */

public interface ListIterableParameterized<T> {
	
	/**
	 * Returns object of ListIterator.
	 * 
	 * @return object of ListIterator
	 */
	ListIteratorParameterized<T> listIterator();
}
