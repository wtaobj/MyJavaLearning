package chapter06;

import java.util.ArrayList;

public class DotCom {
	String dotComName;
	ArrayList<String> locationCells;
	
	public void setName(String name){
		dotComName = name;
	}
	
	public void setLocation(ArrayList<String> loc){
		locationCells = loc;
	}
	
	public String checkYouSelf(String guess){
		String result = "miss";
		if (locationCells.contains(guess)){
			//result = "hit";
			if (locationCells.size() > 0){
				locationCells.remove(locationCells.indexOf(guess));
				result = "hit";
			}else result = "kill";
		}
		System.out.println(result);
		return result;
	}

}
