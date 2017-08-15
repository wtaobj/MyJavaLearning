package chapter06;

import java.util.ArrayList;

public class DotComBust {

	public static void main(String[] args) {
		
		    GameHelper dotComHelp = new GameHelper();
		
			ArrayList <DotCom> dotComList= new ArrayList <DotCom>();
			
		    for 
		    DotCom dotCom1 = new DotCom();
			dotCom1.setName("Go2.com");
			dotCom1.setLocation(dotComHelp.initDotComLocation);
			
			DotCom dotCom2 = new DotCom();
			dotCom2.setName("Pets.com");
			dotCom2.setLocation(dotComHelp.initDotComLocation);
			
			DotCom dotCom3 = new DotCom();
			dotCom3.setName("AskMe.com");
			dotCom3.setLocation(dotComHelp.initDotComLocation);
			
			
			boolean allDotComDead = false;
			while (allDotComDead != true){
			String userGuess = dotComHelp.getUserInput("enter a guess");
			dotCom1.checkYouSelf(userGuess);
			dotCom2.checkYouSelf(userGuess);
			dotCom3.checkYouSelf(userGuess);
			}

	}

}
