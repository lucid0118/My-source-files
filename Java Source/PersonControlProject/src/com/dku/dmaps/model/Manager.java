package com.dku.dmaps.model;

import java.util.ArrayList;

import com.dku.dmaps.vo.Person;

public class Manager {
	private ArrayList<Person> dataList = new ArrayList<Person>();
	
	public Manager() {
		
	}

	public void dataInsert(Person data) {
		dataList.add(data);
	}

	public ArrayList<Person> printAllData() {
		return dataList;
	}

	public ArrayList<Person> searchWithName(String string) {
		ArrayList<Person> resultList = new ArrayList<Person>();
		
		for (Person person : dataList) {
			if(person.getName().contains(string)) {
				resultList.add(person);
			}
		}
		return resultList;
	}
	
}
