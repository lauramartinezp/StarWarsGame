package com.everis.alicante.courses.java_.starwarsgame.domain;

import com.everis.alicante.courses.java_.starwarsgame.enums.Factions;

public abstract class BattleParticipant {

	private int power;
	private String name;
	private Factions faction;
	private int hp;

	public int getPower() {
		return power;
	}
	protected void setPower(int power) {
		this.power = power;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	protected void setHp(int hp) {
		this.hp = hp;
	}
	public Factions getFaction() {
		return faction;
	}
	protected void setFaction(Factions faction) {
		this.faction = faction;
	}
	public void doDamage(int hp, int damage) {
		this.hp = hp - damage;
		setHp(this.hp);
		
	}
	
}
