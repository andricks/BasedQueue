package cola;


import java.util.NoSuchElementException;

public class ArrayBasedQueue {
	private Object[] array;

	public static void main(String[] args) 
	{
		List cola1=new List();
	 cola1.insertar(10);
	 cola1.insertar(20);
	 cola1.insertar(30);
	 cola1.insertar(40);
	 cola1.insertar(50);
	 cola1.insertar(60);
	 cola1.extraer();
	 cola1.estaVacia();
	 cola1.contar();
	 System.out.println(cola1.toString());
	}
	
	int size = 0;

	
	int head = 0;
	int tail = 0;

	/**
	 * Constructor to create new array based queue
	 * 
	 * @param capacity
	 */
	public ArrayBasedQueue(int capacity) {
		array = new Object[capacity];
	}

	/**
	 * Method to push a new item in queue
	 * We will deal only with tail while adding new item
	 * 
	 * @param item
	 */
	public void enqueue(Object item) {
		if (size == array.length) {
			throw new IllegalStateException("Cannot add to full queue");
		} 
		array[tail] = item;
		tail = (tail + 1) % array.length;
		size++;
	}

	/**
	 * Method to pop a item from queue
	 * We will deal only with head while deleting a element
	 * 
	 * @return {@link Object}
	 */
	public Object dequeue() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot remove from empty queue");
		}
		Object item = array[head];
		array[head] = null;
		head = (head + 1) % array.length;
		size--;
		return item;
	}

	/**
	 * Method to check the top item in queue
	 * 
	 * @return {@link Object}
	 */
	public Object peek() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot peek from empty queue");
		}
		return array[head];
	}

	/**
	 * Method to check size of queue
	 * 
	 * @return {@link int}
	 */
	public int size() {
		return size;
	}

	/**
	 * Method to check if queue is empty
	 * 
	 * @return {@link boolean}
	 */
	public boolean isEmpty() {
		return size == 0;
	}



}
