package com.enumdemo;

public enum MovieSeats {
	
	STANDARD(380),PREMIUM(450),RECLINER(150);
	int price;
	private MovieSeats(int price) {
		
		this.price=price;
	}

}
