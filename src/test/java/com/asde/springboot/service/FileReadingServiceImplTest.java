package com.asde.springboot.service;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.asde.springboot.entities.HospitalBedsData;

public class FileReadingServiceImplTest {

	@Test
	void testHospitalBedsData() {
		IFileReadingService fileReadingServie = new FileReadingServiceImpl();
		assertTrue(fileReadingServie.readBedsData("gurugram") instanceof Object);
	}

	@Test
	void testGetTotalSlotsForLocation() {
		IFileReadingService fileReadingServie = new FileReadingServiceImpl();
		assertTrue(fileReadingServie.getTotalBedsForLocation("gurugram", "icu") instanceof Integer);
	}
}
