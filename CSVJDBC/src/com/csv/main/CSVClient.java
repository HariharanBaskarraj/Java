package com.csv.main;

import com.csv.service.CSVServiceImpl;

public class CSVClient {

	public static void main(String[] args) {
		CSVServiceImpl service=new CSVServiceImpl();
		String filename = "employee.csv";
		service.saveToDB(filename);
	}

}
