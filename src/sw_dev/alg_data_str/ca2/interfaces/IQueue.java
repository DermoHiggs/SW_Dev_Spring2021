package sw_dev.alg_data_str.ca2.interfaces;

public interface IQueue<T> {
    /**
     * Inserts the specified element into the queue
     * @param element the element argument.
     */
    public void enque(T element);

    /**
     * Retrieves and removes the head of this queue.
     *
     * @return the head of this queue
     */
    public T dequeue(); //throw NoSuchElementException as appropriate

    /**
     * Retrieves, but does not remove, the head of this queue.
     *
     * @return  the head of this queue
     */
    public T first(); //throw NoSuchElementException as appropriate

    /**
     * Tests if this Queue is empty.
     *
     * @return  {@code true} if and only if this queue contains
     *          no items; {@code false} otherwise.
     */
    public boolean empty();

}
