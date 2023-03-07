package gamePlay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import main.MainClass;

public class moves {
	
	public static control controlObj=new control();
	public MainClass main=new MainClass();
	static Scanner sc =new Scanner(System.in);

//	public moves move=null;
	public moves() {
//		controlObj=new control();
//		main=new MainClass();
//		this.move=new moves();
	}
	 public void helpBoard() {
			System.out.println("-------------------------------Help Board--------------------------- \ngive numbers like this  ");
			System.out.println(" ___ ___ ___");
			System.out.println("| "+"1"+" | "+"2"+" | "+"3"+" |");
			System.out.println(" --- --- ---");
			System.out.println("| "+"4"+" | "+"5"+" | "+"6"+" |");
			System.out.println(" --- --- ---");
			System.out.println("| "+"7"+" | "+"8"+" | "+"9"+" |");
			System.out.println(" ‾‾‾ ‾‾‾ ‾‾‾");
		}
	 public void turnChoice() {
		 InputStreamReader read=new InputStreamReader(System.in);
		 BufferedReader  br =new BufferedReader(read);
			System.out.println("Select your choice \n option \nX-->1\nO-->others(any key word)");
			String turn="";
			try {
				turn = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(turn=="1") {
				controlObj.setTurn("X");
			}
			else {
				controlObj.setTurn("O");
			}
			
			
			
		}
	 public void board() {
			
			System.out.println(controlObj.getTurn()+" Turn");
			System.out.println(" ___ ___ ___");
			System.out.println("| "+controlObj.getOne()+" | "+controlObj.getTwo()+" | "+controlObj.getThree()+" |");
			System.out.println(" --- --- ---");
			System.out.println("| "+controlObj.getFour()+" | "+controlObj.getFive()+" | "+controlObj.getSix()+" |");
			System.out.println(" --- --- ---");
			System.out.println("| "+controlObj.getSeven()+" | "+controlObj.getEight()+" | "+controlObj.getNine()+" |");
			System.out.println(" ‾‾‾ ‾‾‾ ‾‾‾");
		}
	 public void swiftTurn() {
		 if(controlObj.getTurn()=="X")
			 controlObj.setTurn("O");
		 else if(controlObj.getTurn()=="O")
			 controlObj.setTurn("X");
	 }
	 public void playersMove() {
		 String choice;
		 //	
		 System.out.println("Select your Choice\n1  2  3\n4  5  6\n7  8  9\n ");
		 choice=sc.nextLine();
//	
		 moves move=new moves();

	
		 main.movesList.add(choice);
		 if(choice.equals("1")&&controlObj.getOne().equals(" ")) {
			controlObj.setOne(controlObj.getTurn()); 
		 	}
		 else if(choice.equals("2")&&controlObj.getTwo().equals(" "))
			 controlObj.setTwo(controlObj.getTurn());	 
		 else if(choice.equals("3")&&controlObj.getThree().equals(" "))
			 controlObj.setThree(controlObj.getTurn());
		 else if(choice.equals("4")&&controlObj.getFour().equals(" "))
			 controlObj.setFour(controlObj.getTurn());
		 else if(choice.equals("5")&&controlObj.getFive().equals(" "))
			 controlObj.setFive(controlObj.getTurn());
		 else if(choice.equals("6")&&controlObj.getSix().equals(" "))
			 controlObj.setSix(controlObj.getTurn());	 	 	 
		 else if(choice.equals("7")&&controlObj.getSeven().equals(" "))
			 controlObj.setSeven(controlObj.getTurn());	
		 else if(choice.equals("8")&&controlObj.getEight().equals(" "))
			 controlObj.setEight(controlObj.getTurn());	
		 else if(choice.equals("9")&&controlObj.getNine().equals(" "))
			 controlObj.setNine(controlObj.getTurn());
		
		 else {
			 main.movesList.pop();
			 System.out.println("you given input is invalid");
			 move.playersMove();
			 }
		 new moves().options();
	 }
	 public void undo() {
		 String remove=main.movesList.pop();
		 System.out.println(remove);
		 if(remove.equals("1")&&!controlObj.getOne().equals(" ")) 
			 controlObj.setOne(" "); 	 	
		 else if(remove.equals("2")&&!controlObj.getTwo().equals(" "))
			 controlObj.setTwo(" ");	 
		 else if(remove.equals("3")&&!controlObj.getThree().equals(" "))
			 controlObj.setThree(" ");
		 else if(remove.equals("4")&&!controlObj.getFour().equals(" "))
			 controlObj.setFour(" ");
		 else if(remove.equals("5")&&!controlObj.getFive().equals(" "))
			 controlObj.setFive(" ");
		 else if(remove.equals("6")&&!controlObj.getSix().equals(" "))
			 controlObj.setSix(" ");	 	 	 
		 else if(remove.equals("7")&&!controlObj.getSeven().equals(" "))
			 controlObj.setSeven(" ");	
		 else if(remove.equals("8")&&!controlObj.getEight().equals(" "))
			 controlObj.setEight(" ");	
		 else if(remove.equals("9")&&!controlObj.getNine().equals(" "))
			 controlObj.setNine(" ");
		 
		 new moves().swiftTurn();
	 }
	 public void options() {
		 while(true) {
			 
		moves move=	new moves();
			move.board();
		 System.out.println("options \n1-->undo\nany key-->continue");
		 String option=sc.nextLine();
		 if(option.equals("1")) {
			 new moves().undo();
			 break;
		 }
		 else {
			 break;
		 }
		 
		 }
	 }
}
