package com.asde.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.asde.springboot.entities.HospitalBedsData;

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
		return null;
	}


	@Override
	public List<HospitalBedsData> readBedsData(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HospitalBedsData> readAllBedsData() {
		// TODO Auto-generated method stub
		return null;
	}

}
