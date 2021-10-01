package DS;

import java.io.Serializable;

public class MyOwnArrayList implements Serializable, Cloneable {
	private transient Object[] elementData; // Making one array to hold data
	private int size;
	protected transient int modCount = 0; // Counter to find how many times Array is re-sized.
	private static final long serialVersionUID = 1234L;

	public MyOwnArrayList() { // Making an initial Array of size 10.
		this(10);
	}

	public MyOwnArrayList(int initialCapacity) {
		super();
		if (initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		this.elementData = new Object[initialCapacity];
	}

	public boolean add(Object obj) {
		validateCapacity(size + 1);
		elementData[size++] = obj;
		return true;
	}

	public Object get(int index) {
		Object obj = elementData[index];
		return obj;
	}

	public int size() {
		return size;
	}

	public Object remove(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

		modCount++;
		Object oldValue = elementData[index];

		int numMoved = size - index - 1;
		if (numMoved > 0) {
			// System.arraycopy(src, srcPos, dest, destPos, length);
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		}
		elementData[--size] = null; // Let gc do its work
		return oldValue;
	}
	private void validateCapacity(int minCapacity) {
		modCount++; // Counter to find how many times Array is re-sized.
		int oldCapacity = elementData.length;
		Object oldData[] = elementData;

		if (minCapacity > oldCapacity) {
			int newCapacity = (oldCapacity * 3) / 2 + 1; // Size increases by 1.5 times+1.
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			elementData = new Object[newCapacity];
			System.arraycopy(oldData, 0, elementData, 0, size); // src, srcPos, dest, destPos, length


		}
	}

}
