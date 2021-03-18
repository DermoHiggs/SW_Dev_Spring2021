package sw_dev.alg_data_str.ca2.interfaces;

import java.util.Iterator;

public interface IList <T> extends Iterable<T> {
    /**
     * Add an element to the end of the list
     * @param elem element to be added
     */
    public void add(T elem); //add to the end of the list

    /**
     * Inserts the specified element at the specified position in this list
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    public void add(int index, T element);//throws an IndexOutOfBounds exception where appropriate

    /**
     * Replaces the element at the specified position in this list with the specified element
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
    public T set(int index, T element);//throws an IndexOutOfBounds exception where appropriate

    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    public T get(int index);//throws an IndexOutOfBounds exception where appropriate

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    public int size();

    /**
     *
     * @param index
     * @return the element removed from the list
     */
    public T remove(int index);//throws an IndexOutOfBounds exception where appropriate

    /**
     *
     * @param elem the element to remove
     * @return whether the elements was removed or not
     */
    public boolean remove(T elem);//throws an IndexOutOfBounds exception where appropriate

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    public boolean isEmpty();


    /**
     * This is new (to the interface) but should be straightforward to implement
     * @param element the element to search found
     * @return whether the element was found or not
     */
    public boolean contains(T element);

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     * Specified by:
     * iterator in interface  Iterable<T>
     * @return an iterator over the elements in this list in proper sequence
     */
    public Iterator<T> iterator();

}

