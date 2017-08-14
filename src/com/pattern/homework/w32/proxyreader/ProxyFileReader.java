package com.pattern.homework.w32.proxyreader;

import java.util.List;

public class ProxyFileReader implements FileReader {

	
	@Override
	public List<String> readFromTxt() {
		RealFileReader realFileReader = new RealFileReader();
		return realFileReader.readFromTxt();
	}

	
	

	

	

	
	


}
