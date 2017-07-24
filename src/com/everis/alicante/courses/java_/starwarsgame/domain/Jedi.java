
package com.everis.alicante.courses.java_.starwarsgame.domain;

import com.everis.alicante.courses.java_.starwarsgame.enums.Factions;

public class Jedi extends Warrior{
	public Jedi() {
		this.setFaction(Factions.REBEL);
		this.setHp(200);
		this.setName("Jedi");
		this.setPower(100);
	}
}
