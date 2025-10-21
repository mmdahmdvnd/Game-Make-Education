package com.mmd.educationandroidgame;

import android.graphics.Bitmap;

public class CardCrz8P7 {
 private int id;
 private int suit;
 private int rank;
 private Bitmap bmp;
 
 public CardCrz8P7(int newId) {
 id = newId;
 suit = Math.round((id/100) * 100); 
 rank = id - suit; 
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
