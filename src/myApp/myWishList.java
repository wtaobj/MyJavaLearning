package myApp;

import java.util.ArrayList;
import java.util.Scanner;

public class myWishList {
	
	int mywishlistsize = 0 ;
	
	public ArrayList input(){
		
		System.out.println("Please input the iteminfo of your wish items in this formation:itemName,itemPrice,wishDate,isInPocket");
		System.out.println("Please input 'done' to quit");
		Boolean continuetoinput =true;
		ArrayList<String[]> inputcontent = new ArrayList<>();
		
		while (continuetoinput){
			Scanner in = new Scanner(System.in);
			String readLine = in.nextLine();
			String [] iteminfo = readLine.split(",");
			
			if (!"done".equalsIgnoreCase(readLine)){
				if (iteminfo.length != 4){
					System.out.println("Please input 4 properties: itemName,itemPrice,wishDate,isInPocket");
					System.out.println("And seperate them by comma symbol. Do not input the comma symbol at the end!");
					}else{
						inputcontent.add(iteminfo);
					}
				}else{
			    	System.out.println("bye bye!");
			    	continuetoinput = false;
					 }
		
		}
		return inputcontent;
		
	}
	
	
		
	public void main (String [] args){
		
		ArrayList<String[]> mywishlist = input();//user input wish item list.
		
		
		int index = 0;
		while (index<mywishlist.size())
		myWishItem[] myWL = new myWishItem [mywishlist.size()];
		
		myWL[index]= new myWishItem(mywishlist<index>)
		
			
		
	}
	
}
