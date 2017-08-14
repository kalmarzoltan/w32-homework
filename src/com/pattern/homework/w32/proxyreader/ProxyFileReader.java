package com.pattern.homework.w32.proxyreader;

import java.util.List;

public class ProxyFileReader implements FileReader {

	
	@Override
	public List<String> readFromTxt() {
		FileReader realFileReader = new RealFileReader();
		return realFileReader.readFromTxt();
	}

	@Override
	public void readHillarysBleachedEmails() {
		System.out.println("No access to Hillary's Bleached Emails...");
		
	}

	@Override
	public void readTrumpsTaxStatement() {
		System.out.println("No access to Trump's Tax Statement...");
		
	}

	

	

	
	


}
