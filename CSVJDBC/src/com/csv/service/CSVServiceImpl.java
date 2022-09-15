package com.csv.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.csv.bean.Employee;
import com.csv.dao.CSVDAO;
import com.csv.dao.CSVDAOImpl;

public class CSVServiceImpl implements CSVService{

	private CSVDAO csvDao = new CSVDAOImpl();
	
	public void saveToDB(String filename) {
		Path pathToFile = Paths.get(filename);
		try {
			BufferedReader br = Files.newBufferedReader(pathToFile);
			String line = br.readLine();
			while (line != null) {
				String[] attributes = line.split(",");
				String name = attributes[0];
				String city = attributes[1];
				double salary = Double.parseDouble(attributes[2]);
				
				Employee employee = new Employee(name,city,salary);
				csvDao.save(employee);
				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*File file = new File(filename);
		try {
			FileReader fr = new FileReader(file);
			int i=fr.read();
	        while (i != -1) {
	        	
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
