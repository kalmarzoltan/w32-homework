package com.pattern.homework.w32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RealFileReader implements FileReader {

	
	public  List<String> readFromTxt() {
	        List<String> inputArray = new ArrayList<>();
	        File file;
	        try {
	            //a java beli file objektumot megfeleltetem egy az egyben a test.txt-nek
	            file = new File("C:\\Users\\Kalmi\\Documents\\eclipse-workspace\\HeroFactory\\src\\com\\pattern\\homework\\w32\\test.txt");
	            //letrehozok egy Scanner objektumpeldanyt, ami bemenetkent megkapta az imenti fajlt
	            Scanner scnr = new Scanner(file);

	            //vegigmegyek a bemenetkent kapott fajl sorain, amig van
	            while (scnr.hasNextLine()) {
	                //a line valtozoba le tudom kerni a aktualis sort
	                String line = scnr.nextLine();
	                //ki is irom
	                System.out.println(line);
	                inputArray.add(line);
	            }
	            	            
	        } catch (FileNotFoundException ex) {
	            System.out.println("File not found. Please check the filename or place. " + ex.toString());
	        }
	        return inputArray;
	    }
	

	@Override
	public void readHillarysBleachedEmails() {
		System.out.println("Downloading Hillary's emails from the FBI...");
		
	}

	@Override
	public void readTrumpsTaxStatement() {
		System.out.println("Downloading Trump's taxstatement from the KGB...");
		
	}

	
	

	

}
