package com.pattern.homework.w32.core;

import com.pattern.homework.w32.dcuniverse.DcUniverseHeroFactory;
import com.pattern.homework.w32.expendable.ExpendableHeroFactory;
import com.pattern.homework.w32.marvel.MarvelHeroFactory;

public class HeroOptionsBuilding extends HeroBuilding {

	
	
	
	@Override
	protected Hero makeHero(String typeOfHero) {
		Hero theHero = null;
		 if(typeOfHero.equals("Expendable")) {
			 HeroFactory heroFactory = new ExpendableHeroFactory();
			 theHero = new ExpendableHero(heroFactory);
			 theHero.setName("Lee Christmas");
			 
		 }else
			 if(typeOfHero.equals("DC")) {
				 HeroFactory heroFactory = new DcUniverseHeroFactory();
				 theHero = new DcUniverseHero(heroFactory);
				 theHero.setName("Superman"); 
				 
			 }else
				 if(typeOfHero.equals("Marvel")){
				 HeroFactory heroFactory = new MarvelHeroFactory();
				 theHero = new MarvelHero(heroFactory);
				 theHero.setName("Captain America");
			 }
				 
		
		
		return theHero;
	}
	

}
