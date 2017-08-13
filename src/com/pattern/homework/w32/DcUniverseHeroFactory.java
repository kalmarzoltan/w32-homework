package com.pattern.homework.w32;

public class DcUniverseHeroFactory implements HeroFactory {

	
	public HeroWeapon addHeroWeapon() {	
		return new DcUniverseHeroWeapon();
	}

	
	public HeroStamina addHeroStamina() {		
		return new DcUniverseHeroStamina();
	}

}
