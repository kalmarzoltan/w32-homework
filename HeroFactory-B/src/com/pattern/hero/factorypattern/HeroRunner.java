package com.pattern.hero.factorypattern;

import java.util.Scanner;

public class HeroRunner {
	public static void main(String[] args) {

		HeroFactory herofactory = new HeroFactory();
		Hero theHero = null;

		Scanner userInput = new Scanner(System.in);

		System.out.println("What kind of Hero? DC,Marvel,Expendable? ");

		if (userInput.hasNextLine()) {
			String typeOfHero = userInput.nextLine();

			theHero = herofactory.makeHero(typeOfHero);
		}

		if (theHero != null) {

			callForHero(theHero);
		} else
			System.out.println("Enter DC,Marvel,Expendable the next time! ");

	}

	public static void callForHero(Hero aHero) {
		aHero.appearOnScene();
		aHero.attackEnemy();
		aHero.dealDamage();

	}

}
