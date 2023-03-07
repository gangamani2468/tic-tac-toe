package winning;

import gamePlay.moves;
import main.MainClass;

public class winningCondition {
	
	public boolean winningCheck() {
		if(moves.controlObj.getOne()=="X"&&moves.controlObj.getTwo()=="X"&&moves.controlObj.getThree()=="X"||moves.controlObj.getFour()=="X"&&moves.controlObj.getFive()=="X"&&moves.controlObj.getSix()=="X"||moves.controlObj.getSeven()=="X"&&moves.controlObj.getEight()=="X"&&moves.controlObj.getNine()=="X"||moves.controlObj.getOne()=="X"&&moves.controlObj.getFour()=="X"&&moves.controlObj.getSeven()=="X"||moves.controlObj.getTwo()=="X"&&moves.controlObj.getFive()=="X"&&moves.controlObj.getEight()=="X"||moves.controlObj.getThree()=="X"&&moves.controlObj.getSix()=="X"&&moves.controlObj.getNine()=="X"||moves.controlObj.getOne()=="X"&&moves.controlObj.getFive()=="X"&&moves.controlObj.getNine()=="X"||moves.controlObj.getThree()=="X"&&moves.controlObj.getFive()=="X"&&moves.controlObj.getSeven()=="X") {
			System.out.println("X is win...");
			MainClass.lock=-2;
			return true;
		}
		else if(moves.controlObj.getOne()=="O"&&moves.controlObj.getTwo()=="O"&&moves.controlObj.getThree()=="O"||moves.controlObj.getFour()=="O"&&moves.controlObj.getFive()=="O"&&moves.controlObj.getSix()=="O"||moves.controlObj.getSeven()=="O"&&moves.controlObj.getEight()=="O"&&moves.controlObj.getNine()=="O"||moves.controlObj.getOne()=="O"&&moves.controlObj.getFour()=="O"&&moves.controlObj.getSeven()=="O"||moves.controlObj.getTwo()=="O"&&moves.controlObj.getFive()=="O"&&moves.controlObj.getEight()=="O"||moves.controlObj.getThree()=="O"&&moves.controlObj.getSix()=="O"&&moves.controlObj.getNine()=="O"||moves.controlObj.getOne()=="O"&&moves.controlObj.getFive()=="O"&&moves.controlObj.getNine()=="O"||moves.controlObj.getThree()=="O"&&moves.controlObj.getFive()=="O"&&moves.controlObj.getSeven()=="O") {
			System.out.println("O is win...");
			MainClass.lock=-2;
			return true;
		
		}
		return false;
	}
}
