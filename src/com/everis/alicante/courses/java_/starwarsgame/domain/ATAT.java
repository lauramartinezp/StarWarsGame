package com.everis.alicante.courses.java_.starwarsgame.domain;

import com.everis.alicante.courses.java_.starwarsgame.enums.Factions;

public class ATAT extends EarthMachine{
	public ATAT() {
		this.setFaction(Factions.EMPIRE);
		this.setHp(200);
		this.setName("ATAT");
		this.setPower(30);
	}
}
