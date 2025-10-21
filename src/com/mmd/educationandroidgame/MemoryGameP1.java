package com.mmd.educationandroidgame;


import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class MemoryGameP1 extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.memorygamepart1);
       
        TextView url = ((TextView)findViewById(R.id.myWebSite));
        Linkify.addLinks(url, Linkify.WEB_URLS);
        
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
	  			//newGame(x,y);
	  			
	  		}


			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
				
			}

	  	});
    }
    
   
    
    
}
