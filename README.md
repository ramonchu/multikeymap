multikeymap
===========

A simple java multi key map: map.get( key_1, key_2, ..., key_n).setValue(new Pojo());

Usage
=====

    	MultiKeyMap<Person> map = new HashedMultiMap<>();
  	
  	Person person1 = new Person("Ramón", "Arnau");
	Person person2 = new Person("Aina", "Bagur");

	map.get("company_1", "section_1", "position_1").setValue(person1);
	map.get("company_1", "section_1", "position_2").setValue(person2);

	System.out.println(map.get("company_1", "section_1", "position_1").getValue());
	System.out.println(map.get("company_1", "section_1", "position_2").getValue());
	System.out.println(map.get("company_1", "section_1", "position_3").getValue());
