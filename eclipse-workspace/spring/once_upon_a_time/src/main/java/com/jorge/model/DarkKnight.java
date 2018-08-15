package com.jorge.model;

public class DarkKnight extends Hero implements Knight{
	private static final String KINGDOM = "Dark Kingdom";
	@Override
	public void setWeapon(String weapon) {
		this.weapon = "Dark " + weapon;
		
	}
	@Override
	public void setFullName(String fullName) {
		this.fullName = "Dark " + fullName;
	}
	@Override
	public String getKingdom() {
		return KINGDOM;
	}

}
