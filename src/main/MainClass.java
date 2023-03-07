package main;
import java.util.*;
//import java.util.Scanner;

import gamePlay.*;
import winning.winningCondition;
public class MainClass {
	control controlObj=new control();
	public static Stack<String> movesList=new Stack<String>(); 
	public static int lock;
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] aa) {
		Thread t1=new Thread();
		t1.start();
		moves main=new moves();
		main.helpBoard();
		main.turnChoice();
		lock=0;
		while(lock!=-2) {
			main.swiftTurn();
//	
				main.board();
				main.playersMove();

			if(new winningCondition().winningCheck()) {
				break;
			}
			

	
			if(movesList.size()==9) {
				lock=-2;
				System.out.println("tie the match");
			}
		
		}
				
		}
		
		
	}
	
	
	
	

