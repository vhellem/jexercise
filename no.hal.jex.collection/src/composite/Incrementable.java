package composite;

public interface Incrementable {

	/**
	 * @return the total number of representable values
	 */
	public int size();
	
	/**
	 * @return the value represented by this Incrementable as an int
	 */
	public int toInt();
	
	/**
	 * Increments the value and resets the value to zero in case of overflow
	 * @return true if the value was reset due to overflow, false otherwise
	 */
	public boolean increment();

}
