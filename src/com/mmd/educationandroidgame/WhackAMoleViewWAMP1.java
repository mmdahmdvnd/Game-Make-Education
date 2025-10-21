package com.mmd.educationandroidgame;

import com.mmd.educationandroidgame.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class WhackAMoleViewWAMP1 extends SurfaceView implements 
SurfaceHolder.Callback {

 private Context myContext; 
 private SurfaceHolder mySurfaceHolder;
 private Bitmap backgroundImg;
 private int screenW = 1;
 private int screenH = 1;
 private boolean running = false;
 private boolean onTitle = true;
 private WhackAMoleThread thread;
 
 public WhackAMoleViewWAMP1(Context context, 
AttributeSet attrs) {
 super(context, attrs);
 SurfaceHolder holder = getHolder();
 holder.addCallback(this);
 thread = new WhackAMoleThread(holder, context, 
new Handler() {
 @Override
  
public void handleMessage(Message m) {
 }
 });
 setFocusable(true);
 }
 public WhackAMoleThread getThread() { 
 return thread;
 }
 
class WhackAMoleThread extends Thread {
		
        public WhackAMoleThread(SurfaceHolder surfaceHolder, Context context,
                Handler handler) {
            mySurfaceHolder = surfaceHolder;
            myContext = context;
            backgroundImg = BitmapFactory.decodeResource(context.getResources(), R.drawable.title);
    		
        }
        
        @Override
        public void run() {
            while (running) {
                Canvas c = null;
                try {
                    c = mySurfaceHolder.lockCanvas(null);
                    synchronized (mySurfaceHolder) {
         
                        draw(c);
                    }
                } finally {
                    if (c != null) {
                        mySurfaceHolder.unlockCanvasAndPost(c);
                    }
                }
            }
        }
    
 private void draw(Canvas canvas) {
 try {
 canvas.drawBitmap(backgroundImg, 0, 0, 
null);
 } catch (Exception e) {
 }
 }
 boolean doTouchEvent(MotionEvent event) {
 synchronized (mySurfaceHolder) {
 int eventaction = event.getAction();
 int X = (int)event.getX();
 int Y = (int)event.getY();
 switch (eventaction ) {
 case MotionEvent.ACTION_DOWN:
 break;
 case MotionEvent.ACTION_MOVE:
 break;
 case MotionEvent.ACTION_UP:
 if (onTitle) {
 backgroundImg = 
BitmapFactory.decodeResource
(myContext.getResources(), 
R.drawable.background);
 backgroundImg = 
Bitmap.createScaledBitmap(backgroundImg,
 screenW, screenH, true);
 onTitle = false;
 }
 break;
 }
 }
 return true;
 }
 public void setSurfaceSize(int width,
int height) { 
 synchronized (mySurfaceHolder) {
 screenW = width;
 screenH = height;
 backgroundImg = Bitmap.createScaledBitmap(
backgroundImg, width, height, 
true);
 }
 }
 public void setRunning(boolean b) {
 running = b;
 }
 }
 @Override
 public boolean onTouchEvent(MotionEvent event) {
   return thread.doTouchEvent(event);
 }
 @Override
 public void surfaceChanged(SurfaceHolder holder, int 
format, int width, int height) {
 thread.setSurfaceSize(width, height);
 }
 @Override
 public void surfaceCreated(SurfaceHolder holder) {
 thread.setRunning(true);
 if (thread.getState() == Thread.State.NEW) { 
thread.start();
 }
 }
 @Override
 public void surfaceDestroyed(SurfaceHolder holder) {
 thread.setRunning(false);
 }
 
 

}
 
