package com.jorge.model;


public class WaspSlayingQuest extends Quest implements WaspQuest{
	public final String WASP = "EVIL YELLOW WASP";
	
	@Override
	public String getEnemy() {
		setEnemy(getWasp());
		return super.getEnemy();
	}

	@Override
	public String getWasp() {
		return WASP;
	}
}
