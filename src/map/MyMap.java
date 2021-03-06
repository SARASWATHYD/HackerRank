package map;

public interface MyMap<K, V> {
	/**
	 * put function
	 * 
	 * @param k
	 * @param v
	 * @return
	 */
	V put(K k, V v);

	/**
	 * get function
	 * 
	 * @param k
	 * @return
	 */
	V get(K k);

	int size();

	/**
	 * Entry interface
	 * 
	 * @param <K>
	 * @param <V>
	 */
	interface Entry<K, V> {
		/**
		 * get the key in an entry object
		 * 
		 * @return
		 */
		K getKey();

		/**
		 * get the value in an entry object
		 * 
		 * @return
		 */
		V getValue();
	}
}
