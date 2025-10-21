package com.mmd.educationandroidgame;

import android.graphics.Bitmap;

public class CardCrz8P9 {

	private int id;
	private int suit;
	private int rank;
	private Bitmap bmp;
	private int scoreValue;
	
	public CardCrz8P9(int newId) {
		id = newId;
		suit = Math.round((id/100) * 100);
		rank = id - suit; 
		if (rank == 8) {
			scoreValue = 50;
		} else if (rank == 14) {
			scoreValue = 1;
		} else if (rank > 9 && rank < 14) {
			scoreValue = 10;
		} else {
			scoreValue = rank;
		}
	}

	public int getScoreValue() {
		return scoreValue;
	}
	
	public void setBitmap(Bitmap newBitmap) {
		bmp = newBitmap; 
	}
	
	public Bitmap getBitmap() {
		return bmp;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getRank() {
		return rank;
	}
	

}



