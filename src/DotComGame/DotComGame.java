package DotComGame;

import java.util.ArrayList;

public class DotComGame {

	public static void main(String[] args) {
		int numOfGuess = 0;
		
		GameHelper helper = new GameHelper();
		DotCom myDotCom = new DotCom();
		ArrayList <String> myDotComLocationCells = new ArrayList <String>();
		int firstCell = (int) (Math.random()*5);
		int [] myDotComLocation = {firstCell,firstCell+1,firstCell+2};
		for (int i = 0; i < myDotComLocation.length; i++){
			String emt =Integer.toString(myDotComLocation[i]);
			myDotComLocationCells.add(emt);
		}
		
		myDotCom.setLocation(myDotComLocationCells);
		
		boolean isAlive = true;
		while (isAlive == true){
			String userguess = helper.getUserInput("enter a number");
			String result = myDotCom.checkYouSelf(userguess);
			numOfGuess++;
			if (result=="kill"){
				isAlive=false;
				System.out.println("you took "+numOfGuess+" times to guess");
			}
		}

	}

}
