package com.everis.alicante.courses.java_.starwarsgame.controllers;

import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.java_.starwarsgame.GameMain;
import com.everis.alicante.courses.java_.starwarsgame.domain.ATAT;
import com.everis.alicante.courses.java_.starwarsgame.domain.Battle;
import com.everis.alicante.courses.java_.starwarsgame.domain.BattleParticipant;
import com.everis.alicante.courses.java_.starwarsgame.domain.Jedi;
import com.everis.alicante.courses.java_.starwarsgame.domain.Sith;
import com.everis.alicante.courses.java_.starwarsgame.domain.Tai_Fighter;
import com.everis.alicante.courses.java_.starwarsgame.domain.X_Wing;

public class CreateController {
	Scanner in = new Scanner(System.in);
	Battle battle = GameMain.getBattle();
	
	public void addRebel() {
		System.out.println("Choose a figther");
		System.out.println("1. Jedi");
		System.out.println("2. X-Wing");
		int option = in.nextInt();
		switch (option) {
		case 1:
			BattleParticipant jedi = new Jedi();
			addToList(jedi);
			break;
		case 2:
			BattleParticipant x_wing = new X_Wing();
			addToList(x_wing);
			break;
		default:
			break;
		}
	}
	
	public void addEmpire() {
		System.out.println("Choose a figther");
		System.out.println("1. Sith");
		System.out.println("2. Tai Fighter");
		System.out.println("3. ATAT");
		int option = in.nextInt();
		switch (option) {
		case 1:
			BattleParticipant sith = new Sith();
			addToList(sith);
			break;
		case 2:
			BattleParticipant tai_fighter = new Tai_Fighter();
			addToList(tai_fighter);
			break;
		case 3:
			BattleParticipant atat = new ATAT();
			addToList(atat);
			break;
		default:
			break;
		}
	}
	
	public void addToList(BattleParticipant battleParticipant){
		switch (battleParticipant.getFaction()) {
		case REBEL:
			List<BattleParticipant> rebels = battle.getRebels();
			rebels.add(battleParticipant);
			break;
		case EMPIRE:
			List<BattleParticipant> empires = battle.getEmpires();
			empires.add(battleParticipant);
			break;
		default:
			break;
		}
	}
}
