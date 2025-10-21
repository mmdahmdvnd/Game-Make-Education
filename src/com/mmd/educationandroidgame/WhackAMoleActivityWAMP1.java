package com.mmd.educationandroidgame;

import com.mmd.educationandroidgame.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;



public class WhackAMoleActivityWAMP1 extends Activity {

 private WhackAMoleViewWAMP1 myWhackAMoleView;
 /** Called when the activity is first created. */
 @Override
 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 requestWindowFeature(Window.FEATURE_NO_TITLE); 
 getWindow().setFlags
(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
WindowManager.LayoutParams.FLAG_FULLSCREEN);
 setContentView(R.layout.whackamolep1_layout); 
 myWhackAMoleView = (WhackAMoleViewWAMP1) 
findViewById(R.id.mole); 
 myWhackAMoleView.setKeepScreenOn(true);
 }
}
