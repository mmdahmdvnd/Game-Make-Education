package com.mmd.educationandroidgame;




import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.util.Linkify;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class MemoryGameP2 extends Activity {
  private static int ROW_COUNT = -1;
	private static int COL_COUNT = -1;
	private Context context;
	private Drawable backImage;
	private int [] [] cards;
	private List<Drawable> images;
	//private Card firstCard;
	//private Card seconedCard;
	//private ButtonListener buttonListener;
	
	//private static Object lock = new Object();
	
	int turns;
	
	private TableLayout mainTable;
	//private UpdateCardsHandler handler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
      
        
      //  handler = new UpdateCardsHandler();
       // loadImages();
        setContentView(R.layout.memorygamepart1);
       
        TextView url = ((TextView)findViewById(R.id.myWebSite));
        Linkify.addLinks(url, Linkify.WEB_URLS);
        
    backImage =  getResources().getDrawable(R.drawable.backimage);
             
      // buttonListener = new ButtonListener();
        
        mainTable = (TableLayout)findViewById(R.id.TableLayout03p1);
        
        
        context  = mainTable.getContext();
        
        
       	 Spinner s = (Spinner) findViewById(R.id.Spinner01p1);
	        ArrayAdapter adapter = ArrayAdapter.createFromResource(
	                this, R.array.type, android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        s.setAdapter(adapter);
	        
	        
	        s.setOnItemSelectedListener(new OnItemSelectedListener(){
	        	
	    	  @Override
	    	  public void onItemSelected(
	    			  android.widget.AdapterView<?> arg0, 
	    			  View arg1, int pos, long arg3){
	    		  
	    		  ((Spinner) findViewById(R.id.Spinner01p1)).setSelection(0);
	    		  
	  			int x,y;
	  			
	  			switch (pos) {
				case 1:
					x=4;y=4;
					break;
				case 2:
					x=4;y=5;
					break;
				case 3:
					x=4;y=6;
					break;
				case 4:
					x=5;y=6;
					break;
				case 5:
					x=6;y=6;
					break;
				default:
					return;
				}
	  			newGame(x,y);
	  			
	  		}


			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
				
			}

	  	});
    }
////////////// end onCreate () ////////////
    
   
   
   
   
   
   
   
   
   
    private void newGame(int c, int r) {
    	ROW_COUNT = r;
    	COL_COUNT = c;
    	
    	cards = new int [COL_COUNT] [ROW_COUNT];
    	  	
    	mainTable.removeView(findViewById(R.id.TableRow01p1));
    	mainTable.removeView(findViewById(R.id.TableRow02p1));
    	
    	TableRow tr = ((TableRow)findViewById(R.id.TableRow03p1));
    	tr.removeAllViews();
    	
    	mainTable = new TableLayout(context);
    	tr.addView(mainTable);
    	
    	 for (int y = 0; y < ROW_COUNT; y++) {
    		 mainTable.addView(createRow(y));
          }
   
    	
    	 
    	 turns=0;
    	 ((TextView)findViewById(R.id.tv1p1)).setText("Tries: "+turns);		
	}
    
   
   
   
   
   
    
    
    private TableRow createRow(int y){
    	 TableRow row = new TableRow(context);
    	 row.setHorizontalGravity(Gravity.CENTER);
         
         for (int x = 0; x < COL_COUNT; x++) {
		         row.addView(createImageButton(x,y));
         }
         return row;
    }
    
    private View createImageButton(int x, int y){
    	Button button = new Button(context);
    	button.setBackgroundDrawable(backImage);
    	button.setId(100*x+y);
    	//button.setOnClickListener(buttonListener);
    	return button;
    }
   
    
    
    
    
    
    
    
    
}
