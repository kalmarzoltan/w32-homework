package com.pattern.homework.w32;

public class DcUniverseHero extends Hero {
	
	HeroFactory heroFactory;

	public DcUniverseHero(HeroFactory heroFactory) {
		this.heroFactory = heroFactory;

	}

	void callForHero() {
		System.out.println("Please somebody call " + getName());

		weapon = heroFactory.addHeroWeapon();
		stamina = heroFactory.addHeroStamina();
	}
	

}
