package com.everis.alicante.courses.java_.starwarsgame.controllers;

import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.java_.starwarsgame.GameMain;
import com.everis.alicante.courses.java_.starwarsgame.domain.Battle;
import com.everis.alicante.courses.java_.starwarsgame.domain.BattleParticipant;

public class DeleteController {
	Scanner in = new Scanner(System.in);
	Battle battle = GameMain.getBattle();
	
	public void deleteEmpire() {
		List<BattleParticipant> empires = battle.getEmpires();
		if (!empires.isEmpty()) {
			System.out.println("Choose a figther you want to delete");
			System.out.println("1. Sith");
			System.out.println("2. Tai Fighter");
			System.out.println("3. ATAT");
			int option = in.nextInt();
			switch (option) {
			case 1:
				for (int i = 0; i < empires.size(); i++) {
					if ("Sith".equals(empires.get(i).getName())) {
						empires.remove(i);
						i = empires.size();
					} else {
						System.out.println("There are not Siths to delete");
						i = empires.size();
					}
				}
				break;
			case 2:
				for (int i = 0; i < empires.size(); i++) {
					if ("Tai-Fighter".equals(empires.get(i).getName())) {
						empires.remove(i);
						i = empires.size();
					} else {
						System.out.println("There are not Tai-Fighters to delete");
						i = empires.size();
					}
				}
				break;
			case 3:
				for (int i = 0; i < empires.size(); i++) {
					if ("ATAT".equals(empires.get(i).getName())) {
						empires.remove(i);
						i = empires.size();
					} else {
						System.out.println("There are not ATATs to delete");
						i = empires.size();
					}
				}
			default:
				break;
			}
		} else {
			System.out.println("This band is empty");
		}
		
	}
	
	public void deleteRebel() {
		List<BattleParticipant> rebels = battle.getRebels();
		if (!rebels.isEmpty()) {
			System.out.println("Choose a figther you want to delete");
			System.out.println("1. Jedi");
			System.out.println("2. X-Wing");
			System.out.println("3. ");
			int option = in.nextInt();
			switch (option) {
			case 1:
				for (int i = 0; i < rebels.size(); i++) {
					if ("Jedi".equals(rebels.get(i).getName())) {
						rebels.remove(i);
						i = rebels.size();
					} else {
						System.out.println("There are not Jedis to delete");
						i = rebels.size();
					}
				}
				break;
			case 2:
				for (int i = 0; i < rebels.size(); i++) {
					if ("X-Wing".equals(rebels.get(i).getName())) {
						rebels.remove(i);
						i = rebels.size();
					} else {
						System.out.println("There are not X-Wings to delete");
						i = rebels.size();
					}
				}
				break;
			case 3:
				for (int i = 0; i < rebels.size(); i++) {
					if ("".equals(rebels.get(i).getName())) {
						rebels.remove(i);
						i = rebels.size();
					}
				}
			default:
				break;
			}
		} else {
			System.out.println("This band is empty");
		}
	}
}
