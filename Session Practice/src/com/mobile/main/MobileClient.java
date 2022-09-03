package com.mobile.main;
import com.mobile.service.*;
public class MobileClient {

	public static void main(String[] args) {
		MobileService service=new MobileServiceImpl();
		String[] result= service.showAll();
		for(String mobile:result) {
			System.out.println(mobile);
		}
	}

}
