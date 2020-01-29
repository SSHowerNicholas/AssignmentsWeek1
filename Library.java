package com.ss.assignments.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Library {
	private String name;
	private String location;
	private Map<String, Integer> book_Copies;
	
	public Library() {
		book_Copies = new HashMap<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void addbook(String title) {
		book_Copies.merge(title, 1, (old, add) -> old + add);
	}
	
	public String checkoutbook(String title) {
		if(book_Copies.containsKey(title) && book_Copies.get(title) > 0) {
			book_Copies.merge(title, 1, (old, sub) -> old - sub);
			book_Copies.remove(title, 0);
			return title;
		}
		return null;
	}
	public Set<String> titleDisplay() {
		return book_Copies.keySet();
	}
}
