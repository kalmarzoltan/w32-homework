package com.pattern.homework.w32.expendable;

import com.pattern.homework.w32.core.HeroFactory;
import com.pattern.homework.w32.core.HeroStamina;
import com.pattern.homework.w32.core.HeroWeapon;

public class ExpendableHeroFactory implements HeroFactory {
	public HeroWeapon addHeroWeapon() {	
		return new ExpendableHeroWeapon();
	}

	
	public HeroStamina addHeroStamina() {		
		return new ExpendableHeroStamina();
	}

}
