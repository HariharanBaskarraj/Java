package com.hotel.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelServiceImpl extends HotelService {

	@Override
	public List<String> showItems(String cuisine) {
		List<String> foods = new ArrayList<>();
		if (cuisine.equals("south")) {
			foods = Arrays.asList("Idli", "Dosa", "Pongal");
		} else if (cuisine.equals("chinese")) {
			foods = Arrays.asList("Noodles", "Paper roasted Spinach", "Fried rice");
		} else if (cuisine.equals("north")) {
			foods = Arrays.asList("Chapathi", "Alu Vadi", "Lachcha Paratha");
		} else {
			foods = Arrays.asList("Pani puri", "Samosa", "Puffs");
		}
		return foods;
	}

}
