package com.pattern.homework.w32.dcuniverse;

import com.pattern.homework.w32.core.HeroFactory;
import com.pattern.homework.w32.core.HeroStamina;
import com.pattern.homework.w32.core.HeroWeapon;

public class DcUniverseHeroFactory implements HeroFactory {

	
	public HeroWeapon addHeroWeapon() {	
		return new DcUniverseHeroWeapon();
	}

	
	public HeroStamina addHeroStamina() {		
		return new DcUniverseHeroStamina();
	}

}
