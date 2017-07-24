package com.everis.alicante.courses.java_.starwarsgame.controllers;

import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.java_.starwarsgame.GameMain;
import com.everis.alicante.courses.java_.starwarsgame.domain.Battle;
import com.everis.alicante.courses.java_.starwarsgame.domain.BattleParticipant;

public class ListController {
	Scanner in = new Scanner(System.in);
	Battle battle = GameMain.getBattle();
	
	public void listRebel() {
		List<BattleParticipant> rebels = battle.getRebels();
		BattleParticipant rebel;
		int sumJedis = 0;
		int sumX_Wings = 0;
		int sumPower = 0;
		for (int i = 0; i < rebels.size(); i++) {
			rebel = rebels.get(i);
			sumPower = sumPower + rebel.getPower();
			if ("Jedi".equals(rebel.getName())) {
				sumJedis = sumJedis + 1;
			} else if("X-Wing".equals(rebel.getName())) {
				sumX_Wings = sumX_Wings + 1;
			}
		}
		System.out.println("*********************************");
		System.out.println("Jedi's number: " + sumJedis);
		System.out.println("X-Wing's number: " + sumX_Wings);
		System.out.println("Total power: " + sumPower);
		System.out.println("*********************************");
	}

	public void listEmpire() {
		List<BattleParticipant> empires = battle.getEmpires();
		BattleParticipant empire;
		int sumSiths = 0;
		int sumAtat = 0;
		int sumTai_fighter = 0;
		int sumPower = 0;
		for (int i = 0; i < empires.size(); i++) {
			empire = empires.get(i);
			sumPower = sumPower + empire.getPower();
			if ("Sith".equals(empire.getName())) {
				sumSiths = sumSiths + 1;
			} else if("ATAT".equals(empire.getName())) {
				sumAtat = sumAtat + 1;
			} else {
				sumTai_fighter = sumTai_fighter + 1;
			}
		}
		System.out.println("*********************************");
		System.out.println("Sith's number: " + sumSiths);
		System.out.println("ATAT's number: " + sumAtat);
		System.out.println("Tai-Fighter's number: " + sumTai_fighter);
		System.out.println("Total power: " + sumPower);
		System.out.println("*********************************");
	}
}
