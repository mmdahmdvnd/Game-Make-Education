package com.mmd.educationandroidgame;


import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class WhackAMoleActivityWAMP5 extends Activity {

  private WhackAMoleViewWAMP5 myWhackAMoleView;
 

 /** Called when the activity is first created. */
 @Override
 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);

/* requestWindowFeature(Window.FEATURE_NO_TITLE); 
 getWindow().setFlags
(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
WindowManager.LayoutParams.FLAG_FULLSCREEN);
*/

 setContentView(R.layout.whackamolep5_layout); 
 myWhackAMoleView = (WhackAMoleViewWAMP5) 
findViewById(R.id.mole5); 
 myWhackAMoleView.setKeepScreenOn(true);
 
 setVolumeControlStream(AudioManager.STREAM_MUSIC);
 }
 
 
 
 
@Override 
	public boolean onCreateOptionsMenu(Menu menu) 	{ 		
	  MenuInflater inflate=getMenuInflater(); 		inflate.inflate(R.menu.menu,menu); 		 		return super.onCreateOptionsMenu(menu); 	
	  } 	 	
	  	@Override 	public boolean onOptionsItemSelected(MenuItem item) 	{ 		switch(item.getItemId()) 		{ 	
	  	  	
	  	  	case R.id.item1:	
	  	myWhackAMoleView.soundOn = true;	
	 Toast.makeText(getBaseContext(),"Sound Enabled",Toast.LENGTH_SHORT).show();
	        break;
	           
	  	  	case R.id.item2:
	  	myWhackAMoleView.soundOn = false;
	 Toast.makeText(getBaseContext(),"Sound Disabled",Toast.LENGTH_SHORT).show();	  		 	
	  	  		} 	
	  	  			 	
	return super.onOptionsItemSelected(item); 	} 	
 
 
 
}
