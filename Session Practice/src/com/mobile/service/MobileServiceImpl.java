package com.mobile.service;

public class MobileServiceImpl extends MobileService {

	@Override
	public String[] showAll() {
		String[] mobileArray= new String[]{"Samsung","OnePlus","Oppo","Redmi","POCO"};
		return mobileArray;
	}

}
