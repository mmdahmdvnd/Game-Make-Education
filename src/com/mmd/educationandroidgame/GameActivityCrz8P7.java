package com.mmd.educationandroidgame;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;



public class GameActivityCrz8P7 extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    GameViewCrz8P7 gviw = new GameViewCrz8P7(this);
    
    setContentView(gviw);
        
  }

}
