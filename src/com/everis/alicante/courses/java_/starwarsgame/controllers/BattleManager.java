package com.everis.alicante.courses.java_.starwarsgame.controllers;

import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.java_.starwarsgame.GameMain;
import com.everis.alicante.courses.java_.starwarsgame.domain.Battle;
import com.everis.alicante.courses.java_.starwarsgame.domain.BattleParticipant;

public class BattleManager {
	
	Scanner in = new Scanner(System.in);
	Battle battle = GameMain.getBattle();
	DeleteController deleteController = GameMain.getDeleteController();
	
	
	public void play() {
		//int sumPowerRebels = getPowerRebels();
		//int sumPowerEmpires = getPowerEmpires();
		List<BattleParticipant> empires = battle.getEmpires();
		List<BattleParticipant> rebels = battle.getRebels();
		
		if (rebels.isEmpty() || empires.isEmpty()) {
			
			System.out.println("Add more fighters.");
			
		}else{
			
			double rand = 1 +(Math.random()*(2-1));
			
			if(rand>1.5) {
				hitRebels();
			}else{
				hitEmpires();
			}
			
			if (rebels.size() == 0) {
				System.out.println("EMPIRES WIN");
			}else if(empires.size() == 0) {
				System.out.println("REBELS WIN");
			}
		}
	}
	
	private void hitEmpires() {
		int sumPowerEmpires = getPowerEmpires();
		//List<BattleParticipant> empires = battle.getEmpires();
		List<BattleParticipant> rebels = battle.getRebels();
		int dmgByFighter = sumPowerEmpires / rebels.size();
		System.out.println("Empires is attacking with " + getPowerEmpires()+ " of power");
		
		//Hemos hecho un lambda
		rebels.stream().forEach(rebel -> {
			int rand = (int) (1+(Math.random()*(1.5 -1)));
			rebel.doDamage(rebel.getHp(), dmgByFighter*rand);
			if(rebel.getHp() <= 0) {
				rebels.remove(rebel);
				System.out.println("1 " + rebel.getName()+ " has been defeated");
			}
		});
		
		//termina un lambda
		
		
		for (int i = 0; i< rebels.size(); i++) {
			int rand = (int) (1+(Math.random()*(1.5 -1)));
			BattleParticipant rebel = rebels.get(i);
			rebel.doDamage(rebel.getHp(), dmgByFighter*rand);
			if(rebel.getHp() <= 0) {
				rebels.remove(rebel);
				System.out.println("1 " + rebel.getName()+ " has been defeated");
			}
			
		}
		
		System.out.println("Empires have " + getHpEmpires() +" HP ********* Rebels have " +getHpRebels() +"HP");
		
		if(rebels.size() !=0) {
			System.out.println("PRESS 1 TO CONTINUE");
			System.out.println("PRESS 2 TO EXIT");
			int option = in.nextInt();
			
			switch (option) {
			case 1:
				hitRebels();
				break;
			case 2:
				System.exit(0);
				break;
			default:
				break;
			}
		}
		
		
	}

	private void hitRebels() {
		int sumPowerRebels = getPowerRebels();
		List<BattleParticipant> empires = battle.getEmpires();
		//List<BattleParticipant> rebels = battle.getRebels();
		int dmgByFighter = sumPowerRebels / empires.size();
		System.out.println("Rebels is attacking with " + getPowerRebels()+ " of power");
		
		for (int i = 0; i< empires.size(); i++) {
			int rand = (int) (1+(Math.random()*(1.5 -1)));
			BattleParticipant empire = empires.get(i);
			empire.doDamage(empire.getHp(), dmgByFighter*rand);
			if(empire.getHp() <= 0) {
				empires.remove(empire);
				System.out.println("1 " + empire.getName()+ " has been defeated");
			}
			
		}
		
		System.out.println("Empires have " + getHpEmpires() +" HP ********* Rebels have " +getHpRebels() +"HP");
		
		if(empires.size() !=0) {
			System.out.println("PRESS 1 TO CONTINUE");
			System.out.println("PRESS 2 TO EXIT");
			int option = in.nextInt();
			
			switch (option) {
			case 1:
				hitEmpires();
				break;
			case 2:
				System.exit(0);
				break;
			default:
				break;
			}
		}
		
	}

	public void addFighter() {
		int option = GameMain.subMenu();
		switch (option) {
		case 1:
			GameMain.getCreateController().addRebel();
			break;
		case 2:
			GameMain.getCreateController().addEmpire();
			break;
		default:
			break;
		}
	}
	
	public void deleteFighter() {
		int option = GameMain.subMenu();
		switch (option) {
		case 1:
			GameMain.getDeleteController().deleteRebel();
			break;
		case 2:
			GameMain.getDeleteController().deleteEmpire();
			break;
		default:
			break;
		}
	}

	public void listBand() {
		int option = GameMain.subMenu();
		switch (option) {
		case 1:
			GameMain.getListController().listRebel();
			break;
		case 2:
			GameMain.getListController().listEmpire();
			break;

		default:
			break;
		}
	}
	
	public int getPowerRebels() {
		List<BattleParticipant> rebels = battle.getRebels();
		int sumPowerRebels = 0;
		for (int i = 0; i < rebels.size(); i++) {
			sumPowerRebels = sumPowerRebels + rebels.get(i).getPower();
		}
		return sumPowerRebels;
	}
	
	public int getPowerEmpires() {
		List<BattleParticipant> empires = battle.getEmpires();
		int sumPowerEmpires = 0;
		for (int i = 0; i < empires.size(); i++) {
			sumPowerEmpires = sumPowerEmpires + empires.get(i).getPower();
		}
		return sumPowerEmpires;
	}
	
	public int getHpRebels() {
		List<BattleParticipant> rebels = battle.getRebels();
		int sumHpRebels = 0;
		for (int i = 0; i < rebels.size(); i++) {
			sumHpRebels = sumHpRebels + rebels.get(i).getHp();
		}
		return sumHpRebels;
	}
	
	public int getHpEmpires() {
		List<BattleParticipant> empires = battle.getEmpires();
		int sumHpEmpires = 0;
		for (int i = 0; i < empires.size(); i++) {
			sumHpEmpires = sumHpEmpires + empires.get(i).getHp();
		}
		return sumHpEmpires;
	}
	

}
