package com.everis.alicante.courses.java_.starwarsgame.domain;

import com.everis.alicante.courses.java_.starwarsgame.enums.Factions;

public class X_Wing extends AirMachine{
	public X_Wing() {
		this.setFaction(Factions.REBEL);
		this.setHp(30);
		this.setName("X-Wing");
		this.setPower(40);
	}
}
