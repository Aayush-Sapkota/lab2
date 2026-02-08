
public class Box<T> {
	private T item;

	/**
	 * Creates an empty Box.
	 */
	public Box() {
		this.item = null;
	}

	/**
	 * Creates a Box containing the given item.
	 */
	public Box(T item) {
		this.item = item;
	}

	/**
	 * Returns the item in the box.
	 */
	public T getItem() {
		return item;
	}

	/**
	 * Sets the item in the box.
	 */
	public void setItem(T item) {
		this.item = item;
	}

}

