package myApp;

public class myWishItem {
	 String name;
	 int price;
	 String wishDate;
	 String isInPocket;
	 
	public myWishItem(String[] iteminfo){
		
		
		name = iteminfo [0];
		price = Integer.valueOf(iteminfo [1]);
		wishDate = iteminfo [2];
		isInPocket = iteminfo [3];
	}
}
