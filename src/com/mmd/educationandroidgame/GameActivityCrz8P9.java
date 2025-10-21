package com.mmd.educationandroidgame;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;



public class GameActivityCrz8P9 extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    GameViewCrz8P9 gviw = new GameViewCrz8P9(this);
    
    setContentView(gviw);
        
  }

}
