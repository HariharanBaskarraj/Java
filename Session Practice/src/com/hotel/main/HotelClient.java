package com.hotel.main;

import java.util.*;

import com.hotel.service.HotelService;
import com.hotel.service.HotelServiceImpl;

public class HotelClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HotelService service=new HotelServiceImpl();
		System.out.println("Enter the cuisine of your choice 1)north 2)chinese 3)south 4)snacks");
		String cuisine=sc.nextLine();
		List<String> foodList=service.showItems(cuisine);
		for(String food:foodList) {
			System.out.println(food);
		}
		sc.close();
		
	}

}
