package chapter05;

public class SimpleDotComGame {

	public static void main(String[] args) {
		int numOfGuess = 0;
		
		GameHelper helper = new GameHelper();
		simpleDotCom myDotCom = new simpleDotCom();
		int firstCell = (int) (Math.random()*5);
		int [] myDotComLocation = {firstCell,firstCell+1,firstCell+2};
		myDotCom.setLocation(myDotComLocation);
		
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
