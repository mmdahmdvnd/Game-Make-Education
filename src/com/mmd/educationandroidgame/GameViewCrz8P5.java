package com.mmd.educationandroidgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.mmd.educationandroidgame.R;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class GameViewCrz8P5 extends View{
  
  private Context myContext;
  
  private List<CardCrz8P5> deck = new ArrayList<CardCrz8P5>();
  private List<CardCrz8P5> myHand = new ArrayList<CardCrz8P5>();
  private List<CardCrz8P5> oppHand = new ArrayList<CardCrz8P5>();

  private List<CardCrz8P5> discardPile = new ArrayList<CardCrz8P5>();

  private int scaledCardW;
  private int scaledCardH;
  private int screenW;
  private int screenH;
  
  private float scale;
  
  private Paint whitePaint;
  
  private int oppScore;
  private int myScore;
  
  private Bitmap cardBack;
  
  
  public GameViewCrz8P5(Context context){
    super(context);
    myContext = context;
    scale = myContext.getResources().getDisplayMetrics().
density;
 whitePaint = new Paint(); 
 whitePaint.setAntiAlias(true); 
 whitePaint.setColor(Color.WHITE);
 whitePaint.setStyle(Paint.Style.STROKE);
 whitePaint.setTextAlign(Paint.Align.LEFT);
 whitePaint.setTextSize(scale*15);
  }
  
  
  
    @Override
    public void onSizeChanged (int w, int h, int oldw, int oldh){
        super.onSizeChanged(w, h, oldw, oldh);
        screenW = w;
        screenH = h;
     
     initCards();
     
     dealCards();
     
   drawCard(discardPile);
     
     Bitmap tempBitmap = 
BitmapFactory.decodeResource
(myContext.getResources(),
R.drawable.card_back);
scaledCardW = (int) (screenW/8);
scaledCardH = (int) (scaledCardW*1.28);
cardBack = Bitmap.createScaledBitmap
(tempBitmap, scaledCardW, 
scaledCardH,false);
       }
       
       
  
  
  protected void onDraw(Canvas canvas){
    
    canvas.drawRGB(151,160,24);
    
   		canvas.drawText("Computer Score: " + Integer.toString(oppScore), 10, whitePaint.getTextSize()+10, whitePaint);		
		canvas.drawText("My Score: " + Integer.toString(myScore), 10, screenH-whitePaint.getTextSize()-30, whitePaint);
  
  
  
  for (int i = 0; i < myHand.size(); i++) {
 if (i < 7) {
 canvas.drawBitmap(myHand.get(i).getBitmap(),
 i*(scaledCardW+5),
 screenH-scaledCardH-
 whitePaint.getTextSize()-(50*scale),
 null);
 }
 }
 
 for (int i = 0; i < oppHand.size(); i++) {
 canvas.drawBitmap(cardBack,
 i*(scale*5),
 whitePaint.getTextSize()+(50*scale),
 null);
}
 
 
 canvas.drawBitmap(cardBack, 
(screenW/2)-cardBack.getWidth()-10, 
(screenH/2)-(cardBack.getHeight()/2), null);
 
 
 
   if (!discardPile.isEmpty()) {
  canvas.drawBitmap(discardPile.get(0).getBitmap(),
(screenW/2)+10,
(screenH/2)-(cardBack.getHeight()/2),
null);
    } 
 
 
 
 
}
  
  
  
  
	private void initCards() {
		for (int i = 0; i < 4; i++) {
			for (int j = 102; j < 115; j++) {
				int tempId = j + (i*100);
				CardCrz8P5 tempCard = new CardCrz8P5(tempId);
				int resourceId = getResources().getIdentifier("card" + tempId, "drawable", myContext.getPackageName());
				Bitmap tempBitmap = BitmapFactory.decodeResource(myContext.getResources(), resourceId);
		        scaledCardW = (int) (screenW/8);
		        scaledCardH = (int) (scaledCardW*1.28);
				Bitmap scaledBitmap = Bitmap.createScaledBitmap(tempBitmap, scaledCardW, scaledCardH, false); 
				tempCard.setBitmap(scaledBitmap);
				deck.add(tempCard);
			}
		}
	}
  
  
  
  

	private void drawCard(List<CardCrz8P5> handToDraw) {
handToDraw.add(0, deck.get(0));
 deck.remove(0);
		//if (deck.isEmpty()) {
	  // for (int i = discardPile.size()-1; i > 0 ; i--) {
			//	deck.add(discardPile.get(i));
			//	discardPile.remove(i);
			//	Collections.shuffle(deck,new Random());
	//		}
	//	}
	}
	
	private void dealCards() {
		Collections.shuffle(deck,new Random());
		for (int i = 0; i < 7; i++) {
			drawCard(myHand);
			drawCard(oppHand);
			
		}		
	}
  
  
  
  
  
}
