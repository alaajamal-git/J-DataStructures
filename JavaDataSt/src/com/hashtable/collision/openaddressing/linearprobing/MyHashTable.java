package com.hashtable.collision.openaddressing.linearprobing;

import com.hashtable.collision.openaddressing.quadricprobing.Pair;

public class MyHashTable<K, V> implements HashFunction<K, V> {
	private final HashProvider<K> hashProvider;
	private Pair<K, V> pair;
	private Pair<K, V>[] table;
	private int c;
	private int size = 0;

	public MyHashTable(int capacity, HashProvider<K> hashProvider) {
		this.c = capacity;
		this.hashProvider = hashProvider;
		table = new Pair[c];
	}

	@Override
	public boolean put(K k, V v) {
		if (c == size)
			return false;// table is full
		pair = new Pair<K, V>(k, v);
		int index = hashProvider.hashVaue(k, c);
		if (table[index] == null || table[index].isEmptyObj())
			table[index] = pair;
		else
			while (table[index %= c] != null && !table[index].keyEquals(k) && !table[(index++) % c].isEmptyObj())
				; // find next free position
		table[index] = pair;

		size++;
		return true;

	}

	@Override
	public V get(K k) {
		int index = hashProvider.hashVaue(k, c);
		int stopIdx = index;
		Pair<K, V> pair = (Pair<K, V>) table[index];
		if (pair != null && pair.keyEquals(k))
			return pair.getV();
		index++;
		for (; pair != null && !pair.keyEquals(k); index++) { // null position means not found!
			if ((index %= c) == stopIdx)
				return null; // all elements are reached
			pair = (Pair<K, V>) table[index];
		}
		return (pair == null) ? null : pair.getV();

	}

	@Override
	public int remove(K k) {

		int index = hashProvider.hashVaue(k, c);
		int stopIdx = index;
		Pair<K, V> pair = (Pair<K, V>) table[index++];
		if (pair != null && pair.keyEquals(k)) {
			pair.remove();
			size--;
			return 1;
		}
		for (; pair != null && !pair.keyEquals(k); index++) {
			pair = (Pair<K, V>) table[index%c];
			if ((index %= c) == stopIdx || pair == null)
				return 0; // all elements are reached or not found
		}
		pair.remove();
		size--;
		return 1;
	}

	public String toString() {
		String result = "[";
		for (Pair<K, V> pair : table) {
			if (pair != null&&!pair.isEmptyObj())
				result += pair.toString() + ", ";
			else
				result += "0, ";
		}
		result += "]";
		return result;

	}

	public int getSize() {
		return size;
	}
}
