package com.pattern.homework.w32.core;

public abstract class Hero {
	private String name;
	
	 HeroWeapon weapon;
	 HeroStamina stamina;
	
	public String getName() {
		return name; }
	
	public void setName(String newName) { 
		name = newName; }
	
	abstract void callForHero();
	
	public void appearOnScene() {
		System.out.println(getName() + " has appeared on the Scene...");

	}
	
	public void attackEnemy() {
		System.out.println(getName() + " is attacking the Enemy");

	}
	
	public void dealDamage() {
		System.out.println(getName() + " is dealing damage");
	}
	
public String toString(){
		
		String infoOnHero = name + " has a stamina of: " + stamina + 
				"\nHe is dealing " + weapon;
		
		return infoOnHero;
		
	}
	
	
}
