package com.pattern.homework.w32;

public class MarvelHero extends Hero {
	HeroFactory heroFactory;

	public MarvelHero(HeroFactory heroFactory) {
		this.heroFactory = heroFactory;

	}

	void callForHero() {
		System.out.println("Please somebody call " + getName());

		weapon = heroFactory.addHeroWeapon();
		stamina = heroFactory.addHeroStamina();
	}

}
