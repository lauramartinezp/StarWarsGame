package com.everis.alicante.courses.java_.starwarsgame.domain;

import com.everis.alicante.courses.java_.starwarsgame.enums.Factions;

public class Sith extends Warrior{
	public Sith() {
		this.setFaction(Factions.EMPIRE);
		this.setHp(250);
		this.setName("Sith");
		this.setPower(80);
	}
}
