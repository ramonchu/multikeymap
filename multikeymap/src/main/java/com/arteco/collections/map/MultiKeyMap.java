package com.arteco.collections.map;

import java.io.Serializable;

public interface MultiKeyMap<T> {

	public MultiKeyEntry<T> get(Serializable... keys);

}
