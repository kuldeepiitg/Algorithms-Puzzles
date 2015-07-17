package in.interview.google;

import java.util.HashMap;

import org.apache.commons.lang3.tuple.Pair;

/**
 * Least recently used cache
 * @author kuldeep
 *
 * @param <T>
 */
public abstract class LRUCache<K, V> implements Cache<K, V>{

	/**
	 * Maximum count of elements to be accommodated in cache
	 */
	private int size;
	
	/**
	 * Least Recently Used node lies at end of list
	 */
	private DoublyLinkedList<Pair<K, V>> lruQueue;
	
	/**
	 * Map containing reference to nodes
	 */
	private HashMap<K, Node<Pair<K, V>>> cacheMap;

	public LRUCache(int size) {
		super();
		this.size = size;
		this.lruQueue = new DoublyLinkedList<Pair<K,V>>();
		this.cacheMap = new HashMap<K, Node<Pair<K,V>>>();
	}

	public V put(K key, V value) {
		
		if (cacheMap.size() == size) {
			
			Node<Pair<K, V>> lruElement = lruQueue.removeLast();
			K lruKey = lruElement.getValue().getKey();
			cacheMap.remove(lruKey);
		} else if (cacheMap.size() > size) {
			throw new RuntimeException("size of cache map is more than allowed");
		}
		
		Pair<K, V> keyValuePair = Pair.of(key, value);
		Node<Pair<K, V>> node = new Node<Pair<K, V>>(keyValuePair);
		lruQueue.addFirst(node);
		cacheMap.put(key, node);
		return value;
	}

	public V get(K key) {
		
		if (cacheMap.containsKey(key)) {
			Node<Pair<K, V>> node = cacheMap.get(key);
			lruQueue.remove(node);
			lruQueue.addFirst(node);
			Pair<K, V> keyValuePair = node.getValue();
			return keyValuePair.getValue();
		}
		
		V value = fetch(key);
		put(key, value);
		return value;
	}
	
	/**
	 * Fetch value for given key from lower layer
	 * 
	 * @param key
	 * 		key for value to be fetched
	 * @return
	 * 		fetched value for the key
	 */
	public abstract V fetch(K key);
	
}
