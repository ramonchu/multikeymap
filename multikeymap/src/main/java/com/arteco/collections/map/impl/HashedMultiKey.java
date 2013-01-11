package com.arteco.collections.map.impl;

import java.io.Serializable;

import com.arteco.collections.map.MultiKeyEntry;

public class HashedMultiKey<T> implements MultiKeyEntry<T> {

	private Serializable[] keys;
	private T value;

	public HashedMultiKey(Serializable[] keys) {
		this.keys = keys;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T t) {
		this.value = t;
	}

	public Serializable[] getKeys() {
		return keys;
	}
}
