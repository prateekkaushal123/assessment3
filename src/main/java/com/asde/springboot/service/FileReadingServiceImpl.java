package com.asde.springboot.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.asde.springboot.entities.HospitalBedsData;
import com.opencsv.CSVReader;

@Service
public class FileReadingServiceImpl implements IFileReadingService {
	
	private static final String fileName = "hospitalbeds.csv";
	

	/**
	 * TODO: Based on the filename passed to the constructor, the method needs to be implemented
	 * to get the no of slots available for the specified location and bedtype combination
	 * e.g. the rsult shall be 50 for icu and gurugram
	 */
	
	@Override
	public Integer getTotalBedsForLocation(String location, String bedType) {
		List<HospitalBedsData> r1 = new ArrayList<HospitalBedsData>();
		List<List<String>> records = new ArrayList<List<String>>();
		int count=0;
		
		try (CSVReader csvReader = new CSVReader(new FileReader(fileName));) {
		    String[] values = null;
		    System.out.println("************************************************");
		    int i=0;
		    while ((values = csvReader.readNext()) != null) {
		    	if(i>0) {
		    	HospitalBedsData obj=new HospitalBedsData();
		    	
		    	
		    	System.out.println(Arrays.asList(values));
		        records.add(Arrays.asList(values));
		        obj.setBedType(records.get(i-1).get(0));
		        obj.setLocation(records.get(i-1).get(1));
		        if(records.get(i-1).get(2).equals("true"))
		        	obj.setAvailable(true);
		        else
		        	obj.setAvailable(false);
		        
		        obj.setSlots(Integer.valueOf(records.get(i-1).get(3)));
		        
		        r1.add(obj);
		        if(records.get(i-1).get(1).equals(location) && records.get(i-1).get(0).equals(bedType))
		        count++;
		    	}
		    	i++;
		    }
		}
		// TODO Auto-generated method stub
		//return null;
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return count;
		//return null;
	}


	@Override
	public List<HospitalBedsData> readBedsData(String location) {
		List<HospitalBedsData> r1 = new ArrayList<HospitalBedsData>();
		List<List<String>> records = new ArrayList<List<String>>();
		
		
		try (CSVReader csvReader = new CSVReader(new FileReader(fileName));) {
		    String[] values = null;
		    System.out.println("************************************************");
		    int i=0;
		    while ((values = csvReader.readNext()) != null) {
		    	if(i>0) {
		    	HospitalBedsData obj=new HospitalBedsData();
		    	
		    	
		    	System.out.println(Arrays.asList(values));
		        records.add(Arrays.asList(values));
		        obj.setBedType(records.get(i-1).get(0));
		        obj.setLocation(records.get(i-1).get(1));
		        if(records.get(i-1).get(2).equals("true"))
		        	obj.setAvailable(true);
		        else
		        	obj.setAvailable(false);
		        
		        obj.setSlots(Integer.valueOf(records.get(i-1).get(3)));
		        
		        if(records.get(i-1).get(1).equals(location))
		        r1.add(obj);
		        
		        
		    	}
		    	i++;
		    }
		}
		// TODO Auto-generated method stub
		//return null;
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r1;
	}

	@Override
	public List<HospitalBedsData> readAllBedsData() {
		List<HospitalBedsData> r1 = new ArrayList<HospitalBedsData>();
		List<List<String>> records = new ArrayList<List<String>>();
		
		
		try (CSVReader csvReader = new CSVReader(new FileReader(fileName));) {
		    String[] values = null;
		    System.out.println("************************************************");
		    int i=0;
		    while ((values = csvReader.readNext()) != null) {
		    	if(i>0) {
		    	HospitalBedsData obj=new HospitalBedsData();
		    	
		    	
		    	System.out.println(Arrays.asList(values));
		        records.add(Arrays.asList(values));
		        obj.setBedType(records.get(i-1).get(0));
		        obj.setLocation(records.get(i-1).get(1));
		        if(records.get(i-1).get(2).equals("true"))
		        	obj.setAvailable(true);
		        else
		        	obj.setAvailable(false);
		        
		        obj.setSlots(Integer.valueOf(records.get(i-1).get(3)));
		        r1.add(obj);
		        
		        
		    	}
		    	i++;
		    }
		}
		// TODO Auto-generated method stub
		//return null;
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r1;
	}

}
