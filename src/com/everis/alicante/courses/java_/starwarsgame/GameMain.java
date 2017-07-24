package com.everis.alicante.courses.java_.starwarsgame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.everis.alicante.courses.java_.starwarsgame.controllers.BattleManager;
import com.everis.alicante.courses.java_.starwarsgame.controllers.CreateController;
import com.everis.alicante.courses.java_.starwarsgame.controllers.DeleteController;
import com.everis.alicante.courses.java_.starwarsgame.controllers.ListController;
import com.everis.alicante.courses.java_.starwarsgame.domain.Battle;
import com.everis.alicante.courses.java_.starwarsgame.domain.BattleParticipant;
import com.everis.alicante.courses.java_.starwarsgame.domain.Jedi;

public class GameMain {
	
	static Battle battle;
	static BattleManager battleManager;
	static CreateController createController;
	static DeleteController deleteController;
	static ListController listController;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		initComponents();
		startGame();
	}
	
	private static void initComponents() {
		battle = new Battle();
		battleManager = new BattleManager();
		createController = new CreateController();
		deleteController = new DeleteController();
		listController = new ListController();
		
		List<BattleParticipant> empires = new ArrayList<BattleParticipant>();
		List<BattleParticipant> rebels = new ArrayList<BattleParticipant>();
		battle.setEmpires(empires);
		battle.setRebels(rebels);
	}
	
	public static Battle getBattle() {
		return battle;
	}
	
	public static BattleManager getBattleManager() {
		return battleManager;
	}
	
	public static CreateController getCreateController() {
		return createController;
	}
	
	public static DeleteController getDeleteController() {
		return deleteController;
	}
	
	public static ListController getListController() {
		return listController;
	}

	public static void startGame() {
		System.out.println("STAR WARS Battle Game, select an option:");
		System.out.println("1. Add a fighter");
		System.out.println("2. Delete a fighter");
		System.out.println("3. List bands");
		System.out.println("4. Play");
		System.out.println("0. Exit");
		int option = in.nextInt();
		switch (option) {
		case 1:
			battleManager.addFighter();
			break;
		case 2:
			battleManager.deleteFighter();
			break;
		case 3:
			battleManager.listBand();
			break;
		case 4:
			battleManager.play();
			break;
		case 0:
			System.exit(0);
			break;
		default:
			break;
		}
		startGame();
	}
	public static int subMenu( ) {
		System.out.println("What faction?");
		System.out.println("1. Rebels");
		System.out.println("2. Empire");
		int option = in.nextInt();
		
		return option;
		
	}
}
