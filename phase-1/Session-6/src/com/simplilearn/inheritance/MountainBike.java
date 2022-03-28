package com.simplilearn.inheritance;

public class MountainBike extends Bicycle {
	
	private int seatHeight;
	
	public MountainBike(int gear, int speed,int seatHeight) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		this.seatHeight=seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "MountainBike ["+super.toString()+"\n SeatHeight="+ seatHeight+"]";
	}
	
	

	
	
	

}
