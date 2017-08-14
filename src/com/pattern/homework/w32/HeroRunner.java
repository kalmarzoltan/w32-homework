package com.pattern.homework.w32;



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
