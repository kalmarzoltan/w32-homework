package com.pattern.hero.factorypattern;

public class HeroFactory {
	
	public Hero makeHero(String newHerotype) {
		Hero newHero = null;
		
		if(newHerotype.equals("DC")) {
			return new DcUniverseHero();
		}else
			
			if(newHerotype.equals("Marvel")) {
				return new MarvelHero();
			}else
				
				if(newHerotype.equals("Expendable")) {
					return new ExpendableHero();
				}else return null;
		
		
	}

}
