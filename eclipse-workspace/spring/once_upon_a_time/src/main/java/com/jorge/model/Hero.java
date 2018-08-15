package com.jorge.model;

public abstract class Hero {
	protected String weapon;
	protected String fullName;
	
	public String getFullName() {
		return fullName;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	

	public void setFullName(String fullName) {
		this.fullName = fullName ;
	}

}
