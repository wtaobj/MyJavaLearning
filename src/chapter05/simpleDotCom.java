package chapter05;

public class simpleDotCom {
	private int [] locationcells;
	private int numOfHits = 0 ;
	
	public String checkYouSelf(String stringGuess){
		int userGuess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationcells){
			if (cell == userGuess){
			 result = "hit";
			 numOfHits++;
			 break;
			}
		}
		if (numOfHits==locationcells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
	public void setLocation(int [] location){
		locationcells=location;
	}
}
