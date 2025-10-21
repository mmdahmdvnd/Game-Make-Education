package com.mmd.educationandroidgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;



public class WhackAMoleActivityWAMP3 extends Activity {

 private WhackAMoleViewWAMP3 myWhackAMoleView;
 /** Called when the activity is first created. */
 @Override
 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 requestWindowFeature(Window.FEATURE_NO_TITLE); 
 getWindow().setFlags
(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
WindowManager.LayoutParams.FLAG_FULLSCREEN);
 setContentView(R.layout.whackamolep3_layout); 
 myWhackAMoleView = (WhackAMoleViewWAMP3) 
findViewById(R.id.mole3); 
 myWhackAMoleView.setKeepScreenOn(true);
 }
}
