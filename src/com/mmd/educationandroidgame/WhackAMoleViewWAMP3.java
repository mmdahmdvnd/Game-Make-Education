package com.mmd.educationandroidgame;

import java.util.Random;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Random;

public class WhackAMoleViewWAMP3 extends SurfaceView implements SurfaceHolder.Callback {
    
    private Context myContext;
    private SurfaceHolder mySurfaceHolder;
    private Bitmap backgroundImg;
    private int backgroundOrigW;
    private int backgroundOrigH;
    private float scaleW;
    private float scaleH;
    private float drawScaleW;
    private float drawScaleH;
    private Bitmap mask;
    private Bitmap mole;
    private int mole1x, mole2x, mole3x, mole4x, mole5x, mole6x, mole7x;
    private int mole1y, mole2y, mole3y, mole4y, mole5y, mole6y, mole7y;
    private int screenW = 1;
    private int screenH = 1;
    private boolean running = false;
    private boolean onTitle = true;
  
    private WhackAMoleThread3 thread3;
    
    private int activeMole = 0;
    private boolean moleRising = true;
    private boolean moleSinking = false;
    private int moleRate = 5;
    private boolean moleJustHit = false;
	
	public WhackAMoleViewWAMP3(Context context, AttributeSet attrs) {
        super(context, attrs);

        SurfaceHolder holder = getHolder();
        holder.addCallback(this);

        thread3 = new WhackAMoleThread3(holder, context, new Handler() {
            @Override
            public void handleMessage(Message m) {
            }
        });

        setFocusable(true); 
    }
    
    
    
    
    

	public WhackAMoleThread3 getThread() {
		return thread3;
	}
	
	
	
	
	
	
	class WhackAMoleThread3 extends Thread {
		
        public WhackAMoleThread3(SurfaceHolder surfaceHolder, Context context,
                Handler handler) {
            mySurfaceHolder = surfaceHolder;
            myContext = context;
            backgroundImg = BitmapFactory.decodeResource(context.getResources(), R.drawable.title);
    		backgroundOrigW = backgroundImg.getWidth();
    		backgroundOrigH = backgroundImg.getHeight(); 	
        }
        @Override
        public void run() {
            while (running) {
                Canvas c = null;
                try {
                    c = mySurfaceHolder.lockCanvas(null);
                    synchronized (mySurfaceHolder) {
                      
               animateMoles();  
                 
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
        		canvas.drawBitmap(backgroundImg, 0, 0, null);
        		if (!onTitle) {
            		
            		canvas.drawBitmap(mole, mole1x, mole1y, null);
                    canvas.drawBitmap(mole, mole2x, mole2y, null);
                    canvas.drawBitmap(mole, mole3x, mole3y, null);
                    canvas.drawBitmap(mole, mole4x, mole4y, null);
                    canvas.drawBitmap(mole, mole5x, mole5y, null);
                    canvas.drawBitmap(mole, mole6x, mole6y, null);
                    canvas.drawBitmap(mole, mole7x, mole7y, null); 
                    
            		canvas.drawBitmap(mask, (int) 50*drawScaleW, (int) 450*drawScaleH, null);
            		canvas.drawBitmap(mask, (int)150*drawScaleW, (int) 400*drawScaleH, null);
                    canvas.drawBitmap(mask, (int)250*drawScaleW, (int) 450*drawScaleH, null);
            		canvas.drawBitmap(mask, (int)350*drawScaleW, (int) 400*drawScaleH, null);
                    canvas.drawBitmap(mask, (int)450*drawScaleW, (int) 450*drawScaleH, null);
            		canvas.drawBitmap(mask, (int)550*drawScaleW, (int) 400*drawScaleH, null);
                    canvas.drawBitmap(mask, (int)650*drawScaleW, (int) 450*drawScaleH, null);        			
                    
        		}
             
             
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
    	        		backgroundImg = BitmapFactory.decodeResource(myContext.getResources(), R.drawable.background);
    	        		backgroundImg = Bitmap.createScaledBitmap(backgroundImg, screenW, screenH, true);
    	                mask = BitmapFactory.decodeResource(myContext.getResources(), R.drawable.mask);
    	                mole = BitmapFactory.decodeResource(myContext.getResources(), R.drawable.mole);
    	            
    	                scaleW = (float) screenW/ (float) backgroundOrigW;
    	                scaleH = (float) screenH/ (float) backgroundOrigH;
    	                mask = Bitmap.createScaledBitmap(mask, (int)(mask.getWidth()*scaleW), (int)(mask.getHeight()*scaleH), true);
    	                mole = Bitmap.createScaledBitmap(mole, (int)(mole.getWidth()*scaleW), (int)(mole.getHeight()*scaleH), true);
    	                
    	      onTitle = false;
        
    	      pickActiveMole();
    	      
    	        	break;   	
    	    } 	
    	        }
    	    }
            return true;
        }
        
        
        
        
        
        public void setSurfaceSize(int width, int height) {
            synchronized (mySurfaceHolder) {
                screenW = width;
                screenH = height;
                backgroundImg = Bitmap.createScaledBitmap(backgroundImg, width, height, true);
                drawScaleW = (float) screenW / 800;
                drawScaleH = (float) screenH / 600;
        		mole1x = (int) (55*drawScaleW);
        		mole2x = (int) (155*drawScaleW);
        		mole3x = (int) (255*drawScaleW);
        		mole4x = (int) (355*drawScaleW);
        		mole5x = (int) (455*drawScaleW);
        		mole6x = (int) (555*drawScaleW);
        		mole7x = (int) (655*drawScaleW);
        		mole1y = (int) (475*drawScaleH);
        		mole2y = (int) (425*drawScaleH);
        		mole3y = (int) (475*drawScaleH);
        		mole4y = (int) (425*drawScaleH);
        		mole5y = (int) (475*drawScaleH);
        		mole6y = (int) (425*drawScaleH);
        		mole7y = (int) (475*drawScaleH);
        	
            }
        }




        public void setRunning(boolean b) {
            running = b;
        }
       
       
       
       
       
         private void animateMoles() {
        	if (activeMole == 1) {
        		if (moleRising) {
            		mole1y -= moleRate;        			
        		} else if (moleSinking) {
        			mole1y += moleRate;
        		}
        		if (mole1y >= (int) (475*drawScaleH) || moleJustHit) {
        			mole1y = (int) (475*drawScaleH);
        			pickActiveMole();
        		}
        		if (mole1y <= (int) (300*drawScaleH)) {
        			mole1y = (int) (300*drawScaleH);
        			moleRising = false;
        			moleSinking = true;
        		}
        	}
        	if (activeMole == 2) {
        		if (moleRising) {
            		mole2y -= moleRate;        			
        		} else if (moleSinking) {
        			mole2y += moleRate;
        		}
        		if (mole2y >= (int) (425*drawScaleH) || moleJustHit) {
        			mole2y = (int) (425*drawScaleH);
        			pickActiveMole();
        		}
        		if (mole2y <= (int) (250*drawScaleH)) {
        			mole2y = (int) (250*drawScaleH);
        			moleRising = false;
        			moleSinking = true;
        		}
        	}
        	if (activeMole == 3) {
        		if (moleRising) {
            		mole3y -= moleRate;        			
        		} else if (moleSinking) {
        			mole3y += moleRate;
        		}
        		if (mole3y >= (int) (475*drawScaleH) || moleJustHit) {
        			mole3y = (int) (475*drawScaleH);
        			pickActiveMole();
        		}
        		if (mole3y <= (int) (300*drawScaleH)) {
        			mole3y = (int) (300*drawScaleH);
        			moleRising = false;
        			moleSinking = true;
        		}
        	}
        	if (activeMole == 4) {
        		if (moleRising) {
            		mole4y -= moleRate;        			
        		} else if (moleSinking) {
        			mole4y += moleRate;
        		}
        		if (mole4y >= (int) (425*drawScaleH) || moleJustHit) {
        			mole4y = (int) (425*drawScaleH);
        			pickActiveMole();
        		}
        		if (mole4y <= (int) (250*drawScaleH)) {
        			mole4y = (int) (250*drawScaleH);
        			moleRising = false;
        			moleSinking = true;
        		}
        	}
        	if (activeMole == 5) {
        		if (moleRising) {
            		mole5y -= moleRate;        			
        		} else if (moleSinking) {
        			mole5y += moleRate;
        		}
        		if (mole5y >= (int) (475*drawScaleH) || moleJustHit) {
        			mole5y = (int) (475*drawScaleH);
        			pickActiveMole();
        		}
        		if (mole5y <= (int) (300*drawScaleH)) {
        			mole5y = (int) (300*drawScaleH);
        			moleRising = false;
        			moleSinking = true;
        		}
        	}
        	if (activeMole == 6) {
        		if (moleRising) {
            		mole6y -= moleRate;        			
        		} else if (moleSinking) {
        			mole6y += moleRate;
        		}
        		if (mole6y >= (int) (425*drawScaleH) || moleJustHit) {
        			mole6y = (int) (425*drawScaleH);
        			pickActiveMole();
        		}
        		if (mole6y <= (int) (250*drawScaleH)) {
        			mole6y = (int) (250*drawScaleH);
        			moleRising = false;
        			moleSinking = true;
        		}
        	}
        	if (activeMole == 7) {
        		if (moleRising) {
            		mole7y -= moleRate;        			
        		} else if (moleSinking) {
        			mole7y += moleRate;
        		}
        		if (mole7y >= (int) (475*drawScaleH) || moleJustHit) {
        			mole7y = (int) (475*drawScaleH);
        			pickActiveMole();
        		}
        		if (mole7y <= (int) (300*drawScaleH)) {
        			mole7y = (int) (300*drawScaleH);
        			moleRising = false;
        			moleSinking = true;
        		}
        	}
        }
       
       
       
       
       
       private void pickActiveMole() {
 activeMole = new Random().nextInt(7) + 1;
 moleRising = true;
 moleSinking = false;
}
       
       
       
        
    }
	
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return thread3.doTouchEvent(event);
    }
	
	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		thread3.setSurfaceSize(width, height);
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder){
		thread3.setRunning(true);
		if (thread3.getState() == Thread.State.NEW ){
			thread3.start();
		}
	}
	
	@Override
    public void surfaceDestroyed(SurfaceHolder holder) {
      thread3.setRunning(false);
    }
	
	

	
}
