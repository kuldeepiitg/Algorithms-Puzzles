package in.interview.google;

/**
 * Cache storing objects.
 * 
 * @author kuldeep
 *
 * @param <K, V>
 */
public interface Cache<K, V> {
	
	/**
	 * Put key value in cache.
	 * 
	 * @param key
	 * 			key for value object
	 * @param value
	 * 			value to be stored in cache
	 * @return stored value
	 */
	public V put(K key, V value);
	
	/**
	 * @param key
	 * 			key to get value from cache
	 * @return stored value for key
	 */
	public V get(K key);
}
