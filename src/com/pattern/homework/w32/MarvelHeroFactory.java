package com.pattern.homework.w32;

public class MarvelHeroFactory implements HeroFactory{
	public HeroWeapon addHeroWeapon() {	
		return new MarvelHeroWeapon();
	}

	
	public HeroStamina addHeroStamina() {		
		return new MarvelHeroStamina();
	}

}
