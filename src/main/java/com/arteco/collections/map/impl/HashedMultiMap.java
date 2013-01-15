package com.arteco.collections.map.impl;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.arteco.collections.map.MultiKeyEntry;
import com.arteco.collections.map.MultiKeyMap;

public class HashedMultiMap<T> implements MultiKeyMap<T> {

	private Map<Object, Object> root = new ConcurrentHashMap<Object, Object>();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MultiKeyEntry<T> get(Serializable... keys) {
		if (keys == null)
			throw new IllegalArgumentException("Keys can not be null");
		MultiKeyEntry<T> entry = null;
		Map<Object, Object> map = root;
		Map<Object, Object> submap = null;
		for (int i = 0; i < keys.length - 1; i++) {
			Object s = keys[i];
			submap = (Map<Object, Object>) map.get(s);
			if (submap == null) {
				submap = new ConcurrentHashMap<Object, Object>();
				map.put(s, submap);
			}
			map = submap;
		}
		Object lastKey = keys[keys.length - 1];
		entry = (MultiKeyEntry<T>) submap.get(lastKey);
		if (entry == null) {
			entry = new HashedMultiKey(keys);
			map.put(lastKey, entry);
		}
		return entry;
	}

}
