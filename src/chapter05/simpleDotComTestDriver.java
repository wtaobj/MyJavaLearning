package chapter05;

public class simpleDotComTestDriver {

	public static void main(String[] args) {
		simpleDotCom testSDC = new simpleDotCom();
		
		int [] location = {2,3,4};
		testSDC.setLocation(location);
		String guess = "3";
		String result = testSDC.checkYouSelf(guess);
	}

}
