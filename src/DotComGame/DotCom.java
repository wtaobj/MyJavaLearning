package DotComGame;

import java.util.ArrayList;

public class DotCom {
	ArrayList<String> locationCells;
	
	public String checkYouSelf(String stringGuess){
		
		String result = "miss";
		
		if (locationCells.contains(stringGuess)){
			int index = locationCells.indexOf(stringGuess);
			if (index >= 0) {
				locationCells.remove(index);
				if (locationCells.size()==0){
					result = "kill";
				}else result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}
	public void setLocation(ArrayList<String> loc){
		locationCells=loc;
	}
}
