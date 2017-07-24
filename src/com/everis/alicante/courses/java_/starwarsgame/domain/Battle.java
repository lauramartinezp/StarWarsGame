package com.everis.alicante.courses.java_.starwarsgame.domain;

import java.util.List;

public class Battle {
	
	private List<BattleParticipant> rebels;
	private List<BattleParticipant> empires;
	
	public void play(List<BattleParticipant> Rebels, List<BattleParticipant> Empires) {
		
	}
	
	
	public void setRebels(List<BattleParticipant> rebels) {
		this.rebels = rebels;
	}


	public void setEmpires(List<BattleParticipant> empires) {
		this.empires = empires;
	}

	public List<BattleParticipant> getRebels() {
		return rebels;
	}

	public List<BattleParticipant> getEmpires() {
		return empires;
	}
	public BattleParticipant getEmpire(int i){
		return empires.get(i);
	}

}
