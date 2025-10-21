package com.mmd.educationandroidgame;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;



public class WhackAMoleActivityWAMP4 extends Activity {

 private WhackAMoleViewWAMP4 myWhackAMoleView;
 /** Called when the activity is first created. */
 @Override
 public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 requestWindowFeature(Window.FEATURE_NO_TITLE); 
 getWindow().setFlags
(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
WindowManager.LayoutParams.FLAG_FULLSCREEN);
 setContentView(R.layout.whackamolep4_layout); 
 myWhackAMoleView = (WhackAMoleViewWAMP4) 
findViewById(R.id.mole4); 
 myWhackAMoleView.setKeepScreenOn(true);
 
 setVolumeControlStream(AudioManager.STREAM_MUSIC);
 }
}
