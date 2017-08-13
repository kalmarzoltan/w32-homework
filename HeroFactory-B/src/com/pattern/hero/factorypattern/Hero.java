package com.pattern.hero.factorypattern;

public abstract class Hero {
	
	private String name;
	private int damage;
	
	public String getName() {return name;}
	public void setName(String newName) {name = newName;}
	
	public int getDamage() {return damage;}
	public void setDamage(int newDamage) {damage = newDamage;}
	
	public void appearOnScene() {
		System.out.println(getName() + " has appeared on the Scene...");

	}
	
	public void attackEnemy() {
		System.out.println(getName() + " is attacking the Enemy");

	}
	
	public void dealDamage() {
		System.out.println(getName() + " is dealing damage");
	}
	
	
	
	
	

	
}
