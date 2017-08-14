package com.pattern.homework.w32.runner;

import com.pattern.homework.w32.core.Hero;
import com.pattern.homework.w32.core.HeroBuilding;
import com.pattern.homework.w32.core.HeroOptionsBuilding;
import com.pattern.homework.w32.proxyreader.FileReader;
import com.pattern.homework.w32.proxyreader.ProxyFileReader;

public class HeroRunner {

	public static void main(String[] args) {
		
		FileReader proxyFileReader = new ProxyFileReader();
		proxyFileReader.readHillarysBleachedEmails();
		proxyFileReader.readTrumpsTaxStatement();
		proxyFileReader.readFromTxt();
		
		
		HeroBuilding makeHeroes = new HeroOptionsBuilding();

		Hero hero1 = makeHeroes.orderTheHero("DC");
		System.out.println(hero1 + "\n");
		
		Hero hero2 = makeHeroes.orderTheHero("Marvel");
		System.out.println(hero2 + "\n");

		Hero hero3 = makeHeroes.orderTheHero("Expendable");
		System.out.println(hero3 + "\n");

	}

}
