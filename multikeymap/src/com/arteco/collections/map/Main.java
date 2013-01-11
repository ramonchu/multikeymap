package com.arteco.collections.map;

import com.arteco.collections.map.impl.HashedMultiMap;

public class Main {
	public static void main(String[] args) {
		MultiKeyMap<Person> map = new HashedMultiMap<>();
		Person person1 = new Person("Ramón", "Arnau");
		Person person2 = new Person("Aina", "Bagur");

		map.get("company_1", "section_1", "position_1").setValue(person1);
		map.get("company_1", "section_1", "position_2").setValue(person2);

		System.out.println(map.get("company_1", "section_1", "position_1").getValue());
		System.out.println(map.get("company_1", "section_1", "position_2").getValue());
		System.out.println(map.get("company_1", "section_1", "position_3").getValue());
	}
}
