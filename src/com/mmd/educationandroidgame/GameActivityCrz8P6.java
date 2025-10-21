package com.mmd.educationandroidgame;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;



public class GameActivityCrz8P6 extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    GameViewCrz8P6 gviw = new GameViewCrz8P6(this);
    
    setContentView(gviw);
        
  }

}
