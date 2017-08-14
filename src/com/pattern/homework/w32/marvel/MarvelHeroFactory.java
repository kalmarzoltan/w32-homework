package com.pattern.homework.w32.marvel;

import com.pattern.homework.w32.core.HeroFactory;
import com.pattern.homework.w32.core.HeroStamina;
import com.pattern.homework.w32.core.HeroWeapon;

public class MarvelHeroFactory implements HeroFactory{
	public HeroWeapon addHeroWeapon() {	
		return new MarvelHeroWeapon();
	}

	
	public HeroStamina addHeroStamina() {		
		return new MarvelHeroStamina();
	}

}
