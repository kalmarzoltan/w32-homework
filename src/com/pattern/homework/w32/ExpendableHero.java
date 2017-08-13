package com.pattern.homework.w32;

public class ExpendableHero extends Hero {

	HeroFactory heroFactory;

	public ExpendableHero(HeroFactory heroFactory) {
		this.heroFactory = heroFactory;

	}

	void callForHero() {
		System.out.println("Please somebody call " + getName());

		weapon = heroFactory.addHeroWeapon();
		stamina = heroFactory.addHeroStamina();
	}

}
