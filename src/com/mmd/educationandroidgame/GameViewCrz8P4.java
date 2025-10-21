package com.mmd.educationandroidgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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


public class GameViewCrz8P4 extends View{
  
  private Context myContext;
  private List<CardCrz8P4> deck = new ArrayList<CardCrz8P4>();
  private int scaledCardW;
  private int scaledCardH;
  private int screenW;
  private int screenH;
  
  
  public GameViewCrz8P4(Context context){
    super(context);
    myContext = context;
  }
  
  
  
    @Override
    public void onSizeChanged (int w, int h, int oldw, int oldh){
        super.onSizeChanged(w, h, oldw, oldh);
        screenW = w;
        screenH = h;
     
     initCards();
       }
       
       
  
  
  protected void onDraw(Canvas canvas){
    canvas.drawRGB(219,207,0);
    canvas.drawBitmap(deck.get(0).getBitmap(), 0, 0, null);
  }
  
  
  
  
	private void initCards() {
		for (int i = 0; i < 4; i++) {
			for (int j = 102; j < 115; j++) {
				int tempId = j + (i*100);
				CardCrz8P4 tempCard = new CardCrz8P4(tempId);
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
  
  
  
  
}
