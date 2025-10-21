package com.mmd.educationandroidgame;

import com.mmd.educationandroidgame.R;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.MotionEvent;
import android.view.View;

public class drawBitmapViewCrz8P2 extends View {

  private Bitmap drawbitmap;
  private int dX;
  private int dY;
  private int screenW;
  private int screenH;
	
	public drawBitmapViewCrz8P2(Context context) {
		super(context);
		  drawbitmap = 
BitmapFactory.decodeResource(getResources(), 
 R.drawable.img1);
	}
	
 @Override
    public void onSizeChanged (int w, int h, int oldw, int oldh){
      super.onSizeChanged(w, h, oldw, oldh);
        screenW = w;
        screenH = h;
    }
    
	 @Override 
	 protected void onDraw(Canvas canvas) {
     canvas.drawRGB(0,0,0);
		canvas.drawBitmap(drawbitmap,dX,dY,null);
	 }
	 
	 public boolean onTouchEvent(MotionEvent event) {
	        int eventaction = event.getAction();   
	        int X = (int)event.getX();
	        int Y = (int)event.getY();

	        switch (eventaction ) {
	        case MotionEvent.ACTION_DOWN: 
	        	break;
	        case MotionEvent.ACTION_MOVE: 
	                 dX = X;
	                 dY = Y;
	        	break;
        	
	        case MotionEvent.ACTION_UP:
	        	break;
	        } 
	        invalidate();
			return true;
        
	}
 
}

