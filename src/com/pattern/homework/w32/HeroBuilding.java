package com.pattern.homework.w32;



public abstract class HeroBuilding {

	protected abstract Hero makeHero(String typeOfHero);

	public Hero orderTheHero(String typeOfHero) {
		Hero theHero = makeHero(typeOfHero);

		theHero.callForHero();

		theHero.appearOnScene();

		theHero.attackEnemy();
		
		theHero.dealDamage();

		return theHero;
	}

}
