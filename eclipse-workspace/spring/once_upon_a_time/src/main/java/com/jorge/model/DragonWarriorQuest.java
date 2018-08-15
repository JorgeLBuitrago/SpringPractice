package com.jorge.model;

public class DragonWarriorQuest extends Quest implements DragonQuest{
	public final String DRAGON = "Charizard";
	
	@Override
	public String getEnemy() {
		setEnemy(getDragon());
		return super.getEnemy();
	}

	@Override
	public String getDragon() {
		return "Dragon " + DRAGON;
	}
}
