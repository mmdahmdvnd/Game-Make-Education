package com.mmd.educationandroidgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class WhackAMoleActivityWAMP2 extends Activity {

 private WhackAMoleViewWAMP2 myWhackAMoleView2;
 /** Called when the activity is first created. */
 @Override
 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 requestWindowFeature(Window.FEATURE_NO_TITLE); 
 getWindow().setFlags
(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
WindowManager.LayoutParams.FLAG_FULLSCREEN);
 setContentView(R.layout.whackamolep2_layout); 
 myWhackAMoleView2 = (WhackAMoleViewWAMP2) 
findViewById(R.id.mole2); 
 myWhackAMoleView2.setKeepScreenOn(true);
 }
}
