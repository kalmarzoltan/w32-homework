package com.pattern.homework.w32;

public class ExpendableHeroFactory implements HeroFactory {
	public HeroWeapon addHeroWeapon() {	
		return new ExpendableHeroWeapon();
	}

	
	public HeroStamina addHeroStamina() {		
		return new ExpendableHeroStamina();
	}

}
