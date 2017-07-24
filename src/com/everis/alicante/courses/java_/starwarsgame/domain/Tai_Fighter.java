package com.everis.alicante.courses.java_.starwarsgame.domain;

import com.everis.alicante.courses.java_.starwarsgame.enums.Factions;

public class Tai_Fighter extends AirMachine{
	public Tai_Fighter() {
		this.setFaction(Factions.EMPIRE);
		this.setHp(30);
		this.setName("Tai-Fighter");
		this.setPower(50);
	}
}
